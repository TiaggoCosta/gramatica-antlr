grammar Ti;
options {
    language=Java;
}
@members {
String s;
}
prog:   stat+ ; 

stat:   expr | ID '=' expr 
	;

expr:   ID ('*'|'/') expr {s = $ID.text; System.out.println("found "+s);}
    |   ID ('+'|'-') expr {s = $ID.text; System.out.println("found "+s);}
    |	INT ('*'|'/') expr
    |   INT ('+'|'-') expr
    |   INT                    
    |   ID                    
    |   '(' expr ')'         
    ;

INT :	('0'..'9')+ ;
ID  :	('a'..'z')+ ;
WS  :	(' '|'\n'|'\r')+ {skip();} ; // ignore whitespace
