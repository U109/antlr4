package com.zzz.antlr.arrayInit.test;

import com.zzz.antlr.arrayInit.extend.ShortToUnicodeString;
import com.zzz.antlr.arrayInit.gen.ArrayInitLexer;
import com.zzz.antlr.arrayInit.gen.ArrayInitParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.IOException;

/**
 * @author: Zzz
 * @date: 2023/6/7 9:50
 * @description: 假定不存在嵌套结构
 */
public class Translate {

    public static void main(String[] args) throws IOException {
        //新建一个CharStream，从标准输入读取数据
        ANTLRInputStream inputStream = new ANTLRInputStream("{1,2,3}");
        //新建一个词法分析器，处理输入的charStream
        ArrayInitLexer lexer = new ArrayInitLexer(inputStream);
        //新建一个词法符号的缓冲区，用于存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建一个语法分析器，处理词法符号缓冲区的内容
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();

        //新建一个通用的、能够触发回调函数的语法分析树遍历器
        ParseTreeWalker walker = new ParseTreeWalker();
        //遍历语法分析过程中生成的语法分析树，触发回调
        walker.walk(new ShortToUnicodeString(),tree);
        System.out.println();

    }
}
