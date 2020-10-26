grammar Gramatica;

options {
	language=Java;
}

/*prog returns [ double v ]   :

	(e = expr {$v = $e.v;} {System.out.println("Resultado: " + $v);}  NEWLINE*)+ 
	;*/

prog:
   stat* EOF
   ;

stat:
	comando
	; 

comando: 
    	iteracao
	| teste
    	| VAR
	| INT
	//| (e = expr {System.out.println("Resultado: " + $e.v);})+ // só para teste 
    //| rel // só para teste 
	;

iteracao:
	'while' e = rel {System.out.println("Resultado: " + $e.v);} 'do' comando+
	;

teste:
	('if' rel 'then' comando+) teste2 
	;
	
teste2:	
	('else' comando+)
	| 
	;

expr returns [ double v ]:
    INT {$v = Double.parseDouble( $INT.text);} 
    ('+' e = expr {$v += $e.v;} 
    | '-' e = expr {$v -= $e.v;} 
    | '*' e = expr {$v *= $e.v;} 
    | '/' e = expr {$v /= $e.v;} 
    |
    )
    |	'(' e = expr {$v = $e.v;} ')'
    ;

rel returns [ boolean v ]: 
    (VAR | e = expr {System.out.println("Resultado: " + $e.v);}) 
    ( '='  e = expr {System.out.println("Lido '='");}  {System.out.println("Resultado: " + $e.v);} 
    | '<>' e = expr {System.out.println("Lido '<>'");} {System.out.println("Resultado: " + $e.v);} {}
    | '<'  e = expr {System.out.println("Lido '<'");}  {System.out.println("Resultado: " + $e.v);}
    | '>'  e = expr {System.out.println("Lido '>'");}  {System.out.println("Resultado: " + $e.v);}
    | '<=' e = expr {System.out.println("Lido '<='");} {System.out.println("Resultado: " + $e.v);}
    | '>=' e = expr {System.out.println("Lido '>='");} {System.out.println("Resultado: " + $e.v);}
    )
    ;

INT : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;

WS  : (' '|'\n'|'\r')+ {skip();} ;
