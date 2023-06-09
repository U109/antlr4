// Generated from F:/antlr/src/main/java/com/zzz/self/plsql\PlSql.g4 by ANTLR 4.12.0
package com.zzz.self.plsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(PlSqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(PlSqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(PlSqlParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(PlSqlParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIdentifier(PlSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(PlSqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(PlSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PlSqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlSqlParser.ExpressionContext ctx);
}