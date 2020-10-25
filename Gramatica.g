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
	iteracao
	; 

iteracao:
	'while' rel 'do' comando+
	;

comando: 
	//| teste
	iteracao
	| expr
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

rel returns [ boolean v ]: 
    VAR 
    ( '='  expr {System.out.println("Lido '='");} 
    | '<>' expr {System.out.println("Lido '<>'");} 
    | '<'  expr {System.out.println("Lido '<'");} 
    | '>'  expr {System.out.println("Lido '>'");}
    | '<=' expr {System.out.println("Lido '<='");}
    | '>=' expr {System.out.println("Lido '>='");})
    ;

INT : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;

WS  : (' '|'\n'|'\r')+ {skip();} ;
