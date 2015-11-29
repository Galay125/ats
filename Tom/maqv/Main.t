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
	private Stackk stack;
	private Stackk stackFuncs;
	private String actualFuncName;
	private Map<String,Integer> symbols;
	private ArrayList<Termo> heap;
	private int pc;
	private int numProg;
	private StringBuilder output;
	private HashMap<String,Integer> metricas;

	public void initMetricas(){
		metricas.put("ALabel",0);
		metricas.put("Call",0);
		metricas.put("Ret",0);
		metricas.put("Add",0);
		metricas.put("Sub",0);
		metricas.put("Div",0);
		metricas.put("Mul",0);
		metricas.put("Mod",0);
		metricas.put("GoEq",0);
		metricas.put("Inc",0);
		metricas.put("Dec",0);
		metricas.put("Eq",0);
		metricas.put("Neq",0);
		metricas.put("Gt",0);
		metricas.put("GoEq",0);
		metricas.put("Lt",0);
		metricas.put("LoEq",0);
		metricas.put("Nott",0);
		metricas.put("Or",0);
		metricas.put("And",0);
		metricas.put("Halt",0);
		metricas.put("IIn",0);
		metricas.put("IOut",0);
		metricas.put("Jump",0);
		metricas.put("Jumpf",0);
		metricas.put("Push",0);
		metricas.put("PushA",0);
		metricas.put("Load",0);
		metricas.put("Store",0);
		metricas.put("Decl",0);
	}


	public String toString(){
		StringBuilder str = new StringBuilder("Métricas\n");
		str.append("Instrução\t| Número de vezes ocorridas\n");
		for(String s : metricas.keySet()){
			str.append(s +"\t\t| "+ metricas.get(s)+"\n");
		}
		return str.toString();
	}

	public static void menu(){

		System.out.println("\n************** Menu ************");
		System.out.println("1 ----------------- Árvore GOM ");
		System.out.println("2 ----------------- Menu métricas");
		System.out.println("3 ----------------- Correr Programa");
		System.out.println("4 ----------------- Gerar ficheiro .dot");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void menuMetricas(){

		System.out.println("\n********** Menu Métricas *********");

		System.out.println("1 ----------------- Ler métricas todas");
		System.out.println("2 ----------------- Métricas Declarações");
		System.out.println("3 ----------------- Métricas Aritméticas");
		System.out.println("4 ----------------- Métricas Condicionais");
		System.out.println("5 ----------------- Métricas I/O");
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
		String opcao =null;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Main main;
		Instrucoes p,original;

		try{
			mspLexer lexer = new mspLexer(new ANTLRFileStream("res.msp"));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			mspParser parser = new mspParser(tokens);
			// Parse the inputexpression
			Tree b = (Tree) parser.programa().getTree();
			//System.out.println("Result = " + mspAdaptor.getTerm(b)); // name of the Gom module + Adaptor
			p = (Instrucoes) mspAdaptor.getTerm(b);
			original = (Instrucoes) mspAdaptor.getTerm(b);
			main = new Main(p, original);
			main.initMetricas();

			while(!sair){
				menu();
				opcao = teclado.readLine();

				switch(opcao){

					case "1"://GOM
						System.out.println("Arvore gerada = " + p);
						break;

					case "2"://Metricas
						metric = true;
						while(metric){
							menuMetricas();
							opcao = teclado.readLine();
							switch(opcao){
								case "1":
									System.out.println(main.toString());
									break;
								case "2":
									main.metricas.put("Decl",0);
									`TopDown(visitDecl(main.metricas,main.metricas.get("Decl"))).visit(p);
									System.out.println("#Declarações = "+ main.metricas.get("Decl"));
									break;
								case "3":
									main.metricas.put("Add",0);
									main.metricas.put("Sub",0);
									main.metricas.put("Div",0);
									main.metricas.put("Mul",0);
									main.metricas.put("Mod",0);
									`TopDown(visitAritm(main.metricas,main.metricas.get("Add"),main.metricas.get("Sub"),main.metricas.get("Mul"),main.metricas.get("Div"),main.metricas.get("Mod"))).visit(p);
									System.out.println("#Adições = "+ main.metricas.get("Add"));
									System.out.println("#Subtrações = "+ main.metricas.get("Sub"));
									System.out.println("#Multiplicações = "+ main.metricas.get("Mul"));
									System.out.println("#Divisões = "+ main.metricas.get("Div"));
									System.out.println("#Resto = "+ main.metricas.get("Mod"));
									break;
								case "4":
									main.metricas.put("And",0);
									main.metricas.put("Or",0);
									`TopDown(visitConditionals(main.metricas,main.metricas.get("And"),main.metricas.get("Or")))).visit(p);
									System.out.println("#And = "+ main.metricas.get("And"));
									System.out.println("#Or = "+ main.metricas.get("Or"));
									break;
								case "5":
									main.metricas.put("IIn",0);
									main.metricas.put("IOut",0);
									`TopDown(visitIO(main.metricas,main.metricas.get("IIn"),main.metricas.get("IOut")))).visit(p);
									System.out.println("#Inputs = "+ main.metricas.get("IIn"));
									System.out.println("#Outputs = "+ main.metricas.get("IOut"));
									break;									
								case "0":
									metric = false;
								default:
				 					System.out.println("Opção Inválida");
				 					break;
							}
						}
						break;

					case "3":
						main.initMetricas();
						main.run(p);
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
											PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
		        							pw.print(main.getOutput());
		        							pw.flush(); pw.close();
											run = false;
										}catch (IOException e){
											System.err.println("exception: " + e);
											return;
			    						} 
										break;
									default:
										System.out.println("Opção inválida!");				
										break;
								}
							}
							break;

					case "4":
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
				 		System.out.println("Opção Inválida");
				 		break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


			/* Export this representation to .dot file*/
			/*

			*/
			
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
			And() -> {
				in++;
      	  		metricas.put("IIn",in);	
			}
			Or() -> {
				out++;
      	  		metricas.put("IOut",out);	
			}
        }
	}


	public Main(Instrucoes insts, Instrucoes orig) {
		programa = insts;
		original = orig;
		actualFuncName = "";
		stack = `Stackk();
		stackFuncs = `Stackk();
		heap = new ArrayList<Termo>();
		symbols = new HashMap<String, Integer>();
		pc = 0;
		numProg = 0;
		output= new StringBuilder();
		metricas = new HashMap<String, Integer>();
	}
	
	public String getOutput(){
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
}