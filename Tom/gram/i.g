grammar i;

options {
  output=AST;
  ASTLabelType=Tree;
  tokenVocab=iTokens;
}

@header { package gram; }
@lexer::header { package gram; }


// definicao de tipos
		
idTipo	:	('char' -> ^(DChar) | 'int' -> ^(DInt) | 'boolean' -> ^(DBoolean) | 'float' -> ^(DFloat) | 'void' -> ^(DVoid) )
		;
	
tipo	:	(INT -> ^(Int INT) | FLOAT -> ^(Float FLOAT) | CHAR -> ^(Char CHAR) | boolean_ -> boolean_)
		;
	
// programa

prog : 
	programa* EOF -> ^(SeqInstrucao programa*)
	;
	
programa :	
	( declaracao ';' -> declaracao
	| funcao -> funcao
	)
	;

declaracao :
	idTipo dec_nodo -> ^(Declaracao idTipo ^(ListaDecl dec_nodo*))
	;

dec_nodo :
	( ID -> ^(Decl ID Empty )
	| ID '=' condicao -> ^(Decl ID condicao ) 
	)
	;
	
funcao :	
	 idTipo  ID  '('  argumentos?  ')'  blocoCodigo  -> ^(Funcao  idTipo  ID   ^(ListaArgumentos argumentos?)   blocoCodigo )
	;
	
argumentos :
	argumento ( ',' argumento )* -> argumento+
	;

argumento : 
	 idTipo  ID  -> ^(Argumento  idTipo  ID )
	;

// instrucoes
	
instrucao :	
	(if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^(Exp call) | print_ ';' -> print_)
	;

if_ 	:
	 'if'  '('  condicao  ')'  blocoCodigo ( else_ -> ^(If    condicao   blocoCodigo else_)
																						| -> ^(If    condicao   blocoCodigo ^(SeqInstrucao) )
																						)
	;

else_	:
	'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ )
	;
	
for_	:
	 'for'  '(' for_declaracao ';'  condicao  ';'  expressao  ')'  blocoCodigo  -> ^(For   for_declaracao  condicao   expressao   blocoCodigo ) 
	;

for_declaracao :
	( declaracao -> declaracao
	| atribuicao -> atribuicao 
	)
	;
	
while_ :	
	 'while'  '('  condicao  ')'  blocoCodigo  -> ^(While    condicao   blocoCodigo )
	;
	
return_ 	:	
	 'return'  expressao  -> ^(Return   expressao )
	;	
		
call	:
	 ID   '('  parametros?  ')'  -> ^(Call  ID   ^(ListaParametros parametros?)  )
	;

print_	:
	 'print'  '('  expressao  ')'  -> ^(Exp ^(Print    expressao  ))
	;
	
input_	:
	 'input'  '('  idTipo  ')'  -> ^(Input    idTipo  )
	;
	
parametros :
	parametro ( ',' parametro)* ->  parametro+
	;

parametro :
	 expressao  -> ^(Parametro  expressao )
	;
	
blocoCodigo :
	'{' codigo* '}' -> ^(SeqInstrucao codigo*)
	;

codigo :
	(	atribuicao ';' -> atribuicao
	|	declaracao ';' -> declaracao
	|	instrucao -> instrucao
	)
	;


// expressao de condicao
	
condicao  :
	condicao_ou (  '?'  expressao  ':'  condicao -> ^(Condicional condicao_ou   expressao   condicao)
				| -> condicao_ou
				)
	;
	
condicao_ou : 
	(condicao_e -> condicao_e) (  '||'  c=condicao_e -> ^(Ou $condicao_ou   $c ) )*
	;
	
condicao_e :
	(condicao_comparacao -> condicao_comparacao) (  '&&'  c=condicao_comparacao -> ^(E $condicao_e   $c ) )*
	;
	
condicao_comparacao :
	(condicao_igualdade -> condicao_igualdade) 	( 	( '>'  c=condicao_igualdade -> ^(Comp $condicao_comparacao  ^(Maior)  $c )
																	| '<'  c=condicao_igualdade -> ^(Comp $condicao_comparacao  ^(Menor)  $c )
																	| '>='  c=condicao_igualdade -> ^(Comp $condicao_comparacao  ^(MaiorQ)  $c )
																	| '<='  c=condicao_igualdade -> ^(Comp $condicao_comparacao  ^(MenorQ)  $c )
																	) 
												)*
	;

condicao_igualdade :
	(expressao -> expressao)	( 	( '!='  e=expressao -> ^(Comp $condicao_igualdade  ^(Dif)  $e )
													| '=='  e=expressao -> ^(Comp $condicao_igualdade  ^(Igual)  $e )
													) 
								)*
	;
	
// expressao de atribuicao
	
atribuicao :
	 ID  opAtribuicao  condicao  -> ^(Atribuicao  ID  opAtribuicao  condicao )
	;
	
opAtribuicao : 
	( '=' -> ^(Atrib)
	| '*=' -> ^(Mult)
	| '/=' -> ^(Div)
	| '+=' -> ^(Soma)
	| '-=' -> ^(Sub)
	)
	;	
	
// expressao numerica
	
expressao :
	(expressaoNum -> expressaoNum)	( 	( '+'  e=expressaoNum -> ^(ExpNum $expressao  ^(Mais)  $e )
														| '-'  e=expressaoNum -> ^(ExpNum $expressao  ^(Menos)  $e )
														)
									)*
	;

expressaoNum :
	(oper -> oper) ( 	( '*'  o=oper -> ^(ExpNum $expressaoNum  ^(Vezes)  $o )
									| '/'  o=oper -> ^(ExpNum $expressaoNum  ^(Divide)  $o )
									| '%'  o=oper -> ^(ExpNum $expressaoNum  ^(Mod)  $o )
									) 
					)*
	;
	
oper :
	( opUnario ID -> ^(opUnario ^(Id ID))
	| opUnario tipo -> ^(opUnario tipo)
	| tipo -> tipo 
	| ID -> ^(Id ID)
	| incOp ID -> ^(IncAntes incOp ID)
	| ID incOp -> ^(IncDepois incOp ID)
	| call -> call
	| input_ -> input_
	)
	;
	
incOp : 
	( '++' -> ^(Inc) | '--' -> ^(Dec))
	;
	
opUnario :
	( '+' -> ^(Pos)
	| '-' -> ^(Neg)
	| '!' -> ^(Nao)
	)
	;
	
boolean_	:	('true' -> ^(True) | 'false' -> ^(False))
		;

// Tokens lex


CHAR 
@after
{
    setText(getText().substring(1, getText().length()-1));
} 	
	:	'\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\''|'\\') ) '\''
	;

fragment DIGITO
 	:	('0'..'9')+
	;

FLOAT 	
	:	DIGITO+ '.' DIGITO* SufixoFloat?
	|	'.' DIGITO+ SufixoFloat?
	|	INT SufixoFloat
	;
	
SufixoFloat 
	:	':f'|':F'
	;
	
INT	
	:	('0' | '1'..'9' DIGITO*)
	;
	
ID 	:	LETRA ( LETRA | '0'..'9' )*
	;
	
fragment LETRA	
	:	'a'..'z' | 'A'..'Z' | '_'
	;
	
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;
