package com.zzz.self.plsql;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Zzz
 * @date: 2023/6/9 9:58
 * @description:
 */
public class ConversionSelect extends PlSqlBaseVisitor<String> {


    @Override
    public String visitSelectStatement(PlSqlParser.SelectStatementContext ctx) {
        super.visitSelectStatement(ctx);

        PlSqlParser.FromClauseContext fromClauseContext = ctx.fromClause();
        String visit = visit(fromClauseContext);
        System.out.println("from ---------- " + visit);
        String text = ctx.getText();
        System.out.println("SelectStatement text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("SelectStatement child : " + child.getText());
        }
        return "SelectStatement";
    }

    @Override
    public String visitSelectList(PlSqlParser.SelectListContext ctx) {
        super.visitSelectList(ctx);
        String text = ctx.getText();
        System.out.println("SelectList text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("SelectList child : " + child.getText());
        }
        return "SelectList";
    }

    @Override
    public String visitSelectItem(PlSqlParser.SelectItemContext ctx) {
        super.visitSelectItem(ctx);
        String text = ctx.getText();
        System.out.println("SelectItem text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("SelectItem child : " + child.getText());
        }
        return "SelectItem";
    }

    @Override
    public String visitColumnIdentifier(PlSqlParser.ColumnIdentifierContext ctx) {
        super.visitColumnIdentifier(ctx);
        String text = ctx.getText();
        System.out.println("ColumnIdentifier text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("ColumnIdentifier child : " + child.getText());
        }
        List<TerminalNode> identifier = ctx.Identifier();
        System.out.println("ColumnIdentifier identifier : " + identifier.toString());
        return "ColumnIdentifier";
    }

    @Override
    public String visitFromClause(PlSqlParser.FromClauseContext ctx) {
        // 读取from中的内容

        super.visitFromClause(ctx);
        List<String> from = new ArrayList<>();
        String text = ctx.getText();

        System.out.println("FromClause text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {

            System.out.println("FromClause child : " + child.getText());
            if ("FROM".equals(child.getText())) {
                from.add("FROMTO");
            }else{
                from.add(child.getText());
            }

        }
        StringBuilder fromText = new StringBuilder();
        for (String s : from) {
            fromText.append(s).append(" ");
        }
        System.out.println(fromText.toString());
        return fromText.toString();
    }

    @Override
    public String visitWhereClause(PlSqlParser.WhereClauseContext ctx) {
        super.visitWhereClause(ctx);
        String text = ctx.getText();
        System.out.println("WhereClause text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("WhereClause child : " + child.getText());
        }
        return "WhereClause";
    }

    @Override
    public String visitSelectClause(PlSqlParser.SelectClauseContext ctx) {
        super.visitSelectClause(ctx);
        String text = ctx.getText();
        System.out.println("SelectClause text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("SelectClause child : " + child.getText());
        }
        return "SelectClause";
    }


    @Override
    public String visitTableName(PlSqlParser.TableNameContext ctx) {
        super.visitTableName(ctx);
        String text = ctx.getText();
        System.out.println("TableName text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("TableName child : " + child.getText());
        }
        return "TableName";
    }

    @Override
    public String visitCondition(PlSqlParser.ConditionContext ctx) {
        super.visitCondition(ctx);
        String text = ctx.getText();
        System.out.println("Condition text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("Condition child : " + child.getText());
        }
        return "Condition";
    }

    @Override
    public String visitExpression(PlSqlParser.ExpressionContext ctx) {
        super.visitExpression(ctx);
        String text = ctx.getText();
        System.out.println("Expression text : " + text);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            System.out.println("Expression child : " + child.getText());
        }
        return "Expression";
    }
}
