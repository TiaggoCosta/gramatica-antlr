grammar Gramatica;

options {
	language=Java;
}

@header {
    import java.util.HashMap;
}

@members {
    HashMap memory = new HashMap();
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
    atribuicao
    | iteracao
	| teste 
	;

iteracao
    :
	'while' rel {System.out.println("Resultado relacional: " + $rel.t);} 'do' comandos 
	;

atribuicao
    :
    VAR '=' expr 
    {memory.put($VAR.text, new Double($expr.v));} 
    {System.out.println("Variavel " + $VAR.text + " = " + $expr.v);}
    {System.out.println("memory: " + $VAR.text + " = " + memory.get($VAR.text));}
    ;

teste
    :
	('if' rel {System.out.println("Resultado relacional: " + $rel.t);} 'then' comandos) teste2 
	;
	
teste2
    :	
	('else' comandos)
	|
	;

expr returns [ double v ]
    :
    INT {$v = Double.parseDouble( $INT.text);} 
    ( '+' e = expr {$v += $e.v;} 
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
