grammar Calculator;

/** 按照规则，语法分析的起点 **/
//prog：表示整个程序，由一个或多个 stat 组成。
prog : stat+ ;

//stat：语句，可以是一个表达式，也可以是赋值语句，或者是一个空行。
stat : expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

//expr：表达式，可以是加减乘除运算，也可以是整数或者变量，或者是一个括号内的表达式。
expr : expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | INT
    | ID
    | '(' expr ')'
    ;

//匹配标识符
ID : [a-zA-Z]+ ;
//匹配整数
INT : [0-9]+ ;
//一个换行符由可选的回车符和一个换行符组成。其中，'\r'表示回车符，'\n'表示换行符。
//告诉语法分析器一个新行的开始（即语句终止标志）
NEWLINE : '\r'?'\n' ;
//丢弃空白字符
WS : [\t]+ -> skip;