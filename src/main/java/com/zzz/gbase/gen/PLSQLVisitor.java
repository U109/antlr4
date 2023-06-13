// Generated from F:/antlr/src/main/java/com/zzz/gbase\PLSQL.g4 by ANTLR 4.12.0
package com.zzz.gbase.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#plsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_file(PLSQLParser.Plsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure(PLSQLParser.Create_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(PLSQLParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_section(PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_list(PLSQLParser.Item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_declaration(PLSQLParser.Item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(PLSQLParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_init_pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_init_pragma(PLSQLParser.Exception_init_pragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#error_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_code(PLSQLParser.Error_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_definition(PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_parameter_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_parameter_dec(PLSQLParser.Cursor_parameter_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rowtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowtype(PLSQLParser.RowtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_type(PLSQLParser.Cursor_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assoc_array_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_array_type_def(PLSQLParser.Assoc_array_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#field_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_definition(PLSQLParser.Field_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type(PLSQLParser.Record_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PLSQLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryOp(PLSQLParser.ExprUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(PLSQLParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBetween(PLSQLParser.ExprBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(PLSQLParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConstant}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstant(PLSQLParser.ExprConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(PLSQLParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOr(PLSQLParser.ExprAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCursor}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCursor(PLSQLParser.ExprCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRelation}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelation(PLSQLParser.ExprRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIs}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIs(PLSQLParser.ExprIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBinary}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinary(PLSQLParser.ExprBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunction(PLSQLParser.ExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVarible}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarible(PLSQLParser.ExprVaribleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLiteral(PLSQLParser.ExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(PLSQLParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_attribute(PLSQLParser.Cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_attribute_name(PLSQLParser.Cursor_attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#builtin_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_constant(PLSQLParser.Builtin_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(PLSQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#binaryOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperators(PLSQLParser.BinaryOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable_or_dbobj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_or_dbobj(PLSQLParser.Variable_or_dbobjContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(PLSQLParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(PLSQLParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#character_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_expression(PLSQLParser.Character_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#character_subexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_subexpression(PLSQLParser.Character_subexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#character_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_function_call(PLSQLParser.Character_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#character_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_literal(PLSQLParser.Character_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(PLSQLParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_subexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_subexpression(PLSQLParser.Numeric_subexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function_call(PLSQLParser.Numeric_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(PLSQLParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_expression(PLSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(PLSQLParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_expression(PLSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(PLSQLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#selector_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_value(PLSQLParser.Selector_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PLSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(PLSQLParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#inCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCondition(PLSQLParser.InConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperator(PLSQLParser.RelationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#columnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExpression(PLSQLParser.ColumnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assignment_statement_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement_target(PLSQLParser.Assignment_statement_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_index(PLSQLParser.Collection_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_block(PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dynamic_sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_sql_stmt(PLSQLParser.Dynamic_sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_for_loop_statement(PLSQLParser.Cursor_for_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dynamic_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_select(PLSQLParser.Dynamic_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(PLSQLParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#user_define_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_define_type(PLSQLParser.User_define_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#select_into_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_into_statement(PLSQLParser.Select_into_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(PLSQLParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PLSQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PLSQLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor(PLSQLParser.CursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable(PLSQLParser.Cursor_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(PLSQLParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PLSQLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#db_table_or_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_table_or_view(PLSQLParser.Db_table_or_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_type(PLSQLParser.Collection_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_(PLSQLParser.Exception_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(PLSQLParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_variable(PLSQLParser.Collection_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PLSQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(PLSQLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#scalar_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_datatype(PLSQLParser.Scalar_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_attribute(PLSQLParser.Type_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rowtype_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowtype_attribute(PLSQLParser.Rowtype_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(PLSQLParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#character_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_variable(PLSQLParser.Character_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(PLSQLParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_variable(PLSQLParser.Numeric_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(PLSQLParser.Select_statementContext ctx);
}