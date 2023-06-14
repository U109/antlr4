// Generated from F:/antlr/src/main/java/com/zzz/gbase\PLSQL.g4 by ANTLR 4.12.0
package com.gbase.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLParser}.
 */
public interface PLSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_file}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_file(PLSQLParser.Plsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_file}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_file(PLSQLParser.Plsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(PLSQLParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(PLSQLParser.Create_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(PLSQLParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(PLSQLParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_section(PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_section(PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_list}.
	 * @param ctx the parse tree
	 */
	void enterItem_list(PLSQLParser.Item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_list}.
	 * @param ctx the parse tree
	 */
	void exitItem_list(PLSQLParser.Item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterItem_declaration(PLSQLParser.Item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitItem_declaration(PLSQLParser.Item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(PLSQLParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(PLSQLParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_init_pragma}.
	 * @param ctx the parse tree
	 */
	void enterException_init_pragma(PLSQLParser.Exception_init_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_init_pragma}.
	 * @param ctx the parse tree
	 */
	void exitException_init_pragma(PLSQLParser.Exception_init_pragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#error_code}.
	 * @param ctx the parse tree
	 */
	void enterError_code(PLSQLParser.Error_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#error_code}.
	 * @param ctx the parse tree
	 */
	void exitError_code(PLSQLParser.Error_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void enterCursor_definition(PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void exitCursor_definition(PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_parameter_dec}.
	 * @param ctx the parse tree
	 */
	void enterCursor_parameter_dec(PLSQLParser.Cursor_parameter_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_parameter_dec}.
	 * @param ctx the parse tree
	 */
	void exitCursor_parameter_dec(PLSQLParser.Cursor_parameter_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowtype}.
	 * @param ctx the parse tree
	 */
	void enterRowtype(PLSQLParser.RowtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowtype}.
	 * @param ctx the parse tree
	 */
	void exitRowtype(PLSQLParser.RowtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_type}.
	 * @param ctx the parse tree
	 */
	void enterCursor_type(PLSQLParser.Cursor_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_type}.
	 * @param ctx the parse tree
	 */
	void exitCursor_type(PLSQLParser.Cursor_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assoc_array_type_def}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_array_type_def(PLSQLParser.Assoc_array_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assoc_array_type_def}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_array_type_def(PLSQLParser.Assoc_array_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void enterField_definition(PLSQLParser.Field_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void exitField_definition(PLSQLParser.Field_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type(PLSQLParser.Record_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type(PLSQLParser.Record_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PLSQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PLSQLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryOp(PLSQLParser.ExprUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryOp(PLSQLParser.ExprUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(PLSQLParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(PLSQLParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBetween(PLSQLParser.ExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBetween(PLSQLParser.ExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(PLSQLParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(PLSQLParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConstant}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprConstant(PLSQLParser.ExprConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConstant}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprConstant(PLSQLParser.ExprConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(PLSQLParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(PLSQLParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOr(PLSQLParser.ExprAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOr(PLSQLParser.ExprAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCursor}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCursor(PLSQLParser.ExprCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCursor}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCursor(PLSQLParser.ExprCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelation}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRelation(PLSQLParser.ExprRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelation}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRelation(PLSQLParser.ExprRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIs}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprIs(PLSQLParser.ExprIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIs}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprIs(PLSQLParser.ExprIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBinary}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBinary(PLSQLParser.ExprBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBinary}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBinary(PLSQLParser.ExprBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(PLSQLParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(PLSQLParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVarible}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVarible(PLSQLParser.ExprVaribleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVarible}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVarible(PLSQLParser.ExprVaribleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(PLSQLParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(PLSQLParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(PLSQLParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(PLSQLParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCursor_attribute(PLSQLParser.Cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCursor_attribute(PLSQLParser.Cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_attribute_name(PLSQLParser.Cursor_attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_attribute_name(PLSQLParser.Cursor_attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#builtin_constant}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_constant(PLSQLParser.Builtin_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#builtin_constant}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_constant(PLSQLParser.Builtin_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(PLSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(PLSQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#binaryOperators}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperators(PLSQLParser.BinaryOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#binaryOperators}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperators(PLSQLParser.BinaryOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_or_dbobj}.
	 * @param ctx the parse tree
	 */
	void enterVariable_or_dbobj(PLSQLParser.Variable_or_dbobjContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_or_dbobj}.
	 * @param ctx the parse tree
	 */
	void exitVariable_or_dbobj(PLSQLParser.Variable_or_dbobjContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(PLSQLParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(PLSQLParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(PLSQLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(PLSQLParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_expression(PLSQLParser.Character_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_expression(PLSQLParser.Character_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_subexpression}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_subexpression(PLSQLParser.Character_subexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_subexpression}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_subexpression(PLSQLParser.Character_subexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_function_call}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_function_call(PLSQLParser.Character_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_function_call}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_function_call(PLSQLParser.Character_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_literal(PLSQLParser.Character_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_literal(PLSQLParser.Character_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(PLSQLParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(PLSQLParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_subexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_subexpression(PLSQLParser.Numeric_subexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_subexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_subexpression(PLSQLParser.Numeric_subexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_function_call}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_call(PLSQLParser.Numeric_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_function_call}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_call(PLSQLParser.Numeric_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(PLSQLParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(PLSQLParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_expression(PLSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_expression(PLSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(PLSQLParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(PLSQLParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_expression(PLSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_expression(PLSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(PLSQLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(PLSQLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selector_value}.
	 * @param ctx the parse tree
	 */
	void enterSelector_value(PLSQLParser.Selector_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selector_value}.
	 * @param ctx the parse tree
	 */
	void exitSelector_value(PLSQLParser.Selector_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PLSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PLSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(PLSQLParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(PLSQLParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inCondition}.
	 * @param ctx the parse tree
	 */
	void enterInCondition(PLSQLParser.InConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inCondition}.
	 * @param ctx the parse tree
	 */
	void exitInCondition(PLSQLParser.InConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperator(PLSQLParser.RelationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperator(PLSQLParser.RelationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#columnExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnExpression(PLSQLParser.ColumnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#columnExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnExpression(PLSQLParser.ColumnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignment_statement_target}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement_target(PLSQLParser.Assignment_statement_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignment_statement_target}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement_target(PLSQLParser.Assignment_statement_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_index}.
	 * @param ctx the parse tree
	 */
	void enterCollection_index(PLSQLParser.Collection_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_index}.
	 * @param ctx the parse tree
	 */
	void exitCollection_index(PLSQLParser.Collection_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_block(PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_block(PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dynamic_sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_sql_stmt(PLSQLParser.Dynamic_sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dynamic_sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_sql_stmt(PLSQLParser.Dynamic_sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_for_loop_statement(PLSQLParser.Cursor_for_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_for_loop_statement(PLSQLParser.Cursor_for_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dynamic_select}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_select(PLSQLParser.Dynamic_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dynamic_select}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_select(PLSQLParser.Dynamic_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(PLSQLParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(PLSQLParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_define_type}.
	 * @param ctx the parse tree
	 */
	void enterUser_define_type(PLSQLParser.User_define_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_define_type}.
	 * @param ctx the parse tree
	 */
	void exitUser_define_type(PLSQLParser.User_define_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_into_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_statement(PLSQLParser.Select_into_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_into_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_statement(PLSQLParser.Select_into_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(PLSQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(PLSQLParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PLSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PLSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PLSQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PLSQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor}.
	 * @param ctx the parse tree
	 */
	void enterCursor(PLSQLParser.CursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor}.
	 * @param ctx the parse tree
	 */
	void exitCursor(PLSQLParser.CursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable(PLSQLParser.Cursor_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable(PLSQLParser.Cursor_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(PLSQLParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(PLSQLParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PLSQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PLSQLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#db_table_or_view}.
	 * @param ctx the parse tree
	 */
	void enterDb_table_or_view(PLSQLParser.Db_table_or_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#db_table_or_view}.
	 * @param ctx the parse tree
	 */
	void exitDb_table_or_view(PLSQLParser.Db_table_or_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_type}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type(PLSQLParser.Collection_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_type}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type(PLSQLParser.Collection_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_}.
	 * @param ctx the parse tree
	 */
	void enterException_(PLSQLParser.Exception_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_}.
	 * @param ctx the parse tree
	 */
	void exitException_(PLSQLParser.Exception_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(PLSQLParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(PLSQLParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_variable}.
	 * @param ctx the parse tree
	 */
	void enterCollection_variable(PLSQLParser.Collection_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_variable}.
	 * @param ctx the parse tree
	 */
	void exitCollection_variable(PLSQLParser.Collection_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PLSQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PLSQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PLSQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PLSQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scalar_datatype}.
	 * @param ctx the parse tree
	 */
	void enterScalar_datatype(PLSQLParser.Scalar_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scalar_datatype}.
	 * @param ctx the parse tree
	 */
	void exitScalar_datatype(PLSQLParser.Scalar_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_attribute}.
	 * @param ctx the parse tree
	 */
	void enterType_attribute(PLSQLParser.Type_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_attribute}.
	 * @param ctx the parse tree
	 */
	void exitType_attribute(PLSQLParser.Type_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowtype_attribute}.
	 * @param ctx the parse tree
	 */
	void enterRowtype_attribute(PLSQLParser.Rowtype_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowtype_attribute}.
	 * @param ctx the parse tree
	 */
	void exitRowtype_attribute(PLSQLParser.Rowtype_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(PLSQLParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(PLSQLParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_variable}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_variable(PLSQLParser.Character_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_variable}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_variable(PLSQLParser.Character_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(PLSQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(PLSQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_variable}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_variable(PLSQLParser.Numeric_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_variable}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_variable(PLSQLParser.Numeric_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PLSQLParser.Select_statementContext ctx);
}