package gram;
 
import gram.i.iAdaptor;
import gram.i.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	%include{sl.tom}
	%include{util/HashMap.tom}
	%include{util/ArrayList.tom}
	%include{util/types/Collection.tom}
	%include{util/types/Set.tom}
	%include{../genI/gram/i/i.tom}


	private String actualFunctionName;
	HashMap<String, Argumentos> functionSignatures;
	private boolean callReturnNeeded;
	private int memAdress;
	StringBuilder functionsDeclarations;
	HashMap<String, Instrucao> funcoesInst;

	public static void menu(String file){

		System.out.println("\n************** Menu ************");
		
		if(file != null)
				System.out.println("\nFicheiro executado:"+file+"\n");

		System.out.println("1 ----------------- Ler ficheiros");
		System.out.println("2 ----------------- Árvore GOM ");
		System.out.println("3 ----------------- Gerar código MSP");
		System.out.println("4 ----------------- Gerar ficheiro .dot");
		System.out.println("5 ----------------- Metricas");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void main(String[] args) throws IOException {

		System.out.println("*************************** Trabalho de ATS ****************************\n");

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		Boolean sair = false;
 		String file = null;
 		String opcao = null;
 		Instrucao p = null;
 		String aux = null;
 		Main main = new Main();
 		ArrayList<Integer> numInstrucao = new ArrayList<Integer>();

		while(sair == false){
 			 
 			 menu(file);
			 
			 opcao = teclado.readLine();
			 
			 switch(opcao){
			 	case "1":
			 		System.out.println("\nDigite o nome do ficheiro: ../exemplos/fi.i | ../exemplos/fatorial.i | ../exemplos/maiorDeDoisNumeros.i");
			 		file = teclado.readLine();
			 		main = new Main();
			 		try{
						iLexer lexer = new iLexer(new ANTLRFileStream(file));
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						iParser parser = new iParser(tokens);
							// Parse the input expression
						Tree b = (Tree) parser.prog().getTree();
						p = (Instrucao) iAdaptor.getTerm(b);
					} catch(Exception e) {
						e.printStackTrace();
					}
			 	break;

			 	case "2":
			 		System.out.println("Arvore gerada = " + p); // name of the Gom module + Adaptor
			 	break;

			 	case "3":
 					System.out.println("Em construção !");
			 	/*		try{
			 				numInstrucao = new ArrayList<Integer>();
							numInstrucao.add(1);
							`TopDown(CollectFuncsSignature(main.functionSignatures)).visit(p);
							Instrucao p2 = p;
							int numInst = numInstrucao.get(0)-1;
							Expressao numInstExps = `Expressoes(Print(Int(numInst)),Print(Char("#")));
							NumToInt n = new NumToInt(1);
							String numInstString = main.compileAnnotExpressoes(numInstExps, n);
							String instrucoes = "";

							System.out.println("\n1--- Injectar falhas");
							System.out.println("2--- Tratar bad smells");
							System.out.println("0--- Sair\n");
							aux = readFile();
							
							if(aux.equals("1")){
								TreeSet<Integer> blocosMaisUsados = new TreeSet<Integer>();
								Main.parseFile(file,blocosMaisUsados);
								numInstrucao.clear();
								numInstrucao.add(1);
								Instrucao p3 = `BottomUp(stratFaultInjectionWithKnowledge(numInstrucao, blocosMaisUsados)).visit(p2);
								instrucoes = main.compileAnnot(p3);
							}
							else if(aux.equals("2")){
								Instrucao p3 = `TopDown(stratBadSmells()).visit(p);
								instrucoes = main.compileAnnot(p3);
							}
							else{
								instrucoes = main.compileAnnot(p2);
							}
							String functionDeclarationsAndArguments = main.functionsDeclarations.toString();
							System.out.println(functionDeclarationsAndArguments + numInstString + instrucoes);
						} 
						catch(VisitFailure e) {
							System.out.println("the strategy failed");
						}*/
			 	break;

			 	case "4":
			 			/* Export this representation to .dot file*/
						try{
							System.out.println("Nome de Ficheiro: ");
							aux = teclado.readLine();
							FileWriter out=new FileWriter(aux);
							Viewer.toDot(p,out);
 						}
						catch (IOException e){
							System.out.println("ERROR in dot file"); 
						}
			 	break;


			 	case "5":
						try{
							System.out.println("\n*********** Métricas ************ ");

							Metrica met = new Metrica();
							
							/* Vai recolher as instruções por função */
							`TopDown(visitFuncoes(main.funcoesInst)).visit(p);

							System.out.println("\nNúmero de funcoes: "+main.funcoesInst.size());

							for(String s : main.funcoesInst.keySet()){
									System.out.println("\nFuncao: "+s);
									
									/* Numero de Linhas */
									int a = linesOfCode(main.funcoesInst.get(s));
								    met.setFuncoesLinhas(s,a);
								    System.out.println("Numero de Linhas: "+a);

								    /* Numero de Argumentos */
								    a = foundDecl(main.funcoesInst.get(s));
								    met.setFuncoesArgs(s,a);
								    System.out.println("Numero de Args: "+a);

								    /* Numero de Blocos aninhados */
								    a = foundNested(main.funcoesInst.get(s));
								    met.setFuncoesNested(s,a);
								    System.out.println("Nested: "+a);
							}

							System.out.println("\nTotal de Linhas: "+met.getTotalLinhas());
							System.out.println("Total de Argumentos: "+met.getTotalArgs());
						}
						catch(VisitFailure e) {
								System.out.println("the strategy failed");
						}
			 	break;

			 	default:
			 		 sair = true;
			 	break;
			 }
		}		
	}

	public Main() {
		actualFunctionName = "";
		functionSignatures = new HashMap<String, Argumentos>();
		callReturnNeeded = true;
		functionsDeclarations = new StringBuilder();
		memAdress = 0;
		funcoesInst = new HashMap<String, Instrucao>();
	}

    /*strategy para gerar o gráfico .dot*/
    %strategy toDot() extends Identity(){
		visit Instrucao{
 			Atribuicao(id,opAtrib,exp) -> {return `Atribuicao(id,opAtrib,exp);}
			Declaracao(tipo,decl) -> {return `Declaracao(tipo,decl);}
			If(condicao,inst1,inst2) -> { return `If(condicao,inst1,inst2);}
	        While(condicao,inst) -> { return `While(condicao,inst);}
			For(decl,condicao,exp,inst) -> { return `For(decl,condicao,exp,inst);}
	        Return(exp) -> { return `Return(exp);}
 			Funcao(tipo,nome,argumentos,inst) -> { return `Funcao(tipo,nome,argumentos,inst);}
 			Exp(exp) -> { return `Exp(exp);}
 			SeqInstrucao(inst1, inst*) -> { return `SeqInstrucao(inst1, inst*);}
        }
	}

    /*vai inserir numa hash as instruções de uma dada função*/
    %strategy visitFuncoes(funcoes:HashMap) extends Identity() {
      visit Instrucao {
      	  Funcao(tipo,nome,argumentos,inst) -> {
      	  		funcoes.put(`nome, `inst);
      	  }
      }
	}

    /*vai contar o numero de vezes que cada instruçao aparece*/
    private static int linesOfCode(Instrucao i) {
    	int aux = 0;
		%match(i) {
			Atribuicao(id,opAtrib,exp) -> { return ++aux;}
	        Declaracao(tipo,decl) -> { return ++aux;}
			If(condicao,inst1,inst2) -> { if(linesOfCode(`inst2)>0) aux=2; return (linesOfCode(`inst1)+2)+(linesOfCode(`inst2)+aux);}
	        While(condicao,inst) -> { return linesOfCode(`inst)+2;}
			For(decl,condicao,exp,inst) -> { return aux+linesOfCode(`inst)+2;}
	        Return(exp) -> { return ++aux;}
 			Funcao(tipo,nome,argumentos,inst) -> { return linesOfCode(`inst);}
 			Exp(exp) -> { return ++aux;}
 			SeqInstrucao(inst1, inst*) -> { return linesOfCode(`inst1)+linesOfCode(`inst*);}
		}
		return aux;
	}

	/*vai contar o numero de declarações*/
	private static int foundDecl(Instrucao i) {
		%match(i) {
	        Declaracao(tipo,decl) -> { return 1; }
	        SeqInstrucao(inst1, inst*) -> { return foundDecl(`inst1)+foundDecl(`inst*);}
		}
		return 0;
	}

	/*vai encontrar o máximo de blocos aninhados de uma dada função*/
	private static int foundNested(Instrucao i) {
		%match(i) {
	        If(condicao,inst1,inst2) -> { return 1+max(foundNested(`inst1),foundNested(`inst2));}
	        While(condicao,inst) -> { return foundNested(`inst)+1;}
			For(decl,condicao,exp,inst) -> { return foundNested(`inst)+1;}
	        SeqInstrucao(inst1, inst*) -> { return max(foundNested(`inst1),foundNested(`inst*));}
		}
		return 0;
	}

	private static int max(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
}

class NumToInt{
	private int num;

	public NumToInt(int num) {
		this.num = num;
	}

	public NumToInt(){
		num = 0;
	}

	public int inc(){
		return num++;
	}
	
	public int get() {
		return num;
	}
}

class Metrica{
	private int funcoes;
	private HashMap<String, Integer> funcoesArgs;
	private HashMap<String, Integer> funcoesLinhas;
	private HashMap<String,Integer> funcoesNested;


	public Metrica() {
		this.funcoes = 0;
		this.funcoesLinhas = new HashMap<String, Integer>();
		this.funcoesArgs = new HashMap<String, Integer>();
		this.funcoesNested = new HashMap<String, Integer>();
	}

	public HashMap <String, Integer> getFuncoesLinhas(){
		return this.funcoesLinhas;
	}

	public HashMap <String, Integer> getFuncoesArgs(){
		return this.funcoesArgs;
	}

	public HashMap <String, Integer> getFuncoesNested(){
		return this.funcoesNested;
	}

	public int getTotalLinhas(){
		int aux = 0;
		
		for(String s : this.funcoesLinhas.keySet()){
		  	aux+=this.funcoesLinhas.get(s);
		  	aux+=2;
		}

		return aux;
	}

	public int getTotalArgs(){
		int aux = 0;
		
		for(String s : this.funcoesArgs.keySet()){
		  	aux+=this.funcoesArgs.get(s);
		}

		return aux;
	}

	public void setFuncoesLinhas(String s, Integer i){
		this.funcoesLinhas.put(s,i);
	}

	public void setFuncoesArgs(String s, Integer i){
		this.funcoesArgs.put(s,i);
	}

	public void setFuncoesNested(String s, Integer i){
		this.funcoesNested.put(s,i);
	}
}
