grammar PlSqlTran ;

/**
由一个或多个 create_procedure 规则组成。
每个 create_procedure 规则后面跟着一个斜杠（/），表示一个存储过程定义的结束。
如果有多个存储过程定义在一个文件中，它们之间也需要用斜杠分隔。
最后的斜杠（/）表示整个文件的结束，是可选的。
这段语法规则描述了一个 SQL 存储过程的创建语法模板。
*/
plsql_file
    : create_procedure ('/' create_procedure)* '/'?
    ;

/**
K_CREATE (K_OR K_REPLACE)? K_PROCEDURE：表示创建存储过程的关键字，K_OR K_REPLACE表示如果存储过程已经存在，则可以选择替换它。
(schema DOT)? procedure_name：schema DOT表示存储过程所在的模式（可选），procedure_name表示存储过程的名称。
(LPAREN parameter_declaration (COMMA parameter_declaration)* RPAREN)？：表示存储过程的参数列表，可以有多个参数，每个参数由参数声明和逗号分隔。
(K_IS|K_AS) declare_section? body：K_IS或K_AS表示存储过程体的开始，declare_section表示可选的变量声明部分，body表示存储过程的主体部分，包括存储过程的实际代码。
*/
create_procedure
    : K_CREATE (K_OR K_REPLACE)? K_PROCEDURE (schema DOT)? procedure_name
    (LPAREN parameter_declaration (COMMA parameter_declaration)* RPAREN)?
    (K_IS|K_AS) declare_section? body
    ;

schema
    : ID
    ;

procedure_name
    : ID
    ;

/**
parameter_declaration：这是一个非终结符，表示参数声明的规则。
parameter_name：这是一个非终结符，表示参数的名称。在您提供的定义中，它由ID（标识符）组成，即参数名称是一个标识符。
K_IN?：这是一个可选的关键字，表示参数是输入参数。问号?表示该关键字是可选的，可以存在也可以省略。
K_OUT?：同样地，这也是一个可选的关键字，表示参数是输出参数。如果参数带有K_OUT关键字，表示该参数是一个输出参数，用于将函数或方法处理后的结果返回给调用者。
*/
parameter_declaration
    : parameter_name K_IN? K_OUT? datatype
    ;
// 参数名称， 形参
parameter_name
    : ID
    ;
// 实参
parameter
    : STAR | expression
    ;

declare_section
    : item_list
    ;

item_list
    : (item_declaration | type_definition | cursor_declaration | cursor_definition | pragma)+
    ;

item_declaration
    : constant_declaration
    | variable_declaration
    | exception_declaration
    ;

type_definition
    : collection_type_definition
    | record_type_definition
    | ref_cursor_type_definition
    ;

exception_declaration
    : exception_ K_EXCEPTION SEMI
    ;

pragma
    : exception_init_pragma
    ;
exception_init_pragma
    : K_PRAGMA K_EXCEPTION_INIT LPAREN exception_ COMMA error_code RPAREN SEMI
    ;
error_code
    : numeric_literal
    ;
cursor_declaration
    : K_CURSOR cursor K_RETURN rowtype
    ;

cursor_definition
    : K_CURSOR cursor
    (LPAREN cursor_parameter_dec (COMMA cursor_parameter_dec)* RPAREN)?
    (K_RETURN rowtype)?
    K_IS select_statement SEMI
    ;
cursor_parameter_dec
    : parameter_name K_IN? datatype ((ASSIGN | K_DEFAULT) expression)?
    ;
rowtype
    : type_attribute
    | rowtype_attribute
    | user_define_type
    ;
record_type_definition
    : K_TYPE record_type K_IS K_RECORD LPAREN field_definition (COMMA field_definition)* RPAREN SEMI
    ;
ref_cursor_type_definition
    : K_TYPE cursor_type K_IS K_REF K_CURSOR (K_RETURN rowtype) SEMI
    ;

cursor_type
    : ID
    ;

collection_type_definition
    : K_TYPE collection_type K_IS assoc_array_type_def SEMI
    ;

assoc_array_type_def
    : K_TABLE K_OF datatype (K_NOT K_NULL)? K_INDEX K_BY
    (K_PLS_INTEGER
    | K_BINARY_INTEGER
    | (K_VARCHAR2 | K_VARCHAR | K_STRING) LPAREN size RPAREN
    | K_LONG
    | type_attribute
    | rowtype_attribute)
    ;

field_definition
    : field datatype ((K_NOT K_NULL)? (ASSIGN | K_DEFAULT) expression)?
    ;

record_type
    : ID
    ;

constant_declaration
    : constant K_CONSTANT datatype (K_NOT K_NULL)? (ASSIGN | K_DEFAULT) expression SEMI
    ;

body
    : K_BEGIN statement+ (K_EXCEPTION exception_handler+)? K_END name? SEMI
    ;

exception_handler
    : K_WHEN (exception_ (K_OR exception_)* | K_OTHERS) K_THEN statement+
    ;

while_loop_statement
    : K_WHILE boolean_expression K_LOOP statement+ K_END K_LOOP label? SEMI
    ;

expression
    : builtin_constant                                              # ExprConstant
    | variable_or_dbobj                                             # ExprVarible
    | literal                                                       # ExprLiteral
    | function_call                                                 # ExprFunction
    | LPAREN expression RPAREN                                      # ExprParen
    | expression binaryOperators expression                         # ExprBinary
    | expression relationOperator expression                        # ExprRelation
    | expression K_NOT? K_BETWEEN expression K_AND expression       # ExprBetween
    | expression K_IS K_NOT? K_NULL                                 # ExprIs
    | expression (K_AND | K_OR) expression                          # ExprAndOr
    | case_expression                                               # ExprCase
    | cursor_attribute                                              # ExprCursor
    | K_NOT expression                                              # ExprNot
    | unaryOp                                                       # ExprUnaryOp
    ;

unaryOp
    : op=(PLUS|MINUS) expression
    ;

cursor_attribute
    : (cursor | K_SQL) PERCENT cursor_attribute_name
    ;
cursor_attribute_name
    : K_FOUND | K_NOTFOUND | K_ROWCOUNT | K_ISOPEN
    ;

builtin_constant
    : K_CURRENT_DATE | K_SYSDATE | K_SYSTIMESTAMP
    | K_SQLCODE | K_SQLERRM
    | K_USER
    ;

case_expression
    : searched_case_expression
    | simple_case_expression
    ;

binaryOperators
    : STAR | DIV | PLUS | MINUS | DOUBLE_PIPE
    ;

variable_or_dbobj
    : ((ID | function_call) DOT)? ID
    ;
boolean_expression
    : expression
    ;

boolean_literal
    : K_NOT? (K_TRUE
    | K_FALSE
    | K_NULL)
    ;

function_call
    : function LPAREN (parameter (COMMA parameter)*)? RPAREN
    ;

// 根据 描述 定义
index
    : variable
    ;

character_expression
    : character_literal
    | character_subexpression (DOUBLE_PIPE character_subexpression)+
    ;
character_subexpression
    : character_literal
    | character_variable
    | character_function_call
    ;
character_function_call
    : function_call
    ;
character_literal
    : SINGLE_QUOTE_STRING | Q_ESCAPE_STRING
    ;

date_literal
    : SINGLE_QUOTE_STRING | Q_ESCAPE_STRING
    ;
numeric_expression
    : numeric_literal
    | numeric_subexpression ((PLUS | MINUS | STAR | DIV) numeric_subexpression)+
    ;
numeric_subexpression
    : numeric_literal
    | numeric_variable
    | numeric_function_call
    ;

numeric_function_call
    : function_call
    ;

numeric_literal
    : LITERAL_NUMBER
    ;

searched_case_expression
    : K_CASE (K_WHEN boolean_expression K_THEN result)+ (K_ELSE result)? K_END
    ;

result
    : expression
    ;
simple_case_expression
    : K_CASE selector (K_WHEN selector_value K_THEN result)+ (K_ELSE result)? K_END
    ;
selector
    : expression
    ;
selector_value
    : expression
    ;

literal
    : character_literal
    | boolean_literal
    | numeric_literal
    | date_literal
    ;

//select语句，非select into语句, 涉及oracle sql语法，不再向下分解，只提供采样
/**
~';'*?：这是一个语法片段，用于表示可选的分号。
其中 ~ 表示匹配任意字符，
; 表示分号，
* 表示零个或多个重复，
? 表示该部分是可选的。
根据这个模式定义，select_clause规则表示了 SELECT 子句的语法规则。
该子句由关键字 SELECT 开始，并且可以后跟零个或多个分号。这里使用 ~';'*? 来表示分号是可选的，并且可以出现零次或多次。
例如 ：1、SELECT column1, column2 FROM table1;
      2、SELECT DISTINCT column1 FROM table1 WHERE column2 > 10;
*/
select_clause
    : K_SELECT ~';'*?
    ;
/**
1、FROM table1;
2、FROM table1, table2 WHERE table1.id = table2.id;
*/
from_clause
    : K_FROM ~';'*?
    ;

condition
    : expression relationOperator expression
    | expression K_NOT? K_BETWEEN expression K_AND expression
    | (column | expression) K_IS K_NOT? K_NULL
    | (character_literal | columnExpression) K_NOT? K_LIKE (character_literal | column)
    | inCondition
    | condition (K_AND | K_OR) condition
    | K_NOT condition
    ;

inCondition
    : expression K_NOT? K_IN LPAREN expression (COMMA expression)* RPAREN
    ;

relationOperator
    : GT | GE | LT | LE | EQUAL | NOT_EQUAL
    ;

columnExpression
    : table_reference? (column | K_ROWID)
    ;

statement
    : (DOUBLE_L label DOUBLE_G)* (assignment_statement
    | basic_loop_statement
    | case_statement
    | close_statement
    | continue_statement
    | execute_immediate_statement
    | exit_statement
    | fetch_statement
    | for_loop_statement
    | cursor_for_loop_statement
    | goto_statement
    | if_statement
    | null_statement
    | open_statement
    | open_for_statement
    | procedure_call
    | raise_statement
    | return_statement
    | select_into_statement
    | sql_statement
    | while_loop_statement
    | procedure_call
    | plsql_block)
    ;
assignment_statement
    : assignment_statement_target ASSIGN expression SEMI
    ;
assignment_statement_target
    : variable_or_dbobj
    | collection_variable LPAREN collection_index RPAREN
    ;
collection_index
    : expression
    ;
basic_loop_statement
    : K_LOOP statement+ K_END K_LOOP label? SEMI
    ;
// custom rule
case_statement
    : simple_case_statement
    | searched_case_statement
    ;

simple_case_statement
    : K_CASE selector (K_WHEN selector_value K_THEN statement)+
    (K_ELSE statement+)? K_END K_CASE label? SEMI
    ;

searched_case_statement
    : K_CASE (K_WHEN boolean_expression K_THEN statement)+
    (K_ELSE statement+)? K_END K_CASE label? SEMI
    ;
close_statement
    : K_CLOSE (cursor | cursor_variable) SEMI
    ;

continue_statement
    : K_CONTINUE label? (K_WHEN boolean_expression)? SEMI
    ;

execute_immediate_statement
    : K_EXECUTE K_IMMEDIATE dynamic_sql_stmt SEMI
    ;
plsql_block
    : (DOUBLE_L label DOUBLE_G)* (K_DECLARE declare_section)? body
    ;

dynamic_sql_stmt
    : (SINGLE_QUOTE_STRING | Q_ESCAPE_STRING | ID) (DOUBLE_PIPE (SINGLE_QUOTE_STRING | Q_ESCAPE_STRING| ID))*
    ;

into_clause
    : K_INTO (variable (COMMA variable)* | record)
    ;

exit_statement
    : K_EXIT label? (K_WHEN boolean_expression)? SEMI
    ;
fetch_statement
    : K_FETCH (cursor | cursor_variable) into_clause SEMI
    ;
for_loop_statement
    : K_FOR index K_IN K_REVERSE? lower_bound DOUBLE_DOT upper_bound K_LOOP statement+ K_END K_LOOP label? SEMI
    ;
cursor_for_loop_statement
    : K_FOR record K_IN (cursor (LPAREN parameter (COMMA parameter)* RPAREN)?
    | LPAREN select_statement RPAREN)
    K_LOOP statement+ K_END K_LOOP label? SEMI
    ;
// 根据 描述 定义
lower_bound
    : numeric_literal
    | numeric_variable
    | numeric_expression
    ;
// 根据 描述 定义
upper_bound
    : numeric_literal
    | numeric_variable
    | numeric_expression
    ;

goto_statement
    : K_GOTO label SEMI
    ;
if_statement
    : K_IF boolean_expression K_THEN statement+ (K_ELSIF boolean_expression K_THEN statement+)*
    (K_ELSE statement+)? K_END K_IF SEMI
    ;
null_statement
    : K_NULL SEMI
    ;

open_for_statement
    : K_OPEN cursor_variable K_FOR (select_statement | dynamic_select) SEMI
    ;
open_statement
    : K_OPEN cursor (LPAREN parameter (COMMA parameter)* RPAREN)? SEMI
    ;
dynamic_select
    : character_expression
    ;

procedure_call
    : procedure (LPAREN (parameter (COMMA parameter)*)? RPAREN)? SEMI
    ;

variable_declaration
    : variable datatype ((K_NOT K_NULL)? (ASSIGN | K_DEFAULT) expression)? SEMI
    ;
variable
    : ID
    ;

datatype
    : scalar_datatype
    | type_attribute
    | rowtype_attribute
    | user_define_type
    ;

user_define_type
    : (ID DOT)? ID
    ;

raise_statement
    : K_RAISE exception_? SEMI
    ;
return_statement
    : K_RETURN expression? SEMI
    ;
select_into_statement
    : K_SELECT ~';'*? K_INTO ~';'*? SEMI
    ;
//  Do not put space between @ and dblink.
table_reference
    : (schema DOT)? db_table_or_view
    ;
subquery
    : select_statement
    ;
sql_statement
    : commit_statement
    | delete_statement
    | insert_statement
    | rollback_statement
    | update_statement
    | merge_statement
    ;

commit_statement
    : K_COMMIT SEMI
    ;
rollback_statement
    : K_ROLLBACK SEMI
    ;
delete_statement
    : K_DELETE ~';'*? SEMI
    ;

insert_statement
        : K_INSERT ~';'*? SEMI
    ;

update_statement
    : K_UPDATE ~';'*? SEMI
    ;

merge_statement
    : K_MERGE K_INTO ~';'*? SEMI
    ;
function
    : (ID DOT)? ID
    ;

cursor
    : ID
    ;
cursor_variable
    : ID
    ;
record
    : ID
    ;

field
    : ID
    ;


db_table_or_view
    : ID
    ;
collection_type
    : ID
    ;
constant
    : ID
    ;

exception_
    : ID
    ;


procedure
    : (schema DOT)? procedure_name
    ;

collection_variable
    : ID
    ;

name
    : ID
    ;
// Undeclared identifier, unique for the block.
label
    : ID
    ;
scalar_datatype
    : (K_VARCHAR2 | K_CHAR | K_VARCHAR) (LPAREN size RPAREN)?
    | K_NUMBER (LPAREN size (COMMA size)? RPAREN)? | K_INT | K_INTEGER
    | K_BOOLEAN
    | K_DATE | K_TIMESTAMP
    | K_BLOB | K_CLOB
    ;

type_attribute
    : variable_or_dbobj PERCENT K_TYPE
    ;

rowtype_attribute
    : variable_or_dbobj PERCENT K_ROWTYPE
    ;

size
    : LITERAL_NUMBER
    ;

character_variable
    : ID
    ;

// 根据 描述 定义
column
    : ID
    ;

numeric_variable
    : variable_or_dbobj
    ;

select_statement
    : select_clause from_clause
    ;

K_AS: A S ;
K_CREATE: C R E A T E ;
K_COMMIT: C O M M I T ;
K_DEFAULT: D E F A U L T ;
K_DELETE: D E L E T E ;
K_END: E N D ;
K_IS: I S ;
K_NOT: N O T ;
K_NULL: N U L L ;
K_OR: O R ;
K_PROCEDURE: P R O C E D U R E ;
K_REPLACE: R E P L A C E ;
K_ROWTYPE: R O W T Y P E ;
K_ROLLBACK: R O L L B A C K ;
K_TYPE: T Y P E ;
K_FOR: F O R;
K_WHILE: W H I L E ;
K_LOOP: L O O P ;
K_TRUE: T R U E ;
K_FALSE: F A L S E ;
K_BETWEEN: B E T W E E N;
K_AND: A N D;
K_IN: I N;
K_INSERT: I N S E R T ;
K_OUT: O U T;
K_LIKE: L I K E;
K_SQL: S Q L;
K_FOUND: F O U N D;
K_ISOPEN: I S O P E N;
K_NOTFOUND: N O T F O U N D;
//K_FIRST: F I R S T;
//K_LAST: L A S T;
//K_NEXT: N E X T;
//K_PRIOR: P R I O R;
K_ROWCOUNT: R O W C O U N T;
K_CASE: C A S E;
K_WHEN: W H E N;
K_THEN: T H E N;
K_ELSE: E L S E;
K_RETURN: R E T U R N;
K_BY: B Y;



K_SELECT: S E L E C T;
K_CURSOR: C U R S O R;

K_CLOSE: C L O S E;

K_CONTINUE: C O N T I N U E;

K_UPDATE: U P D A T E ;
K_INTO: I N T O;


K_EXIT: E X I T;
K_FETCH: F E T C H;
K_REVERSE: R E V E R S E;




K_OF: O F;

K_GOTO: G O T O;
K_IF: I F;
K_ELSIF: E L S I F;
K_OPEN: O P E N;


K_RAISE: R A I S E;


K_BEGIN: B E G I N ;
K_CONSTANT: C O N S T A N T ;

K_VARCHAR2: V A R C H A R '2' ;
K_CHAR: C H A R ;
K_NUMBER: N U M B E R ;
K_INT: I N T ;
K_INTEGER: I N T E G E R ;
K_BOOLEAN: B O O L E A N ;
K_DATE: D A T E ;
K_TIMESTAMP: T I M E S T A M P ;
K_EXECUTE: E X E C U T E ;
K_IMMEDIATE: I M M E D I A T E ;
K_FROM: F R O M ;

K_ROWID: R O W I D ;


K_MERGE: M E R G E ;
K_RECORD: R E C O R D ;
K_CURRENT_DATE: C U R R E N T '_' D A T E ;
K_SYSDATE: S Y S D A T E ;
K_SYSTIMESTAMP: S Y S T I M E S T A M P ;
K_TABLE: T A B L E ;
K_INDEX: I N D E X ;
K_PLS_INTEGER: P L S '_' I N T E G E R ;
K_BINARY_INTEGER: B I N A R Y '_' I N T E G E R ;
K_VARCHAR: V A R C H A R ;
K_STRING: S T R I N G ;
K_LONG: L O N G ;
K_REF: R E F ;
K_EXCEPTION: E X C E P T I O N ;
K_OTHERS: O T H E R S ;
K_SQLCODE: S Q L C O D E ;
K_SQLERRM: S Q L E R R M ;
K_USER: U S E R ;
K_PRAGMA: P R A G M A ;
K_EXCEPTION_INIT: E X C E P T I O N '_' I N I T ;
K_BLOB: B L O B ;
K_CLOB: C L O B ;
K_DECLARE: D E C L A R E ;
//符号
//定义符号
LPAREN: '(' ;
RPAREN: ')' ;
LBRACKETS: '[' ;
RBRACKETS: ']' ;
COMMA: ',' ;
SEMI: ';' ;
DOUBLE_COLON: '::';
COLON: ':' ;
PERCENT: '%' ;
DOUBLE_DOT: '..' ;
DOT: '.' ;
ASSIGN: ':=' ;
PLUS: '+' ;
MINUS: '-' ;
DOUBLE_STAR: '**';
STAR: '*' ;
DIV: '/' ;
DOUBLE_G: '>>' ;
DOUBLE_L: '<<' ;
GE: '>=' ;
LE: '<=' ;
NOT_EQUAL: '!=' | '<>';
GT: '>' ;
LT: '<' ;
EQUAL: '=' ;
DOUBLE_PIPE: '||';

//标识符
ID: [a-zA-Z][a-zA-Z0-9_]* ;
//数字字面量
LITERAL_NUMBER
    : [0-9]+ (DOT [0-9]+)? (E (PLUS | MINUS)? [0-9]+)?
    ;
// -2,147,483,648 through 2,147,483,647, represented in 32 bits.
PLS_INTEGER: [1-9][0-9]* | [0];

//引号字符串
DOUBLE_QUOTED_STRING
    : '"' .*? '"'       //双引号的任意字符串
    ;
SINGLE_QUOTE_STRING
    : '\'' ('\'\'' | ~ ['])* '\''     //单引号得任意字符串
    ;
Q_ESCAPE_STRING
    : 'q\'(' .*? ')\''
    | 'q\'[' .*? ']\''
    | 'q\'{' .*? '}\''
    | 'q\'!' .*? '!\''
    ;
SINGLE_COMMENT
    : '--' .*? ('\r'? '\n'|EOF) -> channel(HIDDEN)
    ;
MULTI_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;
WS: [ \t\r\n]+ -> channel(1) ;

//FRAGMENT
fragment A
    : [aA]
    ;

fragment B
    : [bB]
    ;

fragment C
    : [cC]
    ;

fragment D
    : [dD]
    ;

fragment E
    : [eE]
    ;

fragment F
    : [fF]
    ;

fragment G
    : [gG]
    ;

fragment H
    : [hH]
    ;

fragment I
    : [iI]
    ;

fragment J
    : [jJ]
    ;

fragment K
    : [kK]
    ;

fragment L
    : [lL]
    ;

fragment M
    : [mM]
    ;

fragment N
    : [nN]
    ;

fragment O
    : [oO]
    ;

fragment P
    : [pP]
    ;

fragment Q
    : [qQ]
    ;

fragment R
    : [rR]
    ;

fragment S
    : [sS]
    ;

fragment T
    : [tT]
    ;

fragment U
    : [uU]
    ;

fragment V
    : [vV]
    ;

fragment W
    : [wW]
    ;

fragment X
    : [xX]
    ;

fragment Y
    : [yY]
    ;

fragment Z
    : [zZ]
    ;
