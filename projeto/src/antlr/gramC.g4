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
	/* Nome da função */
	private String func;
	
	/* Argumentos Globais */
	private int argsGlobal = 0;
	
	/* Linhas por Função */
    private HashMap<String,Integer> linesFunc = new HashMap<String,Integer>();
    private int linesAux;
    
    /* Argumentos por Função */
    private HashMap<String,Integer> argsFunc = new HashMap<String,Integer>();
    private int argsAux;
    
    /* Nasted Blocks */
    private HashMap<String,Integer> blocksFunc = new HashMap<String,Integer>();
    private int blocksAux;
    
    public int getFuncs(){
    	return this.linesFunc.size();
    }
    
    public HashMap<String,Integer> getLinesFunc(){
    	return this.linesFunc;
    }
    
    public int getLines(){
    	int aux=0;
    	for(String s : this.linesFunc.keySet()){
               aux+=this.linesFunc.get(s);
        }
        aux += (this.linesFunc.size()*2);
        return aux;
    }
    
    public HashMap<String,Integer> getArgsFunc(){
    	return this.argsFunc;
    }
    
    public int getArgs(){
    	int aux=0;
    	for(String s : this.argsFunc.keySet()){
               aux+=this.argsFunc.get(s);
        }
    	return aux+this.argsGlobal;
    }
    
    public HashMap<String,Integer> getNastedBlocks(){
    	return this.blocksFunc;
    }
    
}


// definicao de tipos
		
idTipo	:	('char' | 'int' | 'boolean' | 'float' | 'void' )
		;
	
tipo	:	(INT | FLOAT | CHAR | boolean_)
		;
	
// programa

prog : 
	programa* EOF  
	;
	
programa 
@init{ linesAux=0; argsAux=0; blocksAux=0;}:
	( declaracao ';' {argsGlobal+=argsAux;} | funcao  ) 
	;

declaracao :
	idTipo dec_nodo (',' dec_nodo | ';' idTipo dec_nodo)*
	;

dec_nodo :
	( ID  | ID '=' (expressao|condicao) )  {argsAux++;}
	;
	
funcao :	
	idTipo ID {func = $ID.text; 	blocksFunc.put(func, 0);}   '(' argumentos?  ')' blocoCodigo 
	{ 
		linesFunc.put(func, linesAux-1); 
		argsFunc.put(func, argsAux); 
	}
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
	'if'  '('  condicao  ')' {blocksAux++;}  blocoCodigo 
							 {	if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;} 
	else_?
	;

else_	:
	'else' ( {blocksAux++;}  blocoCodigo 
							 {	if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;}  | if_ )
	;
	
for_	:
	'for' '(' for_declaracao ';' condicao ';'  expressao ')' {blocksAux++;}  blocoCodigo 
							 {  if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;} 
	;

for_declaracao : 
  ( declaracao | atribuicao   )
	;
	
while_ :	
	'while' '('  condicao  ')' {blocksAux++;}  blocoCodigo 
							 {  if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;} 
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
	( atribuicao ';'  | declaracao ';' |  instrucao ) { linesAux++;}
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
	
boolean_	:	
('true' | 'false')
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