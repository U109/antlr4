
grammar ArrayInit;
//一条名为init 的规则，匹配一对花括号中的逗号分隔的value
init : '{' value (',' value)* '}';
//一个value可以是嵌套的花括号结构，也可以是一个简单的整数，即INT的词法符号
value : init
    | INT
    ;

INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;

