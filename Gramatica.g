grammar Gramatica;

options {
	language=Java;
}

@header {
    import java.util.HashMap;
}

@members {
    HashMap<String, Double> memory = new HashMap<>();
    boolean result = false;
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
	| condicao 
	;

iteracao
    :
	WHILE rel DO comandos
	;

atribuicao
    :
    VAR ':=' expr 
    { memory.put($VAR.text, new Double($expr.v)); } 
    { System.out.println("Variavel " + $VAR.text + " = " + $expr.v + " inserida na mem�ria"); }
    ;

condicao
    :
      IF rel THEN
        (comandos)*
        condicaoPart
    ;

condicaoPart
    :
      (ELSE (comandos)*)?
    ;


expr returns [ double v ]
    :
    ( INT { $v = Double.parseDouble($INT.text); } {System.out.println("Lido valor constante: " + $v);}
    | VAR { $v = memory.getOrDefault($VAR.text, 0.0); } {System.out.println("Lido da mem�ria de vari�veis: " + $v);} )
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
    ( '='  {System.out.println("Lido expr rel: = " );} d = expr {$t = $e.v == $d.v;} {System.out.println("Resultado expr rel " + $e.v + " = "  + $d.v + " : " + $t); result = $t;} 
    | '<>' {System.out.println("Lido expr rel: <> ");} d = expr {$t = $e.v != $d.v;} {System.out.println("Resultado expr rel " + $e.v + " <> " + $d.v + " : " + $t); result = $t;} 
    | '<'  {System.out.println("Lido expr rel: < " );} d = expr {$t = $e.v <  $d.v;} {System.out.println("Resultado expr rel " + $e.v + " < "  + $d.v + " : " + $t); result = $t;}
    | '>'  {System.out.println("Lido expr rel: > " );} d = expr {$t = $e.v >  $d.v;} {System.out.println("Resultado expr rel " + $e.v + " > "  + $d.v + " : " + $t); result = $t;} 
    | '<=' {System.out.println("Lido expr rel: <= ");} d = expr {$t = $e.v <= $d.v;} {System.out.println("Resultado expr rel " + $e.v + " <= " + $d.v + " : " + $t); result = $t;}
    | '>=' {System.out.println("Lido expr rel: >= ");} d = expr {$t = $e.v >= $d.v;} {System.out.println("Resultado expr rel " + $e.v + " >= " + $d.v + " : " + $t); result = $t;}
    )   
    //{if (result == false) returns comandos;}  
    ;

DO   : 'do';
ELSE : 'else';
IF   : 'if';
WHILE: 'while';
THEN : 'then';
END  : 'end';

INT  : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;

WS   : (' '|'\n'|'\r')+ {skip();} ;

