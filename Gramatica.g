grammar Gramatica;

options {
	language=Java;
}

prog returns [ double v ]   :

	(e = expr {$v = $e.v;} {System.out.println("Resultado: " + $v);}  NEWLINE*)+ 
	;

expr returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);} 
    ('+' e = expr {$v += $e.v;} 
    | '-' e = expr {$v -= $e.v;} 
    | '*' e = expr {$v *= $e.v;} 
    | '/' e = expr {$v /= $e.v;})

    |	INT {$v = Double.parseDouble( $INT.text);}

    |	'(' e = expr {$v = $e.v;} ')'
    ;
/* 
rel returns [ boolean v ]: 
    expr 
    ( '='  e = expr {$v == $e.v;} 
    | '<>' e = expr {$v != $e.v;} 
    | '<'  e = expr {$v <  $e.v;} 
    | '>'  e = expr {$v >  $e.v;}
    | '<=' e = expr {$v <= $e.v;}
    | '>=' e = expr {$v >= $e.v;})
    ;
 */
VAR  :	('a'..'z'|'A'..'Z')+
    ;

INT :	'0'..'9'+
    ;

NEWLINE : ('\r' | '\n')+ 
    ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
