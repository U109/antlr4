package com.zzz.self.plsql;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author: Zzz
 * @date: 2023/6/9 10:47
 * @description:
 */
public class ConversionSelect2 extends PlSqlBaseVisitor<String> {


    @Override
    public String visitSelectStatement(PlSqlParser.SelectStatementContext ctx) {
        super.visitSelectStatement(ctx);
        System.out.println("visitSelectStatement");
        return "SelectStatement";
    }

    @Override
    public String visitSelectList(PlSqlParser.SelectListContext ctx) {
        super.visitSelectList(ctx);
        System.out.println("visitSelectList");
        return "SelectList";
    }

    @Override
    public String visitSelectItem(PlSqlParser.SelectItemContext ctx) {
        super.visitSelectItem(ctx);
        System.out.println("visitSelectItem");
        return "SelectItem";
    }

    @Override
    public String visitColumnIdentifier(PlSqlParser.ColumnIdentifierContext ctx) {
        super.visitColumnIdentifier(ctx);
        System.out.println("visitColumnIdentifier");
        return "ColumnIdentifier";
    }

    @Override
    public String visitFromClause(PlSqlParser.FromClauseContext ctx) {
        super.visitFromClause(ctx);
        System.out.println("visitFromClause");
        return "FromClause";
    }

    @Override
    public String visitWhereClause(PlSqlParser.WhereClauseContext ctx) {
        super.visitWhereClause(ctx);
        System.out.println("visitWhereClause");
        return "WhereClause";
    }

    @Override
    public String visitSelectClause(PlSqlParser.SelectClauseContext ctx) {
        super.visitSelectClause(ctx);
        System.out.println("visitSelectClause");
        return "SelectClause";
    }


    @Override
    public String visitTableName(PlSqlParser.TableNameContext ctx) {
        super.visitTableName(ctx);
        System.out.println("visitTableName");
        return "TableName";
    }

    @Override
    public String visitCondition(PlSqlParser.ConditionContext ctx) {
        super.visitCondition(ctx);
        System.out.println("visitCondition");
        return "Condition";
    }

    @Override
    public String visitExpression(PlSqlParser.ExpressionContext ctx) {
        super.visitExpression(ctx);
        System.out.println("visitExpression");
        return "Expression";
    }
}