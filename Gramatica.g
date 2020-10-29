grammar Gramatica;

options {
	language=Java;
}

prog
    :
    stat* EOF
    ;

stat
    :
	comandos
	; 

comandos
    :
    (comando ';')+
    ;

comando
    : 
    iteracao
    //| atribuicao
	| teste

    //| VAR // só para teste
	| INT // só para teste
	//| (e = expr {System.out.println("Resultado: " + $e.v);})+ // só para teste 
    //| rel // só para teste 
	;

iteracao
    :
	'while' e = rel {System.out.println("Resultado relacional: " + $e.t);} 'do' comandos 
	;

teste
    :
	('if' rel 'then' comandos) teste2 
	;
	
teste2
    :	
	('else' comandos)
	|
	;

expr returns [ double v ]
    :
    INT {$v = Double.parseDouble( $INT.text);} 
    ('+' e = expr {$v += $e.v;} 
    | '-' e = expr {$v -= $e.v;} 
    | '*' e = expr {$v *= $e.v;} 
    | '/' e = expr {$v /= $e.v;} 
    |
    )
    //|	'(' e = expr {$v = $e.v;} ')'
    ;

rel returns [ boolean t ]
    : 
    ( d = expr {System.out.println("Resultado: " + $d.v);}) 
    ( '='  e = expr {System.out.println("Lido '='");}  {System.out.println("Resultado: " + $e.v);} {$t = $d.v == $e.v;}
    | '<>' e = expr {System.out.println("Lido '<>'");} {System.out.println("Resultado: " + $e.v);} {$t = $d.v != $e.v;}
    | '<'  e = expr {System.out.println("Lido '<'");}  {System.out.println("Resultado: " + $e.v);} {$t = $d.v <  $e.v;}
    | '>'  e = expr {System.out.println("Lido '>'");}  {System.out.println("Resultado: " + $e.v);} {$t = $d.v >  $e.v;}
    | '<=' e = expr {System.out.println("Lido '<='");} {System.out.println("Resultado: " + $e.v);} {$t = $d.v <= $e.v;}
    | '>=' e = expr {System.out.println("Lido '>='");} {System.out.println("Resultado: " + $e.v);} {$t = $d.v >= $e.v;}
    )
    ;

INT : ('0'..'9')+ ;
VAR : ('a'..'z')+ ;

WS  : (' '|'\n'|'\r')+ {skip();} ;
