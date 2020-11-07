grammar Gramatica;

options {
	language=Java;
}

@header {
    import java.util.HashMap;
}

@members {
    HashMap<String, Double> memory = new HashMap<>();
}

prog
    :
    stat+ EOF
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
	'while' rel 'do' comandos
	;

atribuicao
    :
    VAR ':=' expr 
    { memory.put($VAR.text, new Double($expr.v)); } 
    { System.out.println("Variavel " + $VAR.text + " = " + $expr.v + " inserida na memória"); }
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
    ( INT { $v = Double.parseDouble($INT.text); } {System.out.println("Lido valor constante: " + $v);}
    | VAR { $v = memory.getOrDefault($VAR.text, 0.0); } {System.out.println("Lido da memória de variáveis: " + $v);} )
    ( '+' {System.out.println("lido: + ");} e = expr {$v += $e.v;} {System.out.println("Resultado da soma: " + $v);}
    | '-' {System.out.println("lido: - ");} e = expr {$v -= $e.v;} {System.out.println("Resultado da subtracao: " + $v);}
    | '*' {System.out.println("lido: * ");} e = expr {$v *= $e.v;} {System.out.println("Resultado da multiplicacao: " + $v);}
    | '/' {System.out.println("lido: / ");} e = expr {$v /= $e.v;} {System.out.println("Resultado da divisao: " + $v);}
    |
    )
    | '(' e = expr {$v = $e.v;} ')'
    ;

rel returns [ boolean t ]
    : 
    ( e = expr ) 
    ( '='  {System.out.println("Lido expr rel: = ");} d = expr {$t = $e.v == $d.v;} {System.out.println("Resultado expr rel " + $e.v + " = " + $d.v + " : " + $t);}
    | '<>' {System.out.println("Lido expr rel: <> ");} d = expr {$t = $e.v != $d.v;} {System.out.println("Resultado expr rel " + $e.v + " <> " + $d.v + " : " + $t);}
    | '<'  {System.out.println("Lido expr rel: < ");} d = expr {$t = $e.v <  $d.v;} {System.out.println("Resultado expr rel " + $e.v + " < " + $d.v + " : " + $t);}
    | '>'  {System.out.println("Lido expr rel: > ");} d = expr {$t = $e.v >  $d.v;} {System.out.println("Resultado expr rel " + $e.v + " > " + $d.v + " : " + $t);}
    | '<=' {System.out.println("Lido expr rel: <= ");} d = expr {$t = $e.v <= $d.v;} {System.out.println("Resultado expr rel " + $e.v + " <= " + $d.v + " : " + $t);}
    | '>=' {System.out.println("Lido expr rel: >= ");} d = expr {$t = $e.v >= $d.v;} {System.out.println("Resultado expr rel " + $e.v + " >= " + $d.v + " : " + $t);}
    )
    ;
//{ $op = '=';} {$t = $e.v == $d.v;} {System.out.println($e.v + $op + $d.v + '=' + $t);}
INT : ('0'..'9')+ ;
VAR : ('a'..'z')+ ;

WS  : (' '|'\n'|'\r')+ {skip();} ;
