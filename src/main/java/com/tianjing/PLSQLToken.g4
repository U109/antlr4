lexer grammar PLSQLToken ;

//以下为PLSQL词法部分
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