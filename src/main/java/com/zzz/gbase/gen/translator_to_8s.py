# coding: utf-8
# @Time    : 2022/5/6 15:43
# @Author  : wangwei
# @FileName: translator_to_8s.py
import string

import antlr4.tree.Tree
from antlr_parser.PLSQLVisitor import PLSQLVisitor
from antlr_parser.PLSQLParser import PLSQLParser
from antlr4.TokenStreamRewriter import TokenStreamRewriter

class TranslatorTo8s(PLSQLVisitor):

    def __init__(self, tokens, config):
        self.tokens = tokens
        self.config = config
        self.rewriter = TokenStreamRewriter(tokens)
        self.proc_name: str = ""
        self.proc_params: list = []
        self.or_replace: bool = False
        self.declar_sections_without_define: list = []
        self.body: str = ""
        self.cursor_define: dict = {}  # 过程中定义的游标
        self.cursor_define_with_params: dict = {}  # 使用实参替换后的游标实例
        self.list_define = []
        self.type_define: dict = {}  # 定义类型
        self.collection_var = set()  # 集合类型的变量
        self.current_stmt_extend = []  # 当前stmt扩展出来的语句
        self.exception_define: dict = {}

    def build_spl(self):
        proc_params_str = "({})".format(", ".join(self.proc_params))
        declar_sections = "\n".join(self.list_define) + "\n" + "\n".join(self.declar_sections_without_define)
        spl = "CREATE PROCEDURE {proc_name}{proc_params}\n{declar_sections}\n{body}\nEND PROCEDURE;\n".format(
            proc_name=self.proc_name, proc_params=proc_params_str,
            declar_sections=declar_sections, body=self.body)
        if self.or_replace:
            spl = "DROP PROCEDURE IF EXISTS {};\n".format(self.proc_name) + spl
        return spl

    def get_extend_statements(self):
        if len(self.current_stmt_extend) > 0:
            extend_stmts = "\n".join(self.current_stmt_extend) + "\n"
        else:
            extend_stmts = ""
        self.current_stmt_extend = []
        return extend_stmts

    def get_source_str_from_tokens(self, ctx):
        stmt_start_index = ctx.start.tokenIndex
        stmt_end_index = ctx.stop.tokenIndex
        return self.rewriter.getText('default', stmt_start_index, stmt_end_index)

    def visitCreate_procedure(self, ctx: PLSQLParser.Create_procedureContext):
        if ctx.K_REPLACE():
            self.or_replace = True
        self.proc_name = self.visit(ctx.procedure_name())
        self.proc_params = [self.visit(param) for param in ctx.parameter_declaration()]
        if ctx.declare_section():
            self.declar_sections_without_define = self.visit(ctx.declare_section())
        self.body = self.visit(ctx.body())

    def visitProcedure_name(self, ctx: PLSQLParser.Procedure_nameContext) -> str:
        parent = ctx.parentCtx
        print(parent, type(parent))

        return ctx.getText()

    def visitParameter_declaration(self, ctx: PLSQLParser.Parameter_declarationContext) -> str:
        param_name = ctx.parameter_name().getText()
        param_type = self.visit(ctx.datatype())
        return param_name + " " + param_type

    def visitDatatype(self, ctx: PLSQLParser.DatatypeContext):
        if ctx.scalar_datatype():
            return self.visit(ctx.scalar_datatype())
        if ctx.type_attribute():
            return self.visit(ctx.type_attribute())
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitType_attribute(self, ctx: PLSQLParser.Type_attributeContext):
        return "LIKE " + ctx.variable_or_dbobj().getText()

    def visitScalar_datatype(self, ctx: PLSQLParser.Scalar_datatypeContext):
        """进行标量数据类型的翻译"""
        if ctx.K_NUMBER():
            if ctx.size():
                return 'DECIMAL({})'.format(", ".join([c.getText() for c in ctx.size()]))
            else:
                return 'DECIMAL'
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitDeclare_section(self, ctx: PLSQLParser.Declare_sectionContext):
        return self.visit(ctx.item_list())

    def visitBody(self, ctx: PLSQLParser.BodyContext) -> str:
        stmt_str_list = []
        for stmt in ctx.statement():
            stmt_str = self.visit(stmt)
            stmt_str_list.append(stmt_str)
        exception_handler_list = []
        if ctx.exception_handler():
            for handler in ctx.exception_handler():
                handler_stmt = self.visit(handler)
                exception_handler_list.append(handler_stmt)

        return "BEGIN\n{}\n{}\nEND;".format("\n".join(exception_handler_list), "\n".join(stmt_str_list))

    def visitException_handler(self, ctx: PLSQLParser.Exception_handlerContext):
        statements = [self.visit(stmt) for stmt in ctx.statement()]
        if ctx.exception_():
            exceptions = [exception.getText() for exception in ctx.exception_()]
            config = self.config['exception_'].copy()
            config.update(self.exception_define)
            exceptions = [config.get(e, "<code_of_{}>".format(e)) for e in exceptions]     # 再匹配异常配置字典，匹配到的转错误码

            exception_handler = "ON EXCEPTION IN ({})\n{}\nEND EXCEPTION;".format(", ".join(exceptions),
                                                                                  "\n".join(statements))
        else:
            exception_handler = "ON EXCEPTION\n{}\nEND EXCEPTION;".format("\n".join(statements))
        return exception_handler

    def visitItem_list(self, ctx: PLSQLParser.Item_listContext) -> list:
        # list_define = []  # 存放define语句
        list_other = []  # 存放非define语句
        for child in ctx.children:
            before, after = self.visit(child)
            if before != "":
                self.list_define.append(before)
            if after != "":
                list_other.append(after)
        # before_str = "\n".join(list_define)
        # other_str = "\n".join(list_other)
        return list_other

    def visitPragma(self, ctx:PLSQLParser.PragmaContext):
        exception_, error_code = self.visit(ctx.exception_init_pragma())
        self.exception_define[exception_] = error_code
        return "", ""

    def visitException_init_pragma(self, ctx:PLSQLParser.Exception_init_pragmaContext):
        return ctx.exception_().getText(), ctx.error_code().getText()

    def visitItem_declaration(self, ctx: PLSQLParser.Item_declarationContext):
        if ctx.variable_declaration():
            return self.visit(ctx.variable_declaration())
        else:
            return "", ""

    def visitCursor_definition(self, ctx: PLSQLParser.Cursor_definitionContext):
        """游标定义，定义的是静态游标，需转换为spl的foreach cursor for"""
        _cursor_name = ctx.cursor().getText()
        if ctx.cursor_parameter_dec():
            _params = [self.visit(p) for p in ctx.cursor_parameter_dec()]
        else:
            _params = []
        _select_stmt, _from_stmt = self.visit(ctx.select_statement())
        _prepare_select = _select_stmt + " " + _from_stmt
        for _param in _params:
            _prepare_select = _prepare_select.replace(_param, '?')
        prepare_stmt = 'PREPARE {stmt} FROM "{p_select}";'.format(stmt='pre_' + _cursor_name, p_select=_prepare_select)
        declar_cursor_stmt = "DECLARE {cursor_name} CURSOR FOR {stmt};".format(cursor_name=_cursor_name,stmt='pre_' + _cursor_name)
        self.cursor_define[_cursor_name] = {"params":_params,
                                            "select": _select_stmt,
                                            "from": _from_stmt,
                                            "prepare": prepare_stmt,
                                            "declare": declar_cursor_stmt}
        # _select_stmt = _select_stmt + " " + _from_stmt

        # prepare_select = _select_stmt
        # prepare_stmt = 'PREPARE {stmt} FROM "{p_select}";'.format(stmt='pre_' + _cursor_name, p_select=prepare_select)
        # declar_cursor_stmt = "DECLARE {cursor_name} CURSOR FOR {stmt};".format(cursor_name=_cursor_name,
        #                                                                        stmt='pre_' + _cursor_name)

        # cursor_define_stmt = prepare_stmt + "\n" + declar_cursor_stmt
        # logging.debug(cursor_define_stmt)
        # return "", cursor_define_stmt
        return "", ""

    def visitType_definition(self, ctx: PLSQLParser.Type_definitionContext):
        """TODO: 涉及集合类型、记录类型和动态游标类型的定义，8s应如何改写"""
        self.visit(ctx.getChild(0))
        return "", ""

    def visitRecord_type_definition(self, ctx: PLSQLParser.Record_type_definitionContext):
        """
        :param ctx:
        :return: {"type":"record", "define": [(a, int), (b, varchar(100))]}
        """
        type_name = ctx.record_type().getText()
        type_define = [self.visit(f_d) for f_d in ctx.field_definition()]
        self.type_define[type_name] = {"type": "record", "define": type_define}

    def visitCollection_type_definition(self, ctx: PLSQLParser.Collection_type_definitionContext):
        type_name = ctx.collection_type().getText()
        type_define = self.visit(ctx.assoc_array_type_def())
        self.type_define[type_name] = {"type": "table", "define": type_define}

    def visitAssoc_array_type_def(self, ctx: PLSQLParser.Assoc_array_type_defContext):
        return self.visit(ctx.datatype())

    def visitField_definition(self, ctx: PLSQLParser.Field_definitionContext):
        return ctx.field().getText(), self.visit(ctx.datatype())

    def visitSelect_statement(self, ctx: PLSQLParser.Select_statementContext):
        return self.visit(ctx.select_clause()), self.visit(ctx.from_clause())

    def visitSelect_clause(self, ctx: PLSQLParser.Select_clauseContext):
        return self.get_source_str_from_tokens(ctx)

    def visitFrom_clause(self, ctx: PLSQLParser.From_clauseContext):
        return self.get_source_str_from_tokens(ctx)

    def visitCursor_parameter_dec(self, ctx: PLSQLParser.Cursor_parameter_decContext):
        return ctx.parameter_name().getText()

    def visitVariable_declaration(self, ctx: PLSQLParser.Variable_declarationContext):
        """将变量声明处理成define和let两个字符串，如果没有赋初值，let字符串为空字符串"""
        var_name = ctx.variable().getText()
        var_datatype = self.visit(ctx.datatype())
        var_assign_str = ""
        define_extend = ""
        if var_datatype in self.type_define:
            if self.type_define[var_datatype]['type'] == 'record':
                _value = "ROW({})".format(
                    ", ".join(["NULL::" + field[1] for field in self.type_define[var_datatype]['define']]))
                var_assign_str = "LET {name} = {value};".format(name=var_name, value=_value)
                var_datatype = "ROW({})".format(
                    ", ".join(list(map(lambda field: " ".join(field), self.type_define[var_datatype]['define']))))
            elif self.type_define[var_datatype]['type'] == 'table':
                self.collection_var.add(var_name)
                define_extend = "\nDEFINE member_of_{} {};".format(var_name, self.type_define[var_datatype]['define'])
                var_datatype = "LIST({} NOT NULL)".format(self.type_define[var_datatype]['define'])

        var_declar_str = "DEFINE {name} {datatype};{define_extend}".format(name=var_name, datatype=var_datatype,
                                                                           define_extend=define_extend)
        if ctx.expression():
            var_assign_str = "LET {name} = {expr};".format(name=var_name, expr=self.visit(ctx.expression()))
        return var_declar_str, var_assign_str

    def visitStatement(self, ctx: PLSQLParser.StatementContext):
        if ctx.label():
            labels = ["<<{}>>\n".format(_ctx.getText()) for _ctx in ctx.label()]
            label_str = "\n".join(labels)
        else:
            label_str = ""

        if ctx.plsql_block():
            plsql_block = self.visit(ctx.plsql_block())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + plsql_block
        if ctx.if_statement():
            if_statement = self.visit(ctx.if_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + if_statement
        if ctx.assignment_statement():
            assignment_statement = self.visit(ctx.assignment_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + assignment_statement
        if ctx.open_statement():  # 如果是打开游标语句
            assignment_statement = self.visit(ctx.open_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + assignment_statement
        if ctx.fetch_statement():
            assignment_statement = self.visit(ctx.fetch_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + assignment_statement
        if ctx.basic_loop_statement():
            basic_loop_statement = self.visit(ctx.basic_loop_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + basic_loop_statement
        if ctx.exit_statement():
            exit_statement = self.visit(ctx.exit_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + exit_statement
        if ctx.close_statement():
            return label_str + self.visit(ctx.close_statement())
        if ctx.procedure_call():
            proc_call = self.visit(ctx.procedure_call())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + proc_call
        if ctx.while_loop_statement():
            while_loop_statement = self.visit(ctx.while_loop_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + while_loop_statement
        if ctx.for_loop_statement():
            for_loop_statement = self.visit(ctx.for_loop_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + for_loop_statement
        if ctx.continue_statement():
            continue_statement = self.visit(ctx.continue_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + continue_statement
        if ctx.cursor_for_loop_statement():
            cursor_for_loop_statement = self.visit(ctx.cursor_for_loop_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + cursor_for_loop_statement
        if ctx.sql_statement():
            sql_statement = self.visit(ctx.sql_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + sql_statement
        if ctx.raise_statement():
            raise_statement = self.visit(ctx.raise_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + raise_statement
        if ctx.open_for_statement():
            open_for_statement = self.visit(ctx.open_for_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + open_for_statement
        if ctx.case_statement():
            case_statement = self.visit(ctx.case_statement())
            extend_stmts = self.get_extend_statements()
            return label_str + extend_stmts + case_statement
        else:
            return label_str + self.get_source_str_from_tokens(ctx)

    def visitOpen_for_statement(self, ctx:PLSQLParser.Open_for_statementContext):
        prepare_select = ""
        if ctx.select_statement():
            prepare_select = '"{}"'.format(self.get_source_str_from_tokens(ctx.select_statement()))
        elif ctx.dynamic_select():
            prepare_select = '{}'.format(self.get_source_str_from_tokens(ctx.dynamic_select()))
        _cursor_name = ctx.cursor_variable().getText()
        prepare_stmt = 'PREPARE {stmt} FROM {p_select};'.format(stmt='pre_' + _cursor_name, p_select=prepare_select)
        declar_cursor_stmt = "DECLARE {cursor_name} CURSOR FOR {stmt};".format(cursor_name=_cursor_name,
                                                                               stmt='pre_' + _cursor_name)

        self.declar_sections_without_define.extend([prepare_stmt, declar_cursor_stmt])
        open_for_stmt = "OPEN {};".format(_cursor_name)
        return open_for_stmt

    def visitCase_statement(self, ctx:PLSQLParser.Case_statementContext):
        return self.visit(ctx.getChild(0))

    def visitSimple_case_statement(self, ctx:PLSQLParser.Simple_case_statementContext):
        selector = self.visit(ctx.selector())
        selector_values = [self.visit(selector_value) for selector_value in ctx.selector_value()]
        statements = [self.visit(statement) for statement in ctx.statement()]
        _whenstmt = '\n'.join([f'WHNE {_sv} THEN\n {_st}' for _sv, _st in zip(selector_values, statements)])
        if ctx.K_ELSE():
            _stmts = '\n'.join([stmt for stmt in statements[len(selector_values):]])
            _elsestmt = f'ELSE\n {_stmts}\n'
        else:
            _elsestmt = ''
        return f'CASE {selector}\n{_whenstmt}\n{_elsestmt} END CASE ;'

    def visitSearched_case_statement(self, ctx:PLSQLParser.Searched_case_statementContext):
        boolean_expressions = [self.visit(boolean_expression) for boolean_expression in ctx.boolean_expression()]
        statements = [self.visit(statement) for statement in ctx.statement()]
        if len(boolean_expressions) > 1:
            _elifstmt = "\n".join([f'ELIF {_b} THEN\n {_s}\n' for _b,_s in zip(boolean_expressions[1:], statements[1:])])
        else:
            _elifstmt = ''
        _ifstmt = 'IF {} THEN\n {}\n {}'.format(boolean_expressions[0], statements[0], _elifstmt)
        if ctx.K_ELSE():
            _stmts = '\n'.join([stmt for stmt in statements[len(boolean_expressions):]])
            _elsestmt = f'ELSE {_stmts}\n'
        else:
            _elsestmt = ''
        return f'{_ifstmt} {_elsestmt} END IF'


    def visitSelector(self, ctx:PLSQLParser.SelectorContext):
        return self.visit(ctx.expression())

    def visitSelector_value(self, ctx:PLSQLParser.Selector_valueContext):
        return self.visit(ctx.expression())

    def visitRaise_statement(self, ctx:PLSQLParser.Raise_statementContext):
        e = ctx.exception_().getText()
        e = self.exception_define.get(e, e)
        config = self.config['exception_']
        e = config.get(e, "<code_of_{}>".format(e))
        raise_stmt = "RAISE EXCEPTION {};".format(e)
        return raise_stmt

    def visitSql_statement(self, ctx:PLSQLParser.Sql_statementContext):
        if ctx.commit_statement():
            return ""
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitCursor_for_loop_statement(self, ctx: PLSQLParser.Cursor_for_loop_statementContext):
        """这是静态游标的用法，对应SPL的foreach cursor for """
        record = ctx.record().getText()
        self.list_define.append("DEFIND {} ROW(a int, b varchar(100)); -- plsql中的record类型，需根据实际场景转换为ROW定义".format(record))
        self.declar_sections_without_define.append("LET {} = ROW(NULL::int, NULL:: varchar(100)); -- "
                                                   "plsql中的record类型，需根据实际场景转换为ROW定义".format(record))
        stmt_str_list = []
        for stmt in ctx.statement():
            stmt_str = self.visit(stmt)
            stmt_str_list.append(stmt_str)
        stmts = "\n".join(stmt_str_list)
        if ctx.label():
            label = ctx.label().getText()
        else:
            label = ""
        if ctx.cursor():
            print(self.cursor_define)
            _cursor_name = ctx.cursor().getText()
            _cursor_info = self.cursor_define.get(_cursor_name)
            _cursor_params = _cursor_info["params"]
            _select_stmt = _cursor_info["select"]
            _from_stmt = _cursor_info["from"]
            if ctx.parameter():
                _act_params = [expr.getText() for expr in ctx.parameter()]
            else:
                _act_params = []
            for i, _act_p in enumerate(_act_params):  # 形参替换为实参
                _select_stmt = _select_stmt.replace(_cursor_params[i], _act_p)
                _from_stmt = _from_stmt.replace(_cursor_params[i], _act_p)
            self.cursor_define_with_params[_cursor_name] = {'select': _select_stmt, 'from': _from_stmt}
            print(self.cursor_define_with_params)
            # if len(_act_params) == 0:
            #     _open_stmt = "OPEN {cursor_name};".format(cursor_name=_cursor_name)
            # else:
            #     _open_stmt = "OPEN {cursor_name} USING {params};".format(cursor_name=_cursor_name,
            #                                                              params=", ".join(_act_params))
            _select_into_stmt = _select_stmt + " INTO {} ".format(record) + _from_stmt
            # exit_stmt = "EXIT WHEN SQLCODE == 100;"
            # fetch_stmt = "LOOP\nFETCH {} INTO {};\n{}\n{}\nEND LOOP {};".format(_cursor_name, record, exit_stmt, stmts,
            #                                                                     label)
            # _close_stmt = "CLOSE {};".format(_cursor_name)
            # stmt = "\n".join([_open_stmt, fetch_stmt, _close_stmt])
            desc = "-- 下边的select..into子句的recored变量需分解为row的每个字段"
            stmt = "{}\nFOREACH {} FOR {}\n{}\nEND FOREACH;".format(desc, _cursor_name, _select_into_stmt, stmts)
        else:
            _select_stmt, _from_stmt = self.visit(ctx.select_statement())
            _select_stmt = _select_stmt + " into {}".format(record) + " " + _from_stmt
            stmt = "FOREACH {}\n{}\nEND FOREACH; ".format(_select_stmt, stmts)
        return "BEGIN WORK;\n" + stmt + "\nCOMMIT;"

    def visitContinue_statement(self, ctx: PLSQLParser.Continue_statementContext):
        if ctx.K_WHEN():
            if_str = "IF {bool_str} THEN\n".format(bool_str=self.visit(ctx.boolean_expression())) \
                     + "{k_continue}\nEND IF;"
        else:
            if_str = "{k_continue}"
        continue_stmt = if_str.format(k_continue="CONTINUE;")  # 8s的continue语句不支持label
        logging.debug(continue_stmt)
        return continue_stmt

    def visitFor_loop_statement(self, ctx: PLSQLParser.For_loop_statementContext):
        index = ctx.index().getText()
        self.list_define.append("DEFINE {} INTEGER;".format(index))
        if not ctx.K_REVERSE():
            lower_bound, upper_bound = ctx.lower_bound().getText(), ctx.upper_bound().getText()
        else:
            lower_bound, upper_bound = ctx.upper_bound().getText(), ctx.lower_bound().getText()
        stmt_str = "\n".join([self.visit(stmt) for stmt in ctx.statement()])
        if ctx.label():
            label = ctx.label().getText()
        else:
            label = ""
        for_loop_stmt = "FOR {} IN({} TO {}) LOOP\n{}\nEND LOOP {};".format(index, lower_bound, upper_bound, stmt_str,
                                                                            label)
        logging.debug(for_loop_stmt)
        return for_loop_stmt

    def visitWhile_loop_statement(self, ctx: PLSQLParser.While_loop_statementContext):
        bool_expr_str = self.visit(ctx.boolean_expression())
        stmt_str = "\n".join([self.visit(stmt) for stmt in ctx.statement()])
        if ctx.label():
            label = ctx.label().getText()
        else:
            label = ""
        while_stmt = "WHILE {} LOOP\n{}\nEND LOOP {};".format(bool_expr_str, stmt_str, label)
        logging.debug(while_stmt)
        return while_stmt

    def visitProcedure_call(self, ctx: PLSQLParser.Procedure_callContext):
        proc_name = ctx.procedure().getText()
        config = self.config.get('procedure')
        if proc_name.lower() in config:
            proc_name = config.get(proc_name.lower())
        params = [self.visit(param) for param in ctx.parameter()]
        params_str = ", ".join(params)
        if proc_name.upper() != 'RAISE_APPLICATION_ERROR':
            return "CALL {}({});".format(proc_name, params_str)
        else:
            return "RAISE EXCEPTION {}, 0, {};".format(params[0], params[1])

    def visitParameter(self, ctx: PLSQLParser.ParameterContext):
        if ctx.STAR():
            return '*'
        else:
            return self.visit(ctx.expression())

    def visitOpen_statement(self, ctx: PLSQLParser.Open_statementContext):
        """打开游标子句, 打开的是静态游标"""
        _cursor_name = ctx.cursor().getText()
        _cursor_info = self.cursor_define.get(_cursor_name)
        self.declar_sections_without_define.extend([_cursor_info['prepare'], _cursor_info['declare']])
        # _cursor_info = self.cursor_define.get(_cursor_name)
        # _cursor_params = _cursor_info["params"]
        # _select_stmt = _cursor_info["select"]
        # _from_stmt = _cursor_info["from"]
        if ctx.parameter():
            _act_params = [expr.getText() for expr in ctx.parameter()]
        else:
            _act_params = []
        # for i, _act_p in enumerate(_act_params):    # 形参替换为实参
        #     _select_stmt = _select_stmt.replace(_cursor_params[i], _act_p)
        #     _from_stmt = _from_stmt.replace(_cursor_params[i], _act_p)
        # self.cursor_define_with_params[_cursor_name] = {'select': _select_stmt, 'from': _from_stmt}
        if len(_act_params) == 0:
            _open_stmt = "OPEN {cursor_name};".format(cursor_name=_cursor_name)
        else:
            _open_stmt = "OPEN {cursor_name} USING {params};".format(cursor_name=_cursor_name,
                                                                     params=", ".join(_act_params))
        # logging.debug(_open_stmt)
        return _open_stmt

    def visitClose_statement(self, ctx: PLSQLParser.Close_statementContext):
        cursor_name = ctx.cursor().getText()
        close_stmt = "CLOSE {};".format(cursor_name)
        logging.debug(close_stmt)
        return close_stmt

    def visitBasic_loop_statement(self, ctx: PLSQLParser.Basic_loop_statementContext):
        stmts = []
        for stmt in ctx.statement():
            stmt_str = self.visit(stmt)
            stmts.append(stmt_str)
        loop_stmt = "LOOP\n{}\nEND LOOP;".format("\n".join(stmts))
        return loop_stmt

    def visitFetch_statement(self, ctx: PLSQLParser.Fetch_statementContext):
        fetch_stmt = self.get_source_str_from_tokens(ctx)
        logging.debug(fetch_stmt)
        # _cursor_name = ctx.cursor().getText()
        # _into_stmt = self.get_source_str_from_tokens(ctx.into_clause())
        # _select_stmt = self.cursor_define_with_params[_cursor_name]['select']
        # _from_stmt = self.cursor_define_with_params[_cursor_name]['from']


        return fetch_stmt

    def visitExit_statement(self, ctx: PLSQLParser.Exit_statementContext):
        bool_stmt = self.visit(ctx.boolean_expression())
        exit_stmt = "EXIT WHEN {};".format(bool_stmt)
        logging.debug(exit_stmt)
        return exit_stmt

    def visitInto_clause(self, ctx: PLSQLParser.Into_clauseContext):
        return self.get_source_str_from_tokens(ctx)

    def visitPlsql_block(self, ctx: PLSQLParser.Plsql_blockContext):
        if ctx.declare_section():
            declar_section_str = "\n".join(self.visit(ctx.declare_section()))
        else:
            declar_section_str = ''
        body_str = self.visit(ctx.body())
        return declar_section_str + "\n" + body_str

    def visitIf_statement(self, ctx: PLSQLParser.If_statementContext):
        stmt_str = ""
        for child in ctx.children:
            if isinstance(child, PLSQLParser.StatementContext):
                stmt_str += "\n" + self.visit(child) + "\n"
            elif isinstance(child, antlr4.tree.Tree.TerminalNodeImpl):
                keyword = child.getText()
                if keyword.upper() == 'ELSIF':
                    keyword = 'ELIF'
                stmt_str += keyword + " "
            else:
                stmt_str += self.visit(child) + " "
        logging.debug(stmt_str)
        return stmt_str

    def visitAssignment_statement(self, ctx: PLSQLParser.Assignment_statementContext):
        stmt_temp = self.visit(ctx.assignment_statement_target())
        expr = self.visit(ctx.expression())
        return stmt_temp.safe_substitute({'expr': expr})

    def visitAssignment_statement_target(self, ctx: PLSQLParser.Assignment_statement_targetContext):
        if ctx.variable_or_dbobj():
            return string.Template("LET {} = $expr;".format(ctx.variable_or_dbobj().getText()))
        elif ctx.collection_variable():
            return string.Template("INSERT AT {} INTO TABLE({}) VALUES($expr);".format(ctx.collection_index().getText(),
                                                                                       ctx.collection_variable().getText()))

    def visitBoolean_expression(self, ctx: PLSQLParser.Boolean_expressionContext):
        return self.visit(ctx.expression())

    def visitExprConstant(self, ctx: PLSQLParser.ExprConstantContext):
        return self.get_source_str_from_tokens(ctx.builtin_constant())

    def visitExprVarible(self, ctx: PLSQLParser.ExprVaribleContext):
        return self.get_source_str_from_tokens(ctx.variable_or_dbobj())

    def visitExprLiteral(self, ctx: PLSQLParser.ExprLiteralContext):
        return self.get_source_str_from_tokens(ctx.literal())

    def visitExprFunction(self, ctx: PLSQLParser.ExprFunctionContext):
        return self.visit(ctx.function_call())

    def visitExprParen(self, ctx: PLSQLParser.ExprParenContext):
        return self.visit(ctx.expression())

    def visitExprBinary(self, ctx: PLSQLParser.ExprBinaryContext):
        return self.visit(ctx.expression(0)) + ctx.binaryOperators().getText() + self.visit(ctx.expression(1))

    def visitExprRelation(self, ctx: PLSQLParser.ExprRelationContext):
        return self.visit(ctx.expression(0)) + ctx.relationOperator().getText() + self.visit(ctx.expression(1))

    def visitExprBetween(self, ctx: PLSQLParser.ExprBetweenContext):
        if ctx.K_NOT():
            return "{} NOT BETWEEN {} AND {}".format(self.visit(ctx.expression(0)),
                                                     self.visit(ctx.expression(1)),
                                                     self.visit(ctx.expression(2)))
        else:
            return "{} BETWEEN {} AND {}".format(self.visit(ctx.expression(0)),
                                                 self.visit(ctx.expression(1)),
                                                 self.visit(ctx.expression(2)))

    def visitExprIs(self, ctx: PLSQLParser.ExprIsContext):
        if ctx.K_NOT():
            return "{} IS NOT NULL".format(self.visit(ctx.expression()))
        else:
            return "{} IS NULL".format(self.visit(ctx.expression()))

    def visitExprAndOr(self, ctx: PLSQLParser.ExprAndOrContext):
        if ctx.K_AND():
            return "{} AND {}".format(self.visit(ctx.expression(0)), self.visit(ctx.expression(1)))
        else:
            return "{} OR {}".format(self.visit(ctx.expression(0)), self.visit(ctx.expression(1)))

    def visitExprCase(self, ctx: PLSQLParser.ExprCaseContext):
        return self.visit(ctx.case_expression())

    def visitExprCursor(self, ctx: PLSQLParser.ExprCursorContext):
        return self.visit(ctx.cursor_attribute())

    def visitExprNot(self, ctx:PLSQLParser.ExprNotContext):
        return 'not {}'.format(self.visit(ctx.expression()))

    def visitExprUnaryOp(self, ctx:PLSQLParser.ExprUnaryOpContext):
        return self.visit(ctx.unaryOp())

    def visitUnaryOp(self, ctx:PLSQLParser.UnaryOpContext):
        # return ctx.op.text() + self.visit(ctx.expression())
        return ctx.op.text + self.visit(ctx.expression())

    def visitFunction_call(self, ctx: PLSQLParser.Function_callContext):
        _name = ctx.function().getText()
        if _name in self.collection_var:
            expr = "member_of_{}".format(_name)
            self.current_stmt_extend.append("SELECT SKIP {} FIRST 1 * INTO {} FROM TABLE({});".format(
                self.visit(ctx.parameter(0)), expr, _name
            ))
            return expr
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitCase_expression(self, ctx: PLSQLParser.Case_expressionContext):
        return self.get_source_str_from_tokens(ctx)

    def visitLiteral(self, ctx: PLSQLParser.LiteralContext):
        if ctx.boolean_literal():
            return self.visit(ctx.boolean_literal())
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitBoolean_literal(self, ctx: PLSQLParser.Boolean_literalContext):
        if ctx.K_TRUE():
            return "'t'"
        if ctx.K_FALSE():
            return "'f'"
        else:
            return ctx.getText()

    def visitCursor_attribute(self, ctx: PLSQLParser.Cursor_attributeContext):
        attr_name = self.visit(ctx.cursor_attribute_name())
        if attr_name.upper() == "NOTFOUND":
            return "SQLCODE == 100"
        elif attr_name.upper() == "FOUND":
            return "SQLCODE != 100"
        else:
            return self.get_source_str_from_tokens(ctx)

    def visitCursor_attribute_name(self, ctx: PLSQLParser.Cursor_attribute_nameContext):
        attr_name = ctx.getText()
        logging.debug(attr_name)
        return attr_name
