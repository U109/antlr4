// Generated from F:/antlr/src/main/java/com/zzz/antlr/calculator2/g4\Calculator2.g4 by ANTLR 4.12.0
package com.zzz.antlr.calculator2.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calculator2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calculator2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calculator2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Calculator2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(Calculator2Parser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Calculator2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(Calculator2Parser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(Calculator2Parser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(Calculator2Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(Calculator2Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Calculator2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Calculator2Parser.IntContext ctx);
}