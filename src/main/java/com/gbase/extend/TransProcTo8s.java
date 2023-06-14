package com.gbase.extend;

import com.gbase.gen.PLSQLBaseVisitor;
import com.gbase.gen.PLSQLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: Zzz
 * @date: 2023/6/13 16:54
 * @description:
 */
public class TransProcTo8s extends PLSQLBaseVisitor<String>{

    private boolean or_replace = false;
    private String proc_name = "";
    private final List<String> proc_params = new ArrayList<>();
    private final List<String> declar_sections_without_define = new ArrayList<>();
    private final List<String> listDefine = new ArrayList<>();

    private String body = "";
    private TokenStreamRewriter tokenStreamRewriter = null;

    private final Map<String, Map<String, Object>> typeDefine = new HashMap<>(); // 定义类型
    private final Set<String> collectionVar = new HashSet<>(); // 定义集合


    public TransProcTo8s(TokenStream tokens) {
        this.tokenStreamRewriter = new TokenStreamRewriter(tokens);
    }

    private String getSourceStrFromTokens(ParserRuleContext ctx) {
        int startIndex = ctx.start.getTokenIndex();
        int stopIndex = ctx.stop.getTokenIndex();
        //"default" 表示使用默认的文本重写规则，即不进行任何文本重写。
        return tokenStreamRewriter.getText("default",new Interval(startIndex,stopIndex));
    }


    public String buildSPL() {
        String procParamsStr = "(" + String.join(", ", this.proc_params) + ")";
        String declarSections = String.join("\n", this.listDefine) + "\n" + String.join("\n", this.declar_sections_without_define);
        String spl = "CREATE PROCEDURE " + this.proc_name + procParamsStr + "\n" + declarSections + "\n" + this.body + "\nEND PROCEDURE;\n";
        if (this.or_replace) {
            spl = "DROP PROCEDURE IF EXISTS " + this.proc_name + ";\n" + spl;
        }
        return spl;
    }

    @Override
    public String visitPlsql_file(PLSQLParser.Plsql_fileContext ctx) {
        return super.visitPlsql_file(ctx);
    }

    @Override
    public String visitCreate_procedure(PLSQLParser.Create_procedureContext ctx) {
        if (ctx.K_REPLACE() != null){
            this.or_replace = true;
        }
        //获取存储过程名称
        this.proc_name = visit(ctx.procedure_name());

        for (PLSQLParser.Parameter_declarationContext param : ctx.parameter_declaration()) {
            this.proc_params.add(visit(param));
        }

        if (ctx.declare_section() != null) {
            this.declar_sections_without_define.add(visit(ctx.declare_section()));
        }

        this.body = this.visit(ctx.body());
        return super.visitCreate_procedure(ctx);
    }

    @Override
    public String visitSchema(PLSQLParser.SchemaContext ctx) {
        return super.visitSchema(ctx);
    }

    /**
     * 访问存储过程名称
     * @param ctx Procedure_nameContext
     * @return 存储过程名称
     */
    @Override
    public String visitProcedure_name(PLSQLParser.Procedure_nameContext ctx) {
        return ctx.getText();
    }

    /**
     * 访问入参声明 (gbase8s中没有 in/out)
     * @param ctx Parameter_declarationContext
     * @return 入参声明
     */
    @Override
    public String visitParameter_declaration(PLSQLParser.Parameter_declarationContext ctx) {
        String param_name = ctx.parameter_name().getText();
        String param_type = visit(ctx.datatype());
        return param_name + " " + param_type;
    }

    @Override
    public String visitParameter_name(PLSQLParser.Parameter_nameContext ctx) {
        return super.visitParameter_name(ctx);
    }

    @Override
    public String visitParameter(PLSQLParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public String visitDeclare_section(PLSQLParser.Declare_sectionContext ctx) {
        return visit(ctx.item_list());
    }

    @Override
    public String visitItem_list(PLSQLParser.Item_listContext ctx) {

        List<String> list_other = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            String visit = visit(child);

            list_other.add(child.getText());

        }
        List<PLSQLParser.Item_declarationContext> item_declarationContexts = ctx.item_declaration();

        return null;
    }

    /**
     * 参数声明
     * @param ctx Item_declarationContext
     * @return  参数声明
     */
    @Override
    public String visitItem_declaration(PLSQLParser.Item_declarationContext ctx) {
        if (ctx.variable_declaration() != null){
            return visit(ctx.variable_declaration());
        }else{
            return "";
        }
    }

    @Override
    public String visitType_definition(PLSQLParser.Type_definitionContext ctx) {
        return super.visitType_definition(ctx);
    }

    @Override
    public String visitException_declaration(PLSQLParser.Exception_declarationContext ctx) {
        return super.visitException_declaration(ctx);
    }

    @Override
    public String visitPragma(PLSQLParser.PragmaContext ctx) {
        return super.visitPragma(ctx);
    }

    @Override
    public String visitException_init_pragma(PLSQLParser.Exception_init_pragmaContext ctx) {
        return super.visitException_init_pragma(ctx);
    }

    @Override
    public String visitError_code(PLSQLParser.Error_codeContext ctx) {
        return super.visitError_code(ctx);
    }

    @Override
    public String visitCursor_declaration(PLSQLParser.Cursor_declarationContext ctx) {
        return super.visitCursor_declaration(ctx);
    }

    @Override
    public String visitCursor_definition(PLSQLParser.Cursor_definitionContext ctx) {
        return super.visitCursor_definition(ctx);
    }

    @Override
    public String visitCursor_parameter_dec(PLSQLParser.Cursor_parameter_decContext ctx) {
        return super.visitCursor_parameter_dec(ctx);
    }

    @Override
    public String visitRowtype(PLSQLParser.RowtypeContext ctx) {
        return super.visitRowtype(ctx);
    }

    @Override
    public String visitRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx) {
        System.out.println("---");
        return super.visitRecord_type_definition(ctx);
    }

    @Override
    public String visitRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx) {
        return super.visitRef_cursor_type_definition(ctx);
    }

    @Override
    public String visitCursor_type(PLSQLParser.Cursor_typeContext ctx) {
        return super.visitCursor_type(ctx);
    }

    @Override
    public String visitCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx) {
        return super.visitCollection_type_definition(ctx);
    }

    @Override
    public String visitAssoc_array_type_def(PLSQLParser.Assoc_array_type_defContext ctx) {
        return super.visitAssoc_array_type_def(ctx);
    }

    @Override
    public String visitField_definition(PLSQLParser.Field_definitionContext ctx) {
        return super.visitField_definition(ctx);
    }

    @Override
    public String visitRecord_type(PLSQLParser.Record_typeContext ctx) {
        return super.visitRecord_type(ctx);
    }

    @Override
    public String visitConstant_declaration(PLSQLParser.Constant_declarationContext ctx) {
        return super.visitConstant_declaration(ctx);
    }

    @Override
    public String visitBody(PLSQLParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public String visitException_handler(PLSQLParser.Exception_handlerContext ctx) {
        return super.visitException_handler(ctx);
    }

    @Override
    public String visitWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx) {
        return super.visitWhile_loop_statement(ctx);
    }

    @Override
    public String visitExprIs(PLSQLParser.ExprIsContext ctx) {
        return super.visitExprIs(ctx);
    }

    @Override
    public String visitExprBinary(PLSQLParser.ExprBinaryContext ctx) {
        return super.visitExprBinary(ctx);
    }

    @Override
    public String visitExprParen(PLSQLParser.ExprParenContext ctx) {
        return super.visitExprParen(ctx);
    }

    @Override
    public String visitExprBetween(PLSQLParser.ExprBetweenContext ctx) {
        return super.visitExprBetween(ctx);
    }

    @Override
    public String visitExprFunction(PLSQLParser.ExprFunctionContext ctx) {
        return super.visitExprFunction(ctx);
    }

    @Override
    public String visitExprCase(PLSQLParser.ExprCaseContext ctx) {
        return super.visitExprCase(ctx);
    }

    @Override
    public String visitExprVarible(PLSQLParser.ExprVaribleContext ctx) {
        return super.visitExprVarible(ctx);
    }

    @Override
    public String visitExprLiteral(PLSQLParser.ExprLiteralContext ctx) {
        return super.visitExprLiteral(ctx);
    }

    @Override
    public String visitExprConstant(PLSQLParser.ExprConstantContext ctx) {
        return super.visitExprConstant(ctx);
    }

    @Override
    public String visitExprAndOr(PLSQLParser.ExprAndOrContext ctx) {
        return super.visitExprAndOr(ctx);
    }

    @Override
    public String visitExprCursor(PLSQLParser.ExprCursorContext ctx) {
        return super.visitExprCursor(ctx);
    }

    @Override
    public String visitExprRelation(PLSQLParser.ExprRelationContext ctx) {
        return super.visitExprRelation(ctx);
    }

    @Override
    public String visitCursor_attribute(PLSQLParser.Cursor_attributeContext ctx) {
        return super.visitCursor_attribute(ctx);
    }

    @Override
    public String visitCursor_attribute_name(PLSQLParser.Cursor_attribute_nameContext ctx) {
        return super.visitCursor_attribute_name(ctx);
    }

    @Override
    public String visitBuiltin_constant(PLSQLParser.Builtin_constantContext ctx) {
        return super.visitBuiltin_constant(ctx);
    }

    @Override
    public String visitCase_expression(PLSQLParser.Case_expressionContext ctx) {
        return super.visitCase_expression(ctx);
    }

    @Override
    public String visitBinaryOperators(PLSQLParser.BinaryOperatorsContext ctx) {
        return super.visitBinaryOperators(ctx);
    }

    @Override
    public String visitVariable_or_dbobj(PLSQLParser.Variable_or_dbobjContext ctx) {
        return super.visitVariable_or_dbobj(ctx);
    }

    @Override
    public String visitBoolean_expression(PLSQLParser.Boolean_expressionContext ctx) {
        return super.visitBoolean_expression(ctx);
    }

    @Override
    public String visitBoolean_literal(PLSQLParser.Boolean_literalContext ctx) {
        return super.visitBoolean_literal(ctx);
    }

    @Override
    public String visitFunction_call(PLSQLParser.Function_callContext ctx) {
        return super.visitFunction_call(ctx);
    }

    @Override
    public String visitIndex(PLSQLParser.IndexContext ctx) {
        return super.visitIndex(ctx);
    }

    @Override
    public String visitCharacter_expression(PLSQLParser.Character_expressionContext ctx) {
        return super.visitCharacter_expression(ctx);
    }

    @Override
    public String visitCharacter_subexpression(PLSQLParser.Character_subexpressionContext ctx) {
        return super.visitCharacter_subexpression(ctx);
    }

    @Override
    public String visitCharacter_function_call(PLSQLParser.Character_function_callContext ctx) {
        return super.visitCharacter_function_call(ctx);
    }

    @Override
    public String visitCharacter_literal(PLSQLParser.Character_literalContext ctx) {
        return super.visitCharacter_literal(ctx);
    }

    @Override
    public String visitDate_literal(PLSQLParser.Date_literalContext ctx) {
        return super.visitDate_literal(ctx);
    }

    @Override
    public String visitNumeric_expression(PLSQLParser.Numeric_expressionContext ctx) {
        return super.visitNumeric_expression(ctx);
    }

    @Override
    public String visitNumeric_subexpression(PLSQLParser.Numeric_subexpressionContext ctx) {
        return super.visitNumeric_subexpression(ctx);
    }

    @Override
    public String visitNumeric_function_call(PLSQLParser.Numeric_function_callContext ctx) {
        return super.visitNumeric_function_call(ctx);
    }

    @Override
    public String visitNumeric_literal(PLSQLParser.Numeric_literalContext ctx) {
        return super.visitNumeric_literal(ctx);
    }

    @Override
    public String visitSearched_case_expression(PLSQLParser.Searched_case_expressionContext ctx) {
        return super.visitSearched_case_expression(ctx);
    }

    @Override
    public String visitResult(PLSQLParser.ResultContext ctx) {
        return super.visitResult(ctx);
    }

    @Override
    public String visitSimple_case_expression(PLSQLParser.Simple_case_expressionContext ctx) {
        return super.visitSimple_case_expression(ctx);
    }

    @Override
    public String visitSelector(PLSQLParser.SelectorContext ctx) {
        return super.visitSelector(ctx);
    }

    @Override
    public String visitSelector_value(PLSQLParser.Selector_valueContext ctx) {
        return super.visitSelector_value(ctx);
    }

    @Override
    public String visitLiteral(PLSQLParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public String visitSelect_clause(PLSQLParser.Select_clauseContext ctx) {
        return super.visitSelect_clause(ctx);
    }

    @Override
    public String visitFrom_clause(PLSQLParser.From_clauseContext ctx) {
        return super.visitFrom_clause(ctx);
    }

    @Override
    public String visitCondition(PLSQLParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public String visitInCondition(PLSQLParser.InConditionContext ctx) {
        return super.visitInCondition(ctx);
    }

    @Override
    public String visitRelationOperator(PLSQLParser.RelationOperatorContext ctx) {
        return super.visitRelationOperator(ctx);
    }

    @Override
    public String visitColumnExpression(PLSQLParser.ColumnExpressionContext ctx) {
        return super.visitColumnExpression(ctx);
    }

    @Override
    public String visitStatement(PLSQLParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public String visitAssignment_statement(PLSQLParser.Assignment_statementContext ctx) {
        return super.visitAssignment_statement(ctx);
    }

    @Override
    public String visitAssignment_statement_target(PLSQLParser.Assignment_statement_targetContext ctx) {
        return super.visitAssignment_statement_target(ctx);
    }

    @Override
    public String visitCollection_index(PLSQLParser.Collection_indexContext ctx) {
        return super.visitCollection_index(ctx);
    }

    @Override
    public String visitBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx) {
        return super.visitBasic_loop_statement(ctx);
    }

    @Override
    public String visitCase_statement(PLSQLParser.Case_statementContext ctx) {
        return super.visitCase_statement(ctx);
    }

    @Override
    public String visitSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx) {
        return super.visitSimple_case_statement(ctx);
    }

    @Override
    public String visitSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx) {
        return super.visitSearched_case_statement(ctx);
    }

    @Override
    public String visitClose_statement(PLSQLParser.Close_statementContext ctx) {
        return super.visitClose_statement(ctx);
    }

    @Override
    public String visitContinue_statement(PLSQLParser.Continue_statementContext ctx) {
        return super.visitContinue_statement(ctx);
    }

    @Override
    public String visitExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx) {
        return super.visitExecute_immediate_statement(ctx);
    }

    @Override
    public String visitPlsql_block(PLSQLParser.Plsql_blockContext ctx) {
        return super.visitPlsql_block(ctx);
    }

    @Override
    public String visitDynamic_sql_stmt(PLSQLParser.Dynamic_sql_stmtContext ctx) {
        return super.visitDynamic_sql_stmt(ctx);
    }

    @Override
    public String visitInto_clause(PLSQLParser.Into_clauseContext ctx) {
        return super.visitInto_clause(ctx);
    }

    @Override
    public String visitExit_statement(PLSQLParser.Exit_statementContext ctx) {
        return super.visitExit_statement(ctx);
    }

    @Override
    public String visitFetch_statement(PLSQLParser.Fetch_statementContext ctx) {
        return super.visitFetch_statement(ctx);
    }

    @Override
    public String visitFor_loop_statement(PLSQLParser.For_loop_statementContext ctx) {
        return super.visitFor_loop_statement(ctx);
    }

    @Override
    public String visitCursor_for_loop_statement(PLSQLParser.Cursor_for_loop_statementContext ctx) {
        return super.visitCursor_for_loop_statement(ctx);
    }

    @Override
    public String visitLower_bound(PLSQLParser.Lower_boundContext ctx) {
        return super.visitLower_bound(ctx);
    }

    @Override
    public String visitUpper_bound(PLSQLParser.Upper_boundContext ctx) {
        return super.visitUpper_bound(ctx);
    }

    @Override
    public String visitGoto_statement(PLSQLParser.Goto_statementContext ctx) {
        return super.visitGoto_statement(ctx);
    }

    @Override
    public String visitIf_statement(PLSQLParser.If_statementContext ctx) {
        return super.visitIf_statement(ctx);
    }

    @Override
    public String visitNull_statement(PLSQLParser.Null_statementContext ctx) {
        return super.visitNull_statement(ctx);
    }

    @Override
    public String visitOpen_for_statement(PLSQLParser.Open_for_statementContext ctx) {
        return super.visitOpen_for_statement(ctx);
    }

    @Override
    public String visitOpen_statement(PLSQLParser.Open_statementContext ctx) {
        return super.visitOpen_statement(ctx);
    }

    @Override
    public String visitDynamic_select(PLSQLParser.Dynamic_selectContext ctx) {
        return super.visitDynamic_select(ctx);
    }

    @Override
    public String visitProcedure_call(PLSQLParser.Procedure_callContext ctx) {
        return super.visitProcedure_call(ctx);
    }

    /**
     * 变量声明
     * @param ctx Variable_declarationContext
     * @return 变量声明
     */
    @Override
    public String visitVariable_declaration(PLSQLParser.Variable_declarationContext ctx) {
        //将变量声明处理成define和let两个字符串，如果没有赋初始值，let字符串为空字符串“”
        //获取变量名。
        String var_name = ctx.variable().getText();
        //获取变量的数据类型，并使用 self.visit() 方法递归处理数据类型节点。
        String var_dateType = visit(ctx.datatype());

        String varAssignStr = "";
        String defineExtend = "";
//
//        if (type_define.containsKey(var_datatype)) {
//            if (type_define.get(var_datatype).get("type").equals("record")) {
//                String _value = String.format("ROW(%s)", String.join(", ",
//                        type_define.get(var_datatype).get("define").stream()
//                                .map(field -> "NULL::" + field[1])
//                                .collect(Collectors.toList())));
//                String var_assign_str = String.format("String.format(\"LET %s = %s;\", name, value)", var_name, _value);
//                var_datatype = String.format("ROW(%s)", String.join(", ",
//                        type_define.get(var_datatype).get("define").stream()
//                                .map(field -> String.join(" ", field))
//                                .collect(Collectors.toList())));
//            } else if (type_define.get(var_datatype).get("type").equals("table")) {
//                collection_var.add(var_name);
//                String define_extend = String.format("\nDEFINE member_of_%s %s;", var_name, type_define.get(var_datatype).get("define"));
//                var_datatype = String.format("LIST(%s NOT NULL)", type_define.get(var_datatype).get("define"));
//            }
//        }
//
//

        return super.visitVariable_declaration(ctx);
    }

    @Override
    public String visitVariable(PLSQLParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    /**
     *访问数据类型
     * @param ctx   DatatypeContext
     * @return 8s对应数据类型
     */
    @Override
    public String visitDatatype(PLSQLParser.DatatypeContext ctx) {
        if (ctx.scalar_datatype() != null){
            return visit(ctx.scalar_datatype());
        }else if (ctx.type_attribute() != null){
            return visit(ctx.type_attribute());
        }else {
            return getSourceStrFromTokens(ctx);
        }
    }


    @Override
    public String visitUser_define_type(PLSQLParser.User_define_typeContext ctx) {
        return super.visitUser_define_type(ctx);
    }

    @Override
    public String visitRaise_statement(PLSQLParser.Raise_statementContext ctx) {
        return super.visitRaise_statement(ctx);
    }

    @Override
    public String visitReturn_statement(PLSQLParser.Return_statementContext ctx) {
        return super.visitReturn_statement(ctx);
    }

    @Override
    public String visitSelect_into_statement(PLSQLParser.Select_into_statementContext ctx) {
        return super.visitSelect_into_statement(ctx);
    }

    @Override
    public String visitTable_reference(PLSQLParser.Table_referenceContext ctx) {
        return super.visitTable_reference(ctx);
    }

    @Override
    public String visitSubquery(PLSQLParser.SubqueryContext ctx) {
        return super.visitSubquery(ctx);
    }

    @Override
    public String visitSql_statement(PLSQLParser.Sql_statementContext ctx) {
        return super.visitSql_statement(ctx);
    }

    @Override
    public String visitCommit_statement(PLSQLParser.Commit_statementContext ctx) {
        return super.visitCommit_statement(ctx);
    }

    @Override
    public String visitRollback_statement(PLSQLParser.Rollback_statementContext ctx) {
        return super.visitRollback_statement(ctx);
    }

    @Override
    public String visitDelete_statement(PLSQLParser.Delete_statementContext ctx) {
        return super.visitDelete_statement(ctx);
    }

    @Override
    public String visitInsert_statement(PLSQLParser.Insert_statementContext ctx) {
        return super.visitInsert_statement(ctx);
    }

    @Override
    public String visitUpdate_statement(PLSQLParser.Update_statementContext ctx) {
        return super.visitUpdate_statement(ctx);
    }

    @Override
    public String visitMerge_statement(PLSQLParser.Merge_statementContext ctx) {
        return super.visitMerge_statement(ctx);
    }

    @Override
    public String visitFunction(PLSQLParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public String visitCursor(PLSQLParser.CursorContext ctx) {
        return super.visitCursor(ctx);
    }

    @Override
    public String visitCursor_variable(PLSQLParser.Cursor_variableContext ctx) {
        return super.visitCursor_variable(ctx);
    }

    @Override
    public String visitRecord(PLSQLParser.RecordContext ctx) {
        return super.visitRecord(ctx);
    }

    @Override
    public String visitField(PLSQLParser.FieldContext ctx) {
        return super.visitField(ctx);
    }

    @Override
    public String visitDb_table_or_view(PLSQLParser.Db_table_or_viewContext ctx) {
        return super.visitDb_table_or_view(ctx);
    }

    @Override
    public String visitCollection_type(PLSQLParser.Collection_typeContext ctx) {
        return super.visitCollection_type(ctx);
    }

    @Override
    public String visitConstant(PLSQLParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public String visitException_(PLSQLParser.Exception_Context ctx) {
        return super.visitException_(ctx);
    }

    @Override
    public String visitProcedure(PLSQLParser.ProcedureContext ctx) {
        return super.visitProcedure(ctx);
    }

    @Override
    public String visitCollection_variable(PLSQLParser.Collection_variableContext ctx) {
        return super.visitCollection_variable(ctx);
    }

    @Override
    public String visitName(PLSQLParser.NameContext ctx) {
        return super.visitName(ctx);
    }

    @Override
    public String visitLabel(PLSQLParser.LabelContext ctx) {
        return super.visitLabel(ctx);
    }

    /**
     *访问标量类型数据，NUMBER、VARCHAR2、DATE 等
     * @param ctx Scalar_datatypeContext
     * @return 8s对应标量数据类型
     */
    @Override
    public String visitScalar_datatype(PLSQLParser.Scalar_datatypeContext ctx) {
        //进行标量数据类型翻译转换
        if (ctx.K_NUMBER() != null) {
            if (ctx.size().size() > 0){
                return String.format("DECIMAL(%s)", ctx.size().stream().map(ParseTree::getText).collect(Collectors.joining(", ")));
            }else{
                return "DECIMAL";
            }
        }
        return getSourceStrFromTokens(ctx);
    }

    /**
     * 定义或声明类型的属性
     * @param ctx Type_attributeContext
     * @return 类型的属性
     */
    @Override
    public String visitType_attribute(PLSQLParser.Type_attributeContext ctx) {
        return "LIKE " + ctx.variable_or_dbobj().getText();
    }

    @Override
    public String visitRowtype_attribute(PLSQLParser.Rowtype_attributeContext ctx) {
        return super.visitRowtype_attribute(ctx);
    }

    @Override
    public String visitSize(PLSQLParser.SizeContext ctx) {
        return super.visitSize(ctx);
    }

    @Override
    public String visitCharacter_variable(PLSQLParser.Character_variableContext ctx) {
        return super.visitCharacter_variable(ctx);
    }

    @Override
    public String visitColumn(PLSQLParser.ColumnContext ctx) {
        return super.visitColumn(ctx);
    }

    @Override
    public String visitNumeric_variable(PLSQLParser.Numeric_variableContext ctx) {
        return super.visitNumeric_variable(ctx);
    }

    @Override
    public String visitSelect_statement(PLSQLParser.Select_statementContext ctx) {
        return super.visitSelect_statement(ctx);
    }
}
