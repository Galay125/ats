    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar GrammarMachine;

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

programa : 
	instrucao (',' instrucao {System.out.println("O galay é gay");})* EOF
	;

instrucao
	:	'ALabel' STRING
	//
	|	'Call' STRING   //call function
	|	'Ret'           //return function
	//
	|	'Add'			//arithmetic and boolean instructions
	| 	'Sub' 
	|	'Div' 
	|	'Mul'
	|	'Mod' 
	|	'Inc'
	|	'Dec' 
	|	'Eq' 
	|	'Neq' 
	|	'Gt' 
	|	'GoEq'
	|	'Lt' 
	|	'LoEq'
	|	'Not'
	|	'Or'
	|	'And' 
	//
	|	'Halt'			//Halt the machine
	//
	|	'IIn' 	idTipo		//IO
	|	'IOut' 
	//				
	|	'Jump' STRING 		//Jump Instructions
	|	'Jumpf' STRING 
	//
	|	'Pusha' STRING 		//Stack Operations
	|	'Pushi' INT 
	|	'Pushc' CHAR 
	|	'Pushf' FLOAT 
	|	'Pushb' boolean_
	|	'Load' 
	|	'Store' 
	|	'Decl' STRING INT INT 
	;
	
/*
valor
	:	FLOAT -> ^(F FLOAT)
	|	INT -> ^(I INT)
	|	STRING ->	^(S STRING)
	|	boolean_ -> ^(B boolean_)
	|	 -> ^(Vazio)
	;
*/

boolean_
	:	'true' 
	|	'false' 
	;
	
idTipo	:	'char' 
                | 'int'  
                | 'boolean' 
                | 'float' 
		;

// Tokens lex

STRING	:	'\"' ~('"')* '\"'
	;
	
CHAR	:	'\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\''|'\\') ) '\''
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
	:	'f'|'F'
	;
	
INT	
	:	('0' | '1'..'9' DIGITO*)
	;
	
ID 	:	LETRA ( LETRA | '0'..'9' )*
	;
	
fragment LETRA	
	:	'a'..'z' | 'A'..'Z' | '_'
	;
	
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')->skip
    ;