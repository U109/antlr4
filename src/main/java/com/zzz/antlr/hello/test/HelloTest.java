package com.zzz.antlr.hello.test;

import com.zzz.antlr.hello.gen.HelloLexer;
import com.zzz.antlr.hello.gen.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author: Zzz
 * @date: 2023/6/6 10:25
 * @description:
 */
public class HelloTest {

    public static void main(String[] args) throws Exception {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("hello zz 11 hello z"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r();
        System.out.println(tree.toStringTree(parser));
    }

}
