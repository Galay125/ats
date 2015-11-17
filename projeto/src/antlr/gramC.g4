/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


grammar gramC;

@header{
        import java.util.*;
}

@members{
    HashMap<String,Integer> linesFunc = new HashMap<String,Integer>();
    int linesAux;
    
    HashMap<String,Integer> argsFunc = new HashMap<String,Integer>();
    int argsAux;
}


// definicao de tipos
		
idTipo	:	('char' | 'int' | 'boolean' | 'float' | 'void' )
		;
	
tipo	:	(INT | FLOAT | CHAR | boolean_)
		;
	
// programa

prog : 
	programa* EOF  
                        {   System.out.println("Funções: " + linesFunc.size());
                            int aux = 0;
                            for(String s : linesFunc.keySet()){
                                aux+=linesFunc.get(s);
                                System.out.println("Função: "+ s +" = "+ linesFunc.get(s) +" Linhas");
                                System.out.println("Args:  "+ argsFunc.get(s));
                            }
                            int total = aux + (linesFunc.size()*2);
                            System.out.println("Numero Total de Linhas: " + total);
                        }
	;
	
programa 
@init{ linesAux=0; argsAux=0;}:
	( declaracao ';' | funcao  ) 
	;

declaracao :
	idTipo dec_nodo (',' dec_nodo )*
	;

dec_nodo :
	( ID  | ID '=' (expressao|condicao) )
	;
	
funcao :	
	idTipo ID   '(' argumentos? { argsFunc.put($ID.text, argsAux); }
        ')' blocoCodigo { linesFunc.put($ID.text, linesAux-1); }
	;
	
argumentos :
	argumento ( ',' argumento )*
	;

argumento : 
	idTipo ID {argsAux++;}
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
	'{'   codigo*   { linesAux++; } '}' 
	;

codigo :
	( atribuicao ';'  | declaracao ';' |  instrucao ) { linesAux++; }
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
	(condicao_igualdade) ( '>' condicao_igualdade | '<' condicao_igualdade | '>=' condicao_igualdade | '<=' condicao_igualdade )*
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