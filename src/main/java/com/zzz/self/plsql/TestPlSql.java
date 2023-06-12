package com.zzz.self.plsql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author: Zzz
 * @date: 2023/6/9 10:00
 * @description:
 */
public class TestPlSql {

    public static void main(String[] args) throws Exception {
        String input = "SELECT id,name FROM users WHERE id = 1";
        ANTLRInputStream stream = new ANTLRInputStream(input);
        PlSqlLexer lexer = new PlSqlLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlSqlParser parser = new PlSqlParser(tokens);
        ParseTree tree = parser.selectStatement();
        System.out.println(tree.toStringTree(parser));
        ConversionSelect conversionSelect = new ConversionSelect();
//        ConversionSelect2 conversionSelect = new ConversionSelect2();
        String visit = conversionSelect.visit(tree);

        System.out.println("visit : " + visit);

    }

}
