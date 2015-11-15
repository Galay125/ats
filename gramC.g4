/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar trabalho;


// definicao de tipos
		
idTipo	:	('char' | 'int' | 'boolean' | 'float' | 'void' )
		;
	
tipo	:	(INT | FLOAT | CHAR | boolean_)
		;
	
// programa

prog : 
	programa* EOF 
	;
	
programa :	
	( declaracao ';' | funcao ) 
	;

declaracao :
	idTipo dec_nodo (',' dec_nodo )*
	;

dec_nodo :
	( ID  | ID '=' (expressao|condicao) )
	;
	
funcao :	
	idTipo ID '(' argumentos? ')' blocoCodigo
	;
	
argumentos :
	argumento ( ',' argumento )*
	;

argumento : 
	idTipo ID
	;

// instrucoes
	
instrucao :	
	(if_ | for_  | while_  | return_ ';' | call ';' | print_ ';' )
	;

if_ 	:
	'if'  '('  condicao  ')'  blocoCodigo else_?
	;

else_	:
	'else' ( blocoCodigo | if_ )
	;
	
for_	:
	'for' '(' for_declaracao ';' condicao ';'  expressao ')' blocoCodigo 
	;

for_declaracao : ( declaracao | atribuicao   )
	;
	
while_ :	
	'while' '('  condicao  ')' blocoCodigo
	;
	
return_ :	
	'return' expressao
	;	
		
call	:
	ID   '('  parametros? ')'
	;

print_	:
	'print' '(' expressao ')'
	;
	
input_	:
	'input' '(' idTipo ')'
	;
	
parametros :
	parametro ( ',' parametro)* 
	;

parametro :
	expressao
	;
	
blocoCodigo :
	'{' codigo* '}'
	;

codigo :
	( atribuicao ';'  | declaracao ';' |  instrucao )
	;


// expressao de condicao
	
condicao  :
	condicao_ou ('?' expressao ':' condicao |  condicao_ou )*
	;
	
condicao_ou : 
	(condicao_e) ( '||' condicao_e )*
	;
	
condicao_e :
	(condicao_comparacao) ( '&&' condicao_comparacao )*
	;
	
condicao_comparacao :
	(condicao_igualdade) ( '>' condicao_igualdade | '<' condicao_igualdade | '>=' condicao_igualdade | '<=' condicao_igualdade)*
	;

condicao_igualdade :
	(expressao)  ( ( '!=' expressao | '==' expressao) )*
	;
	
// expressao de atribuicao
	
atribuicao :
	ID opAtribuicao (expressao|condicao)
	;
	
opAtribuicao : 
	( '='  | '*=' | '/=' | '+=' | '-=' )
	;	
	
// expressao numerica
	
expressao :
	(expressaoNum)	(( '+' expressaoNum | '-' expressaoNum ))*
	;

expressaoNum :
	(oper) ( ( '*' oper | '/' oper  | '%' oper  ) )*
	;
	
oper :
	( opUnario ID )
	| opUnario tipo 
	| tipo 
	| ID 
	| incOp ID
	| ID incOp
	| call
	| input_
	;
	
incOp : 
	( '++' | '--' )
	;
	
opUnario :
	( '+' | '-' | '!' )
	;
	
boolean_	:	('true' | 'false')
		;


// Tokens lex


CHAR 	
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
	
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')  -> skip
    ;
