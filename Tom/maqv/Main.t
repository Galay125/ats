package maqv;
 
import maqv.msp.mspAdaptor;
import maqv.msp.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
	%include{sl.tom}
	%include{util/HashMap.tom}
	%include{util/types/Collection.tom}
	%include{../genMaqV/maqv/msp/msp.tom}

	private Instrucoes programa;
	private Instrucoes original;
	private Instrucoes refactored;
	private Instrucoes refactoredOriginal;
	private Stackk stack;
	private Stackk stackFuncs;
	private String actualFuncName;
	private Map<String,Integer> symbols;
	private ArrayList<Termo> heap;
	private int pc;
	private int numProg;
	private StringBuilder output;
	private HashMap<String,Integer> metricas;
	private HashMap<String,Integer> metricasBad;

	public void initMetricas(){
		//Chamada de funcoes e returns
		metricas.put("ALabel",0);
		metricas.put("Call",0);
		metricas.put("Ret",0);
		//Aritmeticas
		metricas.put("Add",0);
		metricas.put("Sub",0);
		metricas.put("Div",0);
		metricas.put("Mul",0);
		metricas.put("Mod",0);
		//Incrementos e decrementos
		metricas.put("Inc",0);
		metricas.put("Dec",0);
		//Relacionais
		metricas.put("Eq",0);
		metricas.put("Neq",0);
		metricas.put("Gt",0);
		metricas.put("GoEq",0);
		metricas.put("Lt",0);
		metricas.put("LoEq",0);
		metricas.put("Nott",0);
		//Condicionais
		metricas.put("Or",0);
		metricas.put("And",0);

		metricas.put("Halt",0);
		//I/O
		metricas.put("IIn",0);
		metricas.put("IOut",0);

		metricas.put("Jump",0);
		metricas.put("Jumpf",0);
		metricas.put("Push",0);
		metricas.put("PushA",0);
		metricas.put("Load",0);
		metricas.put("Store",0);
		//Declaracoes
		metricas.put("Decl",0);
	}

	public void initMetricasBad(){
		//Chamada de funcoes e returns
		metricasBad.put("ALabel",0);
		metricasBad.put("Call",0);
		metricasBad.put("Ret",0);
		//Aritmeticas
		metricasBad.put("Add",0);
		metricasBad.put("Sub",0);
		metricasBad.put("Div",0);
		metricasBad.put("Mul",0);
		metricasBad.put("Mod",0);
		//Incrementos e decrementos
		metricasBad.put("Inc",0);
		metricasBad.put("Dec",0);
		//Relacionais
		metricasBad.put("Eq",0);
		metricasBad.put("Neq",0);
		metricasBad.put("Gt",0);
		metricasBad.put("GoEq",0);
		metricasBad.put("Lt",0);
		metricasBad.put("LoEq",0);
		metricasBad.put("Nott",0);
		//Condicionais
		metricasBad.put("Or",0);
		metricasBad.put("And",0);

		metricasBad.put("Halt",0);
		//I/O
		metricasBad.put("IIn",0);
		metricasBad.put("IOut",0);

		metricasBad.put("Jump",0);
		metricasBad.put("Jumpf",0);
		metricasBad.put("Push",0);
		metricasBad.put("PushA",0);
		metricasBad.put("Load",0);
		metricasBad.put("Store",0);
		//Declaracoes
		metricasBad.put("Decl",0);
	}

	public String toString(){
		StringBuilder str = new StringBuilder("Métricas\n");
		str.append("Instrução\t| Original\t| Refactored\n");
		for(String s : metricas.keySet()){
			str.append(s +"\t\t| "+ metricas.get(s)+"\t\t| "+ metricasBad.get(s)+"\n");
		}
		return str.toString();
	}

	public static void menu(){

		System.out.println("\n*********** Menu ************");
		System.out.println("1 ----------------- Ler ficheiros");
		System.out.println("2 ----------------- Árvore GOM ");
		System.out.println("3 ----------------- Menu métricas");
		System.out.println("4 ----------------- Correr Programa");
		System.out.println("5 ----------------- Gerar ficheiro .dot");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void menuMetricas(){

		System.out.println("\n********** Menu Métricas *********");

		System.out.println("1 ----------------- Ler métricas todas");
		System.out.println("2 ----------------- Métricas Declarações");
		System.out.println("3 ----------------- Métricas Aritméticas");
		System.out.println("4 ----------------- Métricas Condicionais");
		System.out.println("5 ----------------- Métricas Relacionais");
		System.out.println("6 ----------------- Métricas I/O");
		System.out.println("0 ----------------- Voltar atrás");
		System.out.println("\nDigite um número:");
	}

	public static void menuRun(){

		System.out.println("\n********** Menu Run *********");

		System.out.println("1 ----------------- Output no Terminal");
		System.out.println("2 ----------------- Output em ficheiro .txt ");
		System.out.println("\nDigite um número:");
	}

	public static void main(String[] args) {

		Boolean sair = false;
		Boolean metric = false;
		Boolean run = false;
		String file=null;
		String fileBad=null;
		String opcao =null;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Main main=null;
		Instrucoes p = null;
		Instrucoes original = null;
		Instrucoes bad = null;
		Instrucoes badOriginal = null;

		try{
			while(!sair){
				menu();
				opcao = teclado.readLine();

				switch(opcao){

					case "1":
			 			System.out.println("\nDigite o nome do ficheiro: ");
			 			file = teclado.readLine();
			 			System.out.println("\nDigite o nome do ficheiro refactored: ");
			 			fileBad = teclado.readLine();

			 			try{
							mspLexer lexer = new mspLexer(new ANTLRFileStream("../exemplos/"+file));
							CommonTokenStream tokens = new CommonTokenStream(lexer);
							mspParser parser = new mspParser(tokens);
							// Parse the inputexpression
							Tree b = (Tree) parser.programa().getTree();

							mspLexer lexerBad = new mspLexer(new ANTLRFileStream("../exemplos/"+fileBad));
							CommonTokenStream tokensBad = new CommonTokenStream(lexerBad);
							mspParser parserBad = new mspParser(tokensBad);
							// Parse the inputexpression
							Tree bBad = (Tree) parserBad.programa().getTree();

							p = (Instrucoes) mspAdaptor.getTerm(b);
							original = (Instrucoes) mspAdaptor.getTerm(b);
							bad = (Instrucoes) mspAdaptor.getTerm(bBad);
							badOriginal = (Instrucoes) mspAdaptor.getTerm(bBad);

							main = new Main(p, original,bad,badOriginal);
							main.initMetricas();
							main.initMetricasBad();
						} catch(Exception e) {
							e.printStackTrace();
						}
						break;

					case "2"://GOM
						System.out.println("Árvore gerada = " + p);// name of the Gom module + Adaptor
						break;

					case "3"://Metricas
						metric = true;
						while(metric){
							menuMetricas();
							opcao = teclado.readLine();
							switch(opcao){

								case "1":
									ArrayList<Integer> ints = new ArrayList<Integer>(29);
							   		`TopDown(visitAll(main.metricas,ints)).visit(p);
									`TopDown(visitAll(main.metricasBad,ints)).visit(bad);
									System.out.println(main.toString());
									break;

								case "2":								
									`TopDown(visitDecl(main.metricas,0)).visit(p);
									`TopDown(visitDecl(main.metricasBad,0)).visit(bad);
									System.out.println("Instrução\t| Original\t| Refactored\n");
									System.out.println("#Declarações"+"\t\t| " + main.metricas.get("Decl")+"\t\t| "+ main.metricasBad.get("Decl"));
									break;

								case "3":
									`TopDown(visitAritm(main.metricas,0,0,0,0,0)).visit(p);
									`TopDown(visitAritm(main.metricasBad,0,0,0,0,0)).visit(bad);

									System.out.println("Instrução\t| Original\t| Refactored\n");
									System.out.println("#Adições"+"\t\t| " + main.metricas.get("Add")+"\t\t| "+ main.metricasBad.get("Add"));
									System.out.println("#Subtrações"+"\t\t| " + main.metricas.get("Sub")+"\t\t| "+ main.metricasBad.get("Sub"));
									System.out.println("#Multiplicações"+"\t\t| " + main.metricas.get("Mul")+"\t\t| "+ main.metricasBad.get("Mul"));
									System.out.println("#Divisões"+"\t\t| " + main.metricas.get("Div")+"\t\t| "+ main.metricasBad.get("Div"));
									System.out.println("#Resto"+"\t\t| " + main.metricas.get("Mod")+"\t\t| "+ main.metricasBad.get("Mod"));
									break;

								case "4":
									`TopDown(visitConditionals(main.metricas,0,0)).visit(p);
									`TopDown(visitConditionals(main.metricasBad,0,0)).visit(bad);

									System.out.println("Instrução\t| Original\t| Refactored\n");
									System.out.println("#And"+"\t\t| " + main.metricas.get("And")+"\t\t| "+ main.metricasBad.get("And"));
									System.out.println("#Or"+"\t\t| " + main.metricas.get("Or")+"\t\t| "+ main.metricasBad.get("Or"));
									break;

								case "5":
									`TopDown(visitRelationals(main.metricas,0,0,0,0,0,0,0)).visit(p);
									`TopDown(visitRelationals(main.metricasBad,0,0,0,0,0,0,0)).visit(bad);

									System.out.println("Instrução\t| Original\t| Refactored\n");
									System.out.println("#Igualdades"+"\t\t| " + main.metricas.get("Eq")+"\t\t| "+ main.metricasBad.get("Eq"));
									System.out.println("#Diferentes"+"\t\t| " + main.metricas.get("Neq")+"\t\t| "+ main.metricasBad.get("Decl"));
									System.out.println("#Maior"+"\t\t| " + main.metricas.get("Gt")+"\t\t| "+ main.metricasBad.get("Gt"));
									System.out.println("#Maior ou Igual"+"\t\t| " + main.metricas.get("GoEq")+"\t\t| "+ main.metricasBad.get("GoEq"));
									System.out.println("#Menor"+"\t\t| " + main.metricas.get("Lt")+"\t\t| "+ main.metricasBad.get("Lt"));
									System.out.println("#Menor ou Igual"+"\t\t| " + main.metricas.get("LoEq")+"\t\t| "+ main.metricasBad.get("LoEq"));
									System.out.println("#Negação"+"\t\t| " + main.metricas.get("Nott")+"\t\t| "+ main.metricasBad.get("Nott"));
									break;

								case "6":
									`TopDown(visitIO(main.metricas,0,0)).visit(p);
									`TopDown(visitIO(main.metricasBad,0,0)).visit(bad);

									System.out.println("Instrução\t| Original\t| Refactored\n");
									System.out.println("#Inputs"+"\t\t| " + main.metricas.get("IIn")+"\t\t| "+ main.metricasBad.get("IIn"));
									System.out.println("#Outputs"+"\t\t| " + main.metricas.get("IOut")+"\t\t| "+ main.metricasBad.get("IOut"));
									break;

								case "0":
									metric = false;
									break;

								default:
				 					System.out.println("Opção Inválida. Tente de novo.");
				 					break;
							}
						}
						break;

					case "4"://Run
						//main.initMetricas();
						//main.initMetricasBad();

						main.output.replace(0,main.output.length()," ");
						main.output.trimToSize();

						System.out.println("Programa Original\n");
						main.run(p);
						//System.out.println("Programa Refactored\n");
						//main.runBad(bad);
						run = true;
							while(run){
								menuRun();
								opcao = teclado.readLine();
								switch(opcao){
									case "1":
										System.out.println(main.getOutput());
										run = false;
										break;
									case "2":
										try {
											System.out.println("Nome do ficheiro:");
											String filename = teclado.readLine();
											PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename+".txt", true)));
		        							pw.print(main.getOutput());
		        							pw.flush(); pw.close();
											run = false;
										}catch (IOException e){
											System.err.println("exception: " + e);
											return;
			    						} 
										break;
									default:
										System.out.println("Opção inválida. Tente de novo.");				
										break;
								}
							}
							break;

					case "5"://graphivz
						try{
							FileWriter out = new FileWriter("gram.dot");
							Viewer.toDot(p,out);
						}catch (IOException e){
							System.out.println("ERROR in dot file"); 
						}
						break;
					
					case "0":
				 		sair = true;
				 		break;

				 	default:
				 		System.out.println("Opção Inválida. Tente de novo.");
				 		break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	%strategy visitAll(metricas:HashMap,ints:ArrayList) extends Identity() {
      	visit Instrucao {
			ALabel(id) -> {
      	  		int n = ints.get(0);
      	  		n++;
      	  		metricas.put("ALabel",n);
			}
			Call(id) -> {
      	  		int n = ints.get(1);
      	  		n++;
      	  		metricas.put("Call",n);
			}
			Ret() -> {
      	  		int n = ints.get(2);
      	  		n++;
      	  		metricas.put("Ret",n);
			}
			Add() -> {
      	  		int n = ints.get(3);
      	  		n++;
      	  		metricas.put("Add",n);
			}
			Sub() -> {
      	  		int n = ints.get(4);
      	  		n++;
      	  		metricas.put("Sub",n);
			}
			Div() -> {
      	  		int n = ints.get(5);
      	  		n++;
      	  		metricas.put("Div",n);
			}
			Mul() -> {
      	  		int n = ints.get(6);
      	  		n++;
      	  		metricas.put("Mul",n);
			}
			Mod() -> {
      	  		int n = ints.get(7);
      	  		n++;
      	  		metricas.put("Mod",n);
			}
			Inc() -> {
      	  		int n = ints.get(8);
      	  		n++;
      	  		metricas.put("Inc",n);
			}
			Dec() -> {
      	  		int n = ints.get(9);
      	  		n++;
      	  		metricas.put("Dec",n);
			}
			Eq() -> {
      	  		int n = ints.get(10);
      	  		n++;
      	  		metricas.put("Eq",n);
			}
			Neq() -> { 
      	  		int n = ints.get(11);
      	  		n++;
      	  		metricas.put("Neq",n);
			}
			Gt() -> {
      	  		int n = ints.get(12);
      	  		n++;
      	  		metricas.put("Gt",n);
			}
			GoEq() -> {
      	  		int n = ints.get(13);
      	  		n++;
      	  		metricas.put("GoEq",n);
			}
			Lt() -> {
      	  		int n = ints.get(14);
      	  		n++;
      	  		metricas.put("Lt",n);
			}
			LoEq() -> {
      	  		int n = ints.get(15);
      	  		n++;
      	  		metricas.put("LoEq",n);
			}
			Nott() -> {
      	  		int n = ints.get(16);
      	  		n++;
      	  		metricas.put("Nott",n);
			}
			Or() -> {
      	  		int n = ints.get(17);
      	  		n++;
      	  		metricas.put("Or",n);
			}
			And() -> {
      	  		int n = ints.get(18);
      	  		n++;
      	  		metricas.put("And",n);
			}
			Halt() -> { 
      	  		int n = ints.get(19);
      	  		n++;
      	  		metricas.put("Halt",n);
			}
			IIn(tipo) -> {
      	  		int n = ints.get(20);
      	  		n++;
      	  		metricas.put("IIn",n);
			}
			IOut() -> {
      	  		int n = ints.get(21);
      	  		n++;
      	  		metricas.put("IOut",n);
			}
			Jump(id) -> {
      	  		int n = ints.get(22);
      	  		n++;
      	  		metricas.put("Jump",n);
			}
			Jumpf(id) -> {
      	  		int n = ints.get(23);
      	  		n++;
      	  		metricas.put("Jumpf",n);
			}
			Push(t) -> {
      	  		int n = ints.get(24);
      	  		n++;
      	  		metricas.put("Push",n);
			}
			Pusha(t) -> {
      	  		int n = ints.get(25);
      	  		n++;
      	  		metricas.put("Pusha",n);
			}
			Load() -> {
      	  		int n = ints.get(26);
      	  		n++;
      	  		metricas.put("Load",n);
			}
			Store() -> {
      	  		int n = ints.get(27);
      	  		n++;
      	  		metricas.put("Store",n);
			}
			Decl(id,initMemAddress,size) -> {
      	  		int n = ints.get(28);
      	  		n++;
      	  		metricas.put("Decl",n);
			}
        }
	}

	%strategy visitDecl(metricas:HashMap,n:int) extends Identity() {
      	visit Instrucao {
      	 	Decl(id,initMemAddress,size) -> {
      	  		n++;
      	  		metricas.put("Decl",n);
      	 	}
        }
	}

	%strategy visitAritm(metricas:HashMap,add:int,sub:int,mul:int,div:int,mod:int) extends Identity() {
      	visit Instrucao {
			Add() -> {
				add++;
      	  		metricas.put("Add",add);	
			}
			Sub() -> {
				sub++;
      	  		metricas.put("Sub",sub);	
			}
			Div() -> {
				div++;
      	  		metricas.put("Div",div);	
			}
			Mul() -> {
				mul++;
      	  		metricas.put("Mul",mul);	
			}
			Mod() -> {
				mod++;
      	  		metricas.put("Mod",mod);	
			}
        }
	}

	%strategy visitRelationals(metricas:HashMap,eq:int,neq:int,gt:int,goEq:int,lt:int,loEq:int,nott:int) extends Identity() {
      	visit Instrucao {
			Eq() -> {
				eq++;
      	  		metricas.put("Eq",eq);	
			}
			Neq() -> {
				neq++;
      	  		metricas.put("Neq",neq);	
			}
			Gt() -> {
				gt++;
      	  		metricas.put("Gt",gt);	
			}
			GoEq() -> {
				goEq++;
      	  		metricas.put("GoEq",goEq);	
			}
			Lt() -> {
				lt++;
      	  		metricas.put("Lt",lt);	
			}
			LoEq() -> {
				loEq++;
      	  		metricas.put("LoEq",loEq);	
			}
			Nott() -> {
				nott++;
      	  		metricas.put("Nott",nott);	
			}
        }
	}

	%strategy visitConditionals(metricas:HashMap,and:int,or:int) extends Identity() {
      	visit Instrucao {
			And() -> {
				and++;
      	  		metricas.put("And",and);	
			}
			Or() -> {
				or++;
      	  		metricas.put("Or",or);	
			}
        }
	}

	%strategy visitIO(metricas:HashMap,in:int,out:int) extends Identity() {
      	visit Instrucao {
			IIn(tipo) -> {
				in++;
      	  		metricas.put("IIn",in);	
			}
			IOut() -> {
				out++;
      	  		metricas.put("IOut",out);	
			}
        }
	}

	public Main(Instrucoes insts, Instrucoes orig, Instrucoes bad, Instrucoes badOriginal) {
		programa = insts;
		original = orig;
		refactored = bad;
		refactoredOriginal = badOriginal;
		actualFuncName = "";
		stack = `Stackk();
		stackFuncs = `Stackk();
		heap = new ArrayList<Termo>();
		symbols = new HashMap<String, Integer>();
		pc = 0;
		numProg = 0;
		output= new StringBuilder();
		metricas = new HashMap<String, Integer>();
		metricasBad = new HashMap<String, Integer>();
	}
	
	public String getOutput(){
		output.insert(0,"Output");
		return output.toString();
	}

	private Instrucoes getNInstr(Instrucoes prog, int progc){
		%match (prog){
			i@Instrucoes(inst,insts*) -> { 
				if (progc == 0) {
					return `i;
				}
				else { return `getNInstr(insts*,progc-1); }
			}
		}
		return `Instrucoes();
	}

	private Instrucoes getCalledFunction(Instrucoes prog, String called){
		%match (prog){
			Instrucoes(Call(id),insts*) -> {
				if(called.equals(`id)){
					return `insts;
				}else{
					return `getCalledFunction(insts*,called);
				}
			}
			Instrucoes(_,insts*) -> { return `getCalledFunction(insts*,called); }
		}
		return `Instrucoes();
	}

	private Instrucoes getNInstr(Instrucoes prog, String callerF, String called){
		%match (prog){
			Instrucoes(ALabel(id),insts*) -> {
				if(callerF.equals(`id)){
					return getCalledFunction(`insts, called);
				}else{
					return `getNInstr(insts*,callerF,called);
				}
			}
			Instrucoes(_,insts*) -> { return `getNInstr(insts*,callerF,called); }
		}
		return `Instrucoes();
	}

	private Instrucoes jmp(Instrucoes prog, String label){
		%match (prog){
			Instrucoes(ALabel(l),insts*) -> {
				if (label.equals(`l)) {
					if(`l.startsWith("f:")){
						actualFuncName = `l;
					}
					return `insts*; 
				}else{
					return `jmp(insts*,label);
				}
			}
			Instrucoes(_,insts*) -> { return `jmp(insts*,label); }
		}
		return `Instrucoes();
	}

	private void pushFuncs(Termo termo){
		%match (stackFuncs){
			Stackk(termos*) -> {
				this.stackFuncs = `Stackk(termo,termos*);
			} 
		}
	}

	private void pushStack(Termo termo){
		%match (stack){
			Stackk(termos*) -> { this.stack = `Stackk(termo,termos*); } 
		}
	}

	private void popFuncs(){
		%match (stackFuncs){
			Stackk(termo1,termos*) -> {
				this.stackFuncs = `Stackk(termos*);
			}
		}
	}

	private void popStack(){
		%match (stack){
			Stackk(termo1,termos*) -> { this.stack = `Stackk(termos*); }
		}
	}

	private Termo topFuncs(){
		%match(stackFuncs){
			Stackk(termo,termos*) -> { return `termo; }
		}
		return `Vazio();
	}

	private Termo topStack() {
		%match(stack){
			Stackk(termo,termos*) -> { return `termo; }
		}
		return `Vazio();
	}

	private void memAlloc(String symbol, int initMemAddress, int size) {
		Integer memAddress = symbols.get(symbol);
		if (memAddress == null) {
			symbols.put(symbol, initMemAddress);
			for (int i = 0; i < size; i++){
				heap.add(initMemAddress + i,`Vazio());
			}
		}
	}

	private int getMemAddress(String symbol) {
		return symbols.get(symbol);
	}

	private Termo getMem(int memAddress) {
		return heap.get(memAddress);
	}

	private void putMem(int memAddress, Termo value) {
		heap.set(memAddress,value);
	}

	public String run(Instrucoes prog) {
		pc++;
		Instrucoes orig = this.original;
		%match (prog){
			Instrucoes(inst,instrs*) -> {
				%match(inst) {
					ALabel(id) -> {
						int n = metricas.get("ALabel");
						metricas.put("ALabel",++n);
						if(`id.startsWith("f:")){
							actualFuncName=`id;
						}
						return `run(instrs*);
					}
					Call(id) -> {
						int n = metricas.get("Call");
						metricas.put("Call",++n);
						`pushFuncs(S(actualFuncName));
						`pushFuncs(S(id));
						prog = `jmp(orig,id);
						return `run(prog);
					}
					Ret() -> {
						int n = metricas.get("Ret");
						metricas.put("Ret",++n);
						Termo calledLabel = `topFuncs(); 
						`popFuncs();
						Termo callerFLabel = `topFuncs();
						`popFuncs();
						String called = "", callerF = "";
						%match(calledLabel) {
							S(id) -> {
								called = `id;
							}
							I(valor) -> { 
								pc = `valor;
								prog = `getNInstr(orig,valor);
							}
						}%match(callerFLabel) {
							S(id) -> {
								actualFuncName = `id;
								callerF = `id;
							}
						}
						prog = `getNInstr(orig,callerF,called);
						return `run(prog);
					}
					Add() -> {
						int n = metricas.get("Add");
						metricas.put("Add",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1+`v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Sub() -> {
						int n = metricas.get("Sub");
						metricas.put("Sub",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 - `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Div() -> {
						int n = metricas.get("Div");
						metricas.put("Div",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 / `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mul() -> {
						int n = metricas.get("Mul");
						metricas.put("Mul",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 * `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mod() -> {
						int n = metricas.get("Mod");
						metricas.put("Mod",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 % `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Inc() -> {
						int n = metricas.get("Inc");
						metricas.put("Inc",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToInc = 0;
								%match(t2) {
									I(v1) -> { valorToInc = `v1+1; }
								}
								putMem(`memAddress,`I(valorToInc));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Dec() -> {
						int n = metricas.get("Dec");
						metricas.put("Dec",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToDec = 0;
								%match(t2) {
									I(v1) -> { valorToDec = `v1-1; }
								}
								putMem(`memAddress,`I(valorToDec));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Eq() -> {
						int n = metricas.get("Eq");
						metricas.put("Eq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Neq() -> { 
						int n = metricas.get("Neq");
						metricas.put("Neq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `False() : `True();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Gt() -> {
						int n = metricas.get("Gt");
						metricas.put("Gt",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 > `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					GoEq() -> {
						int n = metricas.get("GoEq");
						metricas.put("GoEq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 >= `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Lt() -> {
						int n = metricas.get("Lt");
						metricas.put("Lt",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 < `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					LoEq() -> {
						int n = metricas.get("LoEq");
						metricas.put("LoEq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 <=`v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Nott() -> {
						int n = metricas.get("Nott");
						metricas.put("Nott",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							i@I(v1) -> { `pushStack(i); }
							s@S(v1) -> { `pushStack(s); }
							f@F(v1) -> { `pushStack(f); }
							B(True()) -> { `pushStack(B(False())); }
							B(False()) -> { `pushStack(B(True())); }
						}
						return `run(instrs*);
					}
					Or() -> {
						int n = metricas.get("Or");
						metricas.put("Or",++n);
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 || valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					And() -> {
						int n = metricas.get("And");
						metricas.put("And",++n);
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 && valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Halt() -> { 
						int n = metricas.get("Halt");
						metricas.put("Halt",++n);
						return "";
						 }
					IIn(tipo) -> {
						int n = metricas.get("IIn");
						metricas.put("IIn",++n);
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try{
							String iin = br.readLine();
							%match(tipo) {
								DInt() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
								DChar() -> {
									String s = ""+iin.charAt(0);
									`pushStack(S(s));
								}
								DBoolean() -> {
									if (iin.equalsIgnoreCase("true")) { `pushStack(B(True())); }
									else if (iin.equalsIgnoreCase("false")) { `pushStack(B(False())); }
									else { System.err.println("Invalid Format!"); }
								}
								DFloat() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
							}
				       }
				       catch (IOException e){
				    	   System.err.println("exception: " + e);
				       } 
				       return `run(instrs*);
					}
					IOut() -> {
						int n = metricas.get("IOut");
						metricas.put("IOut",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(v1) -> { output.append(`v1+"\n"); }
							S(v1) -> { output.append(`v1+"\n"); }
							F(v1) -> { output.append(`v1+"\n"); }
							B(True()) -> { output.append("True"+"\n"); }
							B(False()) -> { output.append("False"+"\n"); }
						}
						return `run(instrs*);
					}
					Jump(id) -> {
						int n = metricas.get("Jump");
						metricas.put("Jump",++n);
						prog = `jmp(orig,id);
						return `run(prog);
					}
					Jumpf(id) -> {
						int n = metricas.get("Jumpf");
						metricas.put("Jumpf",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							B(True()) -> { return `run(instrs*); }
							B(False()) -> { 
								prog = `jmp(orig,id);
								return `run(prog);
							}
						}
						return `run(instrs*);
					}
					Push(t) -> {
						int n = metricas.get("Push");
						metricas.put("Push",++n);
						`pushStack(t);
						return `run(instrs*);
					}
					Pusha(t) -> {
						int n = metricas.get("PushA");
						metricas.put("PushA",++n);
						%match(t) {
							S(id) -> { 
								int memAddress = getMemAddress(`id);
								`pushStack(I(memAddress));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Load() -> {
						int n = metricas.get("Load");
						metricas.put("Load",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								`pushStack(t2);	
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Store() -> {
						int n = metricas.get("Store");
						metricas.put("Store",++n);
						Termo t = `topStack();
						`popStack();
						Termo t2 = `topStack();
						`popStack();
						%match(t2) {
							I(memAddress) -> { 
								putMem(`memAddress,t);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Decl(id,initMemAddress,size) -> {
						int n = metricas.get("Decl");
						metricas.put("Decl",++n);
						memAlloc(`id,`initMemAddress,`size);
						return `run(instrs*);
					}
				}
			}
		}
		return "";
	}

/*
	public String runBad(Instrucoes prog) {
		pc++;
		Instrucoes orig = this.refactoredOriginal;
		%match (prog){
			Instrucoes(inst,instrs*) -> {
				%match(inst) {
					ALabel(id) -> {
						int n = metricasBad.get("ALabel");
						metricasBad.put("ALabel",++n);
						if(`id.startsWith("f:")){
							actualFuncName=`id;
						}
						return `run(instrs*);
					}
					Call(id) -> {
						int n = metricasBad.get("Call");
						metricasBad.put("Call",++n);
						`pushFuncs(S(actualFuncName));
						`pushFuncs(S(id));
						prog = `jmp(orig,id);
						return `run(prog);
					}
					Ret() -> {
						int n = metricasBad.get("Ret");
						metricasBad.put("Ret",++n);
						Termo calledLabel = `topFuncs(); 
						`popFuncs();
						Termo callerFLabel = `topFuncs();
						`popFuncs();
						String called = "", callerF = "";
						%match(calledLabel) {
							S(id) -> {
								called = `id;
							}
							I(valor) -> { 
								pc = `valor;
								prog = `getNInstr(orig,valor);
							}
						}%match(callerFLabel) {
							S(id) -> {
								actualFuncName = `id;
								callerF = `id;
							}
						}
						prog = `getNInstr(orig,callerF,called);
						return `run(prog);
					}
					Add() -> {
						int n = metricasBad.get("Add");
						metricasBad.put("Add",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1+`v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Sub() -> {
						int n = metricasBad.get("Sub");
						metricasBad.put("Sub",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 - `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Div() -> {
						int n = metricasBad.get("Div");
						metricasBad.put("Div",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 / `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mul() -> {
						int n = metricasBad.get("Mul");
						metricasBad.put("Mul",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 * `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mod() -> {
						int n = metricasBad.get("Mod");
						metricasBad.put("Mod",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 % `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Inc() -> {
						int n = metricasBad.get("Inc");
						metricasBad.put("Inc",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToInc = 0;
								%match(t2) {
									I(v1) -> { valorToInc = `v1+1; }
								}
								putMem(`memAddress,`I(valorToInc));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Dec() -> {
						int n = metricasBad.get("Dec");
						metricasBad.put("Dec",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToDec = 0;
								%match(t2) {
									I(v1) -> { valorToDec = `v1-1; }
								}
								putMem(`memAddress,`I(valorToDec));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Eq() -> {
						int n = metricasBad.get("Eq");
						metricasBad.put("Eq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Neq() -> { 
						int n = metricasBad.get("Neq");
						metricasBad.put("Neq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `False() : `True();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Gt() -> {
						int n = metricasBad.get("Gt");
						metricasBad.put("Gt",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 > `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					GoEq() -> {
						int n = metricasBad.get("GoEq");
						metricasBad.put("GoEq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 >= `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Lt() -> {
						int n = metricasBad.get("Lt");
						metricasBad.put("Lt",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 < `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					LoEq() -> {
						int n = metricasBad.get("LoEq");
						metricasBad.put("LoEq",++n);
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 <=`v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Nott() -> {
						int n = metricasBad.get("Nott");
						metricasBad.put("Nott",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							i@I(v1) -> { `pushStack(i); }
							s@S(v1) -> { `pushStack(s); }
							f@F(v1) -> { `pushStack(f); }
							B(True()) -> { `pushStack(B(False())); }
							B(False()) -> { `pushStack(B(True())); }
						}
						return `run(instrs*);
					}
					Or() -> {
						int n = metricasBad.get("Or");
						metricasBad.put("Or",++n);
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 || valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					And() -> {
						int n = metricasBad.get("And");
						metricasBad.put("And",++n);
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 && valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Halt() -> { 
						int n = metricasBad.get("Halt");
						metricasBad.put("Halt",++n);
						return "";
						 }
					IIn(tipo) -> {
						int n = metricasBad.get("IIn");
						metricasBad.put("IIn",++n);
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try{
							String iin = br.readLine();
							%match(tipo) {
								DInt() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
								DChar() -> {
									String s = ""+iin.charAt(0);
									`pushStack(S(s));
								}
								DBoolean() -> {
									if (iin.equalsIgnoreCase("true")) { `pushStack(B(True())); }
									else if (iin.equalsIgnoreCase("false")) { `pushStack(B(False())); }
									else { System.err.println("Invalid Format!"); }
								}
								DFloat() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
							}
				       }
				       catch (IOException e){
				    	   System.err.println("exception: " + e);
				       } 
				       return `run(instrs*);
					}
					IOut() -> {
						int n = metricasBad.get("IOut");
						metricasBad.put("IOut",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(v1) -> { output.append(`v1+"\n"); }
							S(v1) -> { output.append(`v1+"\n"); }
							F(v1) -> { output.append(`v1+"\n"); }
							B(True()) -> { output.append("True"+"\n"); }
							B(False()) -> { output.append("False"+"\n"); }
						}
						return `run(instrs*);
					}
					Jump(id) -> {
						int n = metricasBad.get("Jump");
						metricasBad.put("Jump",++n);
						prog = `jmp(orig,id);
						return `run(prog);
					}
					Jumpf(id) -> {
						int n = metricasBad.get("Jumpf");
						metricasBad.put("Jumpf",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							B(True()) -> { return `run(instrs*); }
							B(False()) -> { 
								prog = `jmp(orig,id);
								return `run(prog);
							}
						}
						return `run(instrs*);
					}
					Push(t) -> {
						int n = metricasBad.get("Push");
						metricasBad.put("Push",++n);
						`pushStack(t);
						return `run(instrs*);
					}
					Pusha(t) -> {
						int n = metricasBad.get("PushA");
						metricasBad.put("PushA",++n);
						%match(t) {
							S(id) -> { 
								int memAddress = getMemAddress(`id);
								`pushStack(I(memAddress));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Load() -> {
						int n = metricasBad.get("Load");
						metricasBad.put("Load",++n);
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								`pushStack(t2);	
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Store() -> {
						int n = metricasBad.get("Store");
						metricasBad.put("Store",++n);
						Termo t = `topStack();
						`popStack();
						Termo t2 = `topStack();
						`popStack();
						%match(t2) {
							I(memAddress) -> { 
								putMem(`memAddress,t);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Decl(id,initMemAddress,size) -> {
						int n = metricasBad.get("Decl");
						metricasBad.put("Decl",++n);
						memAlloc(`id,`initMemAddress,`size);
						return `run(instrs*);
					}
				}
			}
		}
		return "";
	}
*/

}
