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
	//| teste
    //| atribuicao
	iteracao
	|  expr 
	;

iteracao:
	'while' rel 'do' comando+
	;

expr returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);} 
    ('+' e = expr {$v += $e.v;} {System.out.println("Resultado: " + $e.v);} // só para teste 
    | '-' e = expr {$v -= $e.v;} {System.out.println("Resultado: " + $e.v);} // só para teste 
    | '*' e = expr {$v *= $e.v;} {System.out.println("Resultado: " + $e.v);} // só para teste 
    | '/' e = expr {$v /= $e.v;} {System.out.println("Resultado: " + $e.v);} // só para teste 
    )

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
