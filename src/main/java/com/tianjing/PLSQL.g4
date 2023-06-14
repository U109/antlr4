grammar PLSQL ;
import PLSQLToken ;

plsql_file
    : create_procedure (DIV create_procedure)* DIV?
    ;

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

select_clause
    : K_SELECT ~';'*?
    ;

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
