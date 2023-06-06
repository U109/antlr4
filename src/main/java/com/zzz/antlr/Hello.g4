//file Hello.g4
//Define a grammar called Hello
grammar Hello; //1、grammar name
@header { package com.zzz.antlr } //2、java package
r : 'hello' ID ; //3、match keyword hello followed by an identifier
ID : [a-z]+ ; //match lower-case identifier
WS : [ \t\r\n]+ -> skip; // 4、skip spaces,tabs,newlines

//1、定义了grammar的名字，名字需要与文件名对应
//2、定义生成的Java类的package
//3、r定义的语法，会使用到下方定义的正则表达式词法
//4、定义了空白字符，后面的skip是一个特殊的标记，标记空白字符会被忽略
