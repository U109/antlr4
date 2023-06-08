package com.zzz.antlr.calculator.test;

import com.zzz.antlr.calculator.gen.CalculatorLexer;
import com.zzz.antlr.calculator.gen.CalculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: Zzz
 * @date: 2023/6/7 16:41
 * @description:
 */
public class ExprJoyRide {

    public static void main(String[] args) throws Exception {
        String inputFile = "src/main/java/com/zzz/antlr/calculator/t.expr";
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null){
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        CalculatorLexer lexer = new CalculatorLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);

        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}
