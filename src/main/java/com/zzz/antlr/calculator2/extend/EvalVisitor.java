package com.zzz.antlr.calculator2.extend;

import com.zzz.antlr.calculator2.gen.Calculator2BaseVisitor;
import com.zzz.antlr.calculator2.gen.Calculator2Parser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zzz
 * @date: 2023/6/7 17:01
 * @description:
 */
public class EvalVisitor extends Calculator2BaseVisitor<Integer> {

    /** 计算器的内存，存放变量名和变量值的对应关系 */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(Calculator2Parser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id 在 '=' 的左侧
        int value = visit(ctx.expr());   // 计算右侧表达式的值
        memory.put(id, value);
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(Calculator2Parser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // 计算expr子节点的值
        System.out.println(value);
        return 0;
    }

    /** INT */
    @Override
    public Integer visitInt(Calculator2Parser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(Calculator2Parser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) {
            return memory.get(id);
        }
        return 0;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(Calculator2Parser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));  // 计算左侧子表达式的值
        int right = visit(ctx.expr(1)); // 计算右侧子表达式的值
        if ( ctx.op.getType() == Calculator2Parser.MUL ) {
            return left * right;
        }
        return left / right; // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(Calculator2Parser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == Calculator2Parser.ADD ) {
            return left + right;
        }
        return left - right; // must be SUB
    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(Calculator2Parser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

}
