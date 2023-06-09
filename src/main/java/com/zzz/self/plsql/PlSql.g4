grammar PlSql;

options {
  language = Java;
}

selectStatement : selectClause fromClause whereClause? ;

selectClause : 'SELECT' (selectList | '*') ;

selectList : selectItem (',' selectItem)* ;

selectItem : columnIdentifier ;

columnIdentifier : Identifier ('.' Identifier)? ;

fromClause : 'FROM' tableName ;

tableName : Identifier ;

whereClause : 'WHERE' condition ;

condition : expression ;

expression : Identifier Operator Value ;

Identifier : [a-zA-Z]+ ;

Operator : '=' | '<' | '>' | '<=' | '>=' | '<>';

Value : [0-9]+ | '\'' [a-zA-Z0-9]+ '\'' ;

WS : [ \t\r\n]+ -> skip ;
