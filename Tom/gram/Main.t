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
import java.text.DecimalFormat;
import java.math.RoundingMode;

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
 		Metrica met = new Metrica();

		while(sair == false){
 			 
 			 menu(file);
			 
			 opcao = teclado.readLine();
			 
			 switch(opcao){
			 	case "1":
			 		System.out.println("\nDigite o nome do ficheiro: ");
			 		file = teclado.readLine();
			 		main = new Main();
			 		try{
						iLexer lexer = new iLexer(new ANTLRFileStream("../exemplos/"+file));
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

							if(main.funcoesInst.size()==0){
								/* Vai recolher as instruções por função */
								`TopDown(visitFuncoes(main.funcoesInst)).visit(p);
							}

							System.out.println("\nNúmero de funcoes: "+main.funcoesInst.size());

							System.out.println("1 ----------------- Linhas");
							System.out.println("2 ----------------- Variaveis Declaradas ");
							System.out.println("3 ----------------- Numero de Argumentos ");
							System.out.println("4 ----------------- Blocos Aninhados");
							System.out.println("5 ----------------- Cyclomatic Complexity");
							System.out.println("6 ----------------- Avaliar Todas as Métricas");
							System.out.println("0 ----------------- Voltar");

 							opcao = teclado.readLine();
							int a;
							Double r;

							switch(opcao){
								case "1":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = linesOfCode(main.funcoesInst.get(s));
										met.setFuncoesLinhas(s,a);
										System.out.println("Numero de Linhas: "+a);
									}
									System.out.println("\nTotal de Linhas: "+met.getTotalLinhas());
								break;

								case "2":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundDecl(main.funcoesInst.get(s));
										met.setFuncoesDecl(s,a);
										System.out.println("Numero de Declaracoes: "+a);
									}
										System.out.println("\nTotal de Declaracoes: "+met.getTotalDecl());
								break;

								case "3":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundArgs(s,p);
										met.setFuncoesArgs(s,a);
										System.out.println("Numero de Argumentos: "+a);
									}
										System.out.println("\nTotal de Argumentos: "+met.getTotalArgs());
								break;

								case "4":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundNested(main.funcoesInst.get(s));
										met.setFuncoesNested(s,a);
										System.out.println("Maior Bloco Aninhado: "+a);
									}
								break;

								case "5":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundCC(main.funcoesInst.get(s))+1;
										met.setFuncoesCC(s,a);
										System.out.println("Cyclomatic Complexity: "+a);
									}
								break;

								case "6":
									for(String s : main.funcoesInst.keySet()){
										met.funcoes++;
										
										System.out.println("\n----> Funcao: "+s);
										a = linesOfCode(main.funcoesInst.get(s));
										met.setFuncoesLinhas(s,a);
										System.out.println("Numero de Linhas: "+a+ " | Max("+met.getMaxLinhas()+")");

										a = foundDecl(main.funcoesInst.get(s));
										met.setFuncoesDecl(s,a);
										System.out.println("Numero de Declaracoes: "+a+" | Max("+met.getMaxDecl()+")");

										a = foundArgs(s,p);
										met.setFuncoesArgs(s,a);
										System.out.println("Numero de Argumentos: "+a+" | Max("+met.getMaxArgs()+")");

										a = foundNested(main.funcoesInst.get(s));
										met.setFuncoesNested(s,a);
										System.out.println("Maior Bloco Aninhado: "+a+" | Max("+met.getMaxNested()+")");

										a = foundCC(main.funcoesInst.get(s))+1;
										met.setFuncoesCC(s,a);
										System.out.println("Cyclomatic Complexity: "+a+" | Max("+met.getMaxCC()+")");

										DecimalFormat df = new DecimalFormat("#.#");
										df.setRoundingMode(RoundingMode.FLOOR);

										r = met.classificaFuncao(s);	
										met.setRank(s,r);
										System.out.println("-> Star Ranking: "+df.format(r)+" em 5");
									}
									System.out.println("\n\nTotal de Linhas: "+met.getTotalLinhas());
									System.out.println("Total de Declaracoes: "+met.getTotalDecl());
									System.out.println("Total de Argumentos: "+met.getTotalArgs());

									System.out.println("\nStar Ranking do Programa: "+met.getRank()+" em 5");

								break;
							}
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
			Atribuicao(id,opAtrib,exp) -> { return 1;}
	        Declaracao(tipo,decl) -> { return 1;}
			If(condicao,inst1,inst2) -> { if(linesOfCode(`inst2)>0) aux=2; return (linesOfCode(`inst1)+2)+(linesOfCode(`inst2)+aux);}
	        While(condicao,inst) -> { return linesOfCode(`inst)+2;}
			For(decl,condicao,exp,inst) -> { return linesOfCode(`inst)+2;}
	        Return(exp) -> { return 1;}
 			Funcao(tipo,nome,argumentos,inst) -> { return linesOfCode(`inst);}
 			Exp(exp) -> { return 1;}
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

	/*vai contar o numero de argumentos por função*/
	private static int foundArgs(String funcao, Instrucao i) {
		%match(i) {
	        Funcao(tipo,nome,argumentos,inst) -> { if(funcao.equals(`nome)) return foundListArgs(`argumentos); }
	        SeqInstrucao(inst1, inst*) -> { return foundArgs(funcao, `inst1)+foundArgs(funcao, `inst*);}
		}
		return 0;
	}

	/*vai contar o numero de argumentos de uma dada lista de argumentos*/
	private static int foundListArgs(Argumentos args) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> { return foundListArgs(`arg1)+foundListArgs(`tailArg*); }
			Argumento(_,idArg) -> { return 1; }
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

	/*vai calcuar o cyclometic complexity com a formula D+1 (D = pontos de decisão)*/
	private static int foundCC(Instrucao i) {
		%match(i) {
	        If(condicao,inst1,inst2) -> { return 1+foundCC(`inst1)+foundCC(`inst2)+foundBoolean(`condicao);}
	        While(condicao,inst) -> { return 1+foundCC(`inst)+foundBoolean(`condicao);}
			For(decl,condicao,exp,inst) -> { return 1+foundCC(`inst)+foundBoolean(`condicao);}
	        SeqInstrucao(inst1, inst*) -> { return foundCC(`inst1)+foundCC(`inst*);}
		}
		return 0;
	}

	/* Numero de operações booleanas nas operaçoes de condição (auxiliar para o CC) */
	private static int foundBoolean(Expressao e) {
		%match(e) {
	        E(cond1,cond2) -> { return 1+foundBoolean(`cond1)+foundBoolean(`cond2);}
	        Ou(cond1,cond2) -> { return 1+foundBoolean(`cond1)+foundBoolean(`cond2);}
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
	public int funcoes;
	private HashMap<String, Integer> funcoesLinhas;
	private HashMap<String, Integer> funcoesDecl;
	private HashMap<String, Integer> funcoesArgs;
	private HashMap<String, Integer> funcoesNested;
	private HashMap<String, Integer> funcoesCC;
	private HashMap<String, Double> funcoesRank;

	/*Classificar métricas*/
	private Integer maxLinhas = 15;
	private Integer maxDecl = 5;
	private Integer maxArgs = 3;
	private Integer maxNested = 3;
	private Integer maxCC = 5;

	public Metrica() {
		this.funcoes = 0;
		this.funcoesLinhas = new HashMap<String, Integer>();
		this.funcoesDecl = new HashMap<String, Integer>();
		this.funcoesArgs = new HashMap<String, Integer>();
		this.funcoesNested = new HashMap<String, Integer>();
		this.funcoesCC = new HashMap<String, Integer>();
		this.funcoesRank = new HashMap<String, Double>();
	}

	public HashMap <String, Integer> getFuncoesLinhas(){
		return this.funcoesLinhas;
	}

	public HashMap <String, Integer> getFuncoesDecl(){
		return this.funcoesDecl;
	}

	public HashMap <String, Integer> getFuncoesArgs(){
		return this.funcoesArgs;
	}

	public HashMap <String, Integer> getFuncoesNested(){
		return this.funcoesNested;
	}

	public HashMap <String, Integer> getFuncoesCC(){
		return this.funcoesCC;
	}

	public int getMaxLinhas(){
		return this.maxLinhas;
	}

	public int getMaxDecl(){
		return this.maxDecl;
	}

	public int getMaxArgs(){
		return this.maxArgs;
	}

	public int getMaxNested(){
		return this.maxNested;
	}

	public int getMaxCC(){
		return this.maxCC;
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

	public int getTotalDecl(){
		int aux = 0;
		
		for(String s : this.funcoesDecl.keySet()){
		  	aux+=this.funcoesDecl.get(s);
		}

		return aux;
	}

	public String getRank(){
		Double aux = 0.0;
		
		for(String s : this.funcoesRank.keySet()){
		  	aux+=this.funcoesRank.get(s);
		}

		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.FLOOR);

		return df.format(aux/(this.funcoes));
	}

	public void setFuncoesLinhas(String s, Integer i){
		this.funcoesLinhas.put(s,i);
	}

	public void setFuncoesDecl(String s, Integer i){
		this.funcoesDecl.put(s,i);
	}

	public void setFuncoesArgs(String s, Integer i){
		this.funcoesArgs.put(s,i);
	}

	public void setFuncoesNested(String s, Integer i){
		this.funcoesNested.put(s,i);
	}

	public void setFuncoesCC(String s, Integer i){
		this.funcoesCC.put(s,i);
	}

	public void setRank(String s, Double i){
		this.funcoesRank.put(s, i);
	}

	public Double classificaFuncao(String s){
		Double aux=0.0;
		int a;

		  	if((a = this.funcoesLinhas.get(s)) <= this.maxLinhas)
		  		aux+=0.5;
		  	else
		  		aux+=((maxLinhas*0.5)/a);

		  	if((a = this.funcoesDecl.get(s)) <= this.maxDecl)
		  		aux+=0.5;
		  	else
		  		aux+=((maxDecl*0.5)/a);

		  	if((a = this.funcoesArgs.get(s)) <= this.maxArgs)
		  		aux+=1;
		  	else
		  		aux+=((maxArgs*1)/a);

		  	if((a = this.funcoesNested.get(s)) <= this.maxNested)
		  		aux+=1.5;
		  	else
		  		aux+=((maxNested*1)/a);

		  	if((a = this.funcoesCC.get(s)) <= this.maxCC)
		  		aux+=1.5;
		  	else
		  		aux+=((maxCC*1)/a);

		  	return aux;
	}

}
