package com.zzz.antlr.calculator2.test;

import com.zzz.antlr.calculator2.extend.EvalVisitor;
import com.zzz.antlr.calculator2.gen.Calculator2Lexer;
import com.zzz.antlr.calculator2.gen.Calculator2Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author: Zzz
 * @date: 2023/6/7 16:59
 * @description:
 */
public class Calc {

    public static void main(String[] args) throws Exception {

        String inputFile = "src/main/java/com/zzz/antlr/calculator2/t.expr";

        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null){
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        Calculator2Lexer lexer = new Calculator2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Calculator2Parser parser = new Calculator2Parser(tokens);

        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}

