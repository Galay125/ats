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
import java.io.FileWriter;

public class Main {
	%include{sl.tom}
	%include{util/HashMap.tom}
	%include{util/ArrayList.tom}
	%include{util/types/Collection.tom}
	%include{util/types/Set.tom}
	%include{../genI/gram/i/i.tom}

	private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";


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
		System.out.println("6 ----------------- Tratar Bad Smells | Refactoring");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void menuRun(){

		System.out.println("\n********** Menu Run *********");

		System.out.println("1 ----------------- Output no Terminal");
		System.out.println("2 ----------------- Output em ficheiro .msp ");
		System.out.println("\nDigite um número:");
	}

	public static void menuRunCSV(){

		System.out.println("\n********** Menu Run *********");

		System.out.println("1 ----------------- Output no Terminal");
		System.out.println("2 ----------------- Output em ficheiro .csv ");
		System.out.println("\nDigite um número:");
	}

	public static void menuFicheiros(){

		System.out.println("\n********** Menu Run *********");

		System.out.println("1 ----------------- Ler Ficheiro para obter métricas (.csv)");
		System.out.println("2 ----------------- Ler Ficheiro C--");
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
 		String instrucoes = "";
 		String numInstString = "";
 		String fileCsv = null;

		while(sair == false){
 			 
 			 menu(file);
			 
			 opcao = teclado.readLine();
			 
			 switch(opcao){
			 	case "1":
			 		menuFicheiros();
					opcao = teclado.readLine();
						switch(opcao){
							case "1":
							 		System.out.println("\nDigite o nome do ficheiro csv: ");
							 		fileCsv = teclado.readLine();
							 		metricas(fileCsv, met);
							break;

							case "2":
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
						}
				break;

			 	case "2":
			 		System.out.println("Arvore gerada = " + p); // name of the Gom module + Adaptor
			 	break;

			 	case "3":
			 		try{
			 			main = new Main();
				 		numInstrucao = new ArrayList<Integer>();
						numInstrucao.add(1);
						`TopDown(CollectFuncsSignature(main.functionSignatures)).visit(p);
						int numInst = numInstrucao.get(0)-1;
						Expressao numInstExps = `Expressoes(Print(Int(numInst)),Print(Char("#")));
						NumToInt n = new NumToInt(1);
						numInstString = main.compileAnnotExpressoes(numInstExps, n);
						instrucoes = "";
				 		instrucoes = main.compileAnnot(p);
	 					String functionDeclarationsAndArguments = main.functionsDeclarations.toString();
	 					Boolean run = true;
							while(run){
								menuRun();
								opcao = teclado.readLine();
								switch(opcao){
									case "1":
										System.out.println(functionDeclarationsAndArguments + numInstString + instrucoes);
										run = false;
										break;

									case "2":
										try {
											System.out.println("Nome do ficheiro:");
											String filename = teclado.readLine();
											String msp = functionDeclarationsAndArguments + numInstString + instrucoes;
											PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("../exemplos/"+filename+".msp", true)));
		        							pw.print(msp);
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
					} catch(Exception e) {
						e.printStackTrace();
					}
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
							met = new Metrica();
							metricas(fileCsv, met);
							System.out.println("\n*********** Métricas ************ ");

								/* Vai recolher as instruções por função */
								`TopDown(visitFuncoes(main.funcoesInst)).visit(p);
							

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
									Boolean run = true;
									while(run){
										menuRunCSV();
										opcao = teclado.readLine();
										switch(opcao){
											case "1":
												met.funcoes=0;
												met.setSmells(0);
												for(String s : main.funcoesInst.keySet()){
													met.funcoes++;
													
													System.out.println("\n----> Funcao: "+s);
													a = linesOfCode(main.funcoesInst.get(s));
													met.setFuncoesLinhas(s,a);
													System.out.println("Numero de Linhas: "+a+ " | Max("+met.getMaxLinhas()+")");

													if(met.classificaSmellLinhas(s) == 1){
														System.out.println("** Smell Detectado: Metodo Extenso **\n");
													}


													a = foundDecl(main.funcoesInst.get(s));
													met.setFuncoesDecl(s,a);
													System.out.println("Numero de Declaracoes: "+a+" | Max("+met.getMaxDecl()+")");

													if(met.classificaSmellDecl(s) == 1){
														System.out.println("** Smell Detectado: Declaracoes a mais **\n");
													}


													a = foundArgs(s,p);
													met.setFuncoesArgs(s,a);
													System.out.println("Numero de Argumentos: "+a+" | Max("+met.getMaxArgs()+")");

													if(met.classificaSmellArgs(s) == 1){
														System.out.println("** Smell Detectado: Numero de argumentos excede o maximo **\n");
													}


													a = foundNested(main.funcoesInst.get(s));
													met.setFuncoesNested(s,a);
													System.out.println("Maior Bloco Aninhado: "+a+" | Max("+met.getMaxNested()+")");

													if(met.classificaSmellNested(s) == 1){
														System.out.println("** Smell Detectado: Bloco com demasiados aninhamentos **\n");
													}


													a = foundCC(main.funcoesInst.get(s))+1;
													met.setFuncoesCC(s,a);
													System.out.println("Cyclomatic Complexity: "+a+" | Max("+met.getMaxCC()+")");

													if(met.classificaSmellCC(s) == 1){
														System.out.println("** Smell Detectado: Complexidade ciclomática maior que o máximo **\n");
													}


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
												System.out.println("Numero de Bad Smells detectados: "+met.getNSmells());

												run = false;
												break;

											case "2":
												try {
													System.out.println("Nome do ficheiro:");
													String filename = teclado.readLine();
													FileWriter fileWriter = new FileWriter("../exemplos/"+filename+".csv");
				        							met.funcoes=0;
													met.setSmells(0);
													for(String s : main.funcoesInst.keySet()){
														met.funcoes++;
														
														
														fileWriter.append(s);
														fileWriter.append(NEW_LINE_SEPARATOR);
														fileWriter.append("Métricas,Quantidade,Máximo,Smell Detectado");
														fileWriter.append(NEW_LINE_SEPARATOR);

														a = linesOfCode(main.funcoesInst.get(s));
														met.setFuncoesLinhas(s,a);

														//LINHAS
														fileWriter.append("Numero de Linhas,"+a+","+met.getMaxLinhas()+",");

														if(met.classificaSmellLinhas(s) == 1){
															fileWriter.append("Detectado");
														}
														else{
															fileWriter.append("Não Detectado");
														}

														fileWriter.append(NEW_LINE_SEPARATOR);
														

														//DECLARACOES
														a = foundDecl(main.funcoesInst.get(s));
														met.setFuncoesDecl(s,a);
														fileWriter.append("Numero de Declarações,"+a+","+met.getMaxDecl()+",");

														if(met.classificaSmellDecl(s) == 1){
															fileWriter.append("Detectado");
														}
														else{
															fileWriter.append("Não Detectado");
														}

														fileWriter.append(NEW_LINE_SEPARATOR);

														//ARGUMENTOS
														a = foundArgs(s,p);
														met.setFuncoesArgs(s,a);
														fileWriter.append("Numero de Argumentos,"+a+","+met.getMaxArgs()+",");

														if(met.classificaSmellArgs(s) == 1){
															fileWriter.append("Detectado");
														}
														else{
															fileWriter.append("Não Detectado");
														}

														fileWriter.append(NEW_LINE_SEPARATOR);

														//BLOCOS
														a = foundNested(main.funcoesInst.get(s));
														met.setFuncoesNested(s,a);
														fileWriter.append("Maior Bloco Aninhado,"+a+","+met.getMaxNested()+",");
														

														if(met.classificaSmellNested(s) == 1){
															fileWriter.append("Detectado");
														}
														else{
															fileWriter.append("Não Detectado");
														}

														fileWriter.append(NEW_LINE_SEPARATOR);

														//CC McCABE
														a = foundCC(main.funcoesInst.get(s))+1;
														met.setFuncoesCC(s,a);
														fileWriter.append("Cyclomatic Complexity,"+a+","+met.getMaxCC()+",");

														if(met.classificaSmellCC(s) == 1){
															fileWriter.append("Detectado");
														}
														else{
															fileWriter.append("Não Detectado");
														}

														fileWriter.append(NEW_LINE_SEPARATOR);
														fileWriter.append(NEW_LINE_SEPARATOR);


														DecimalFormat df = new DecimalFormat("#.#");
														df.setRoundingMode(RoundingMode.FLOOR);

														r = met.classificaFuncao(s);	
														met.setRank(s,r);
														
														fileWriter.append("Star Ranking,"+df.format(r)+" em 5");
														fileWriter.append(NEW_LINE_SEPARATOR);
														fileWriter.append(NEW_LINE_SEPARATOR);
													}

													fileWriter.append("Programa");
													fileWriter.append(NEW_LINE_SEPARATOR);
													fileWriter.append("Total de Linhas,"+met.getTotalLinhas());
													fileWriter.append(NEW_LINE_SEPARATOR);
													fileWriter.append("Total de Declaracoes,"+met.getTotalDecl());
													fileWriter.append(NEW_LINE_SEPARATOR);
													fileWriter.append("Total de Argumentos,"+met.getTotalArgs());
													fileWriter.append(NEW_LINE_SEPARATOR);
													fileWriter.append("Star Ranking do Programa,"+met.getRank()+" em 5");
													fileWriter.append(NEW_LINE_SEPARATOR);
													fileWriter.append("Numero de Bad Smells detectados,"+met.getNSmells());
													fileWriter.append(NEW_LINE_SEPARATOR);
     							
				        							fileWriter.flush();
				        						    fileWriter.close();
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
							}
						}
						catch(VisitFailure e) {
								System.out.println("the strategy failed");
						}
			 	break;


			 	case "6":
			 		try{
			 			System.out.println("\n*********** Smells ************ ");
			 			Set<String> idsUtilizados = new TreeSet<String>();
			 			Instrucao pBad = `TopDown(stratBadSmells(idsUtilizados)).visit(p);
			 			p = pBad;
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

	public static Argumentos removeArgumentosNaoUtilizados(Argumentos args, Set<String> idsUtilizados) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> {
				%match(arg1) {
					a@Argumento(_,idArg) -> {
						if (idsUtilizados.contains(`idArg)){
							System.out.println(`a +" Utilizado");
							return `ListaArgumentos(a,removeArgumentosNaoUtilizados(tailArg*,idsUtilizados));
						}
						else{
							System.out.println(`a + " Não Utilizado");
							return removeArgumentosNaoUtilizados(`tailArg*,idsUtilizados);
						}
					}
				}
			}
		}
		return args;
	}

	public static Parametros removeParametrosNaoUtilizados(Parametros pars, Set<String> idsUtilizados) {
		%match(pars) {
			ListaParametros(par1,tailpar*) -> {
				%match(par1) {
					Parametro(exp) -> {
							if(verificaExp(`exp,idsUtilizados))
								return `ListaParametros(par1,removeParametrosNaoUtilizados(tailpar*,idsUtilizados));
							else
								return removeParametrosNaoUtilizados(`tailpar*, idsUtilizados);
					}
				}
			}
		}
		return pars;
	}

	public static Boolean verificaExp(Expressao exp, Set<String> idsUtilizados) {
		%match(exp) {
			a@Id(id) -> {
				if (idsUtilizados.contains(`id)){
					System.out.println(`a +" Utilizado");
					return true;
				}
				else{
					System.out.println(`a + " Não Utilizado");
					return false;
				}
			}
			a@ExpNum(exp1,op,exp2) -> {
				Boolean aux1, aux2;
					aux1 = verificaExp(`exp1,idsUtilizados);
					aux2 = verificaExp(`exp2,idsUtilizados);
				if(aux1 && aux2)
					return true;
				else
					return false;
			}
			a@Int(i)->{
				return true;
			}
			a@Float(f)->{
				return true;
			}
			a@Char(c)->{
				return true;
			}
		}
		return true;
	}

	public static Boolean verificaDeclaracoesNaoUtilizados(Declaracoes inst, Set<String> idsUtilizados) {
		%match(inst) {
			ListaDecl(dec1,tail*) -> {
				%match(dec1) {
					a@Decl(idArg,_) -> {
						if (idsUtilizados.contains(`idArg)){
							System.out.println(`a +" Utilizado");
							return true;
						}
						else{
							System.out.println(`a + " Não Utilizado");
							return false;
						}
					}
				}
			}
		}
		return false;
	}

	public static Expressao verificaCondicao(Expressao exp) {
		%match(exp) {
			a@Ou(c1,c2) -> {
				%match(c1){
					e@Int(i) -> { if (`i == 1) return `e;
								else if(`i == 0) return `a;
					}
					e@True()->{ return `e; }
					e@Char(s)->{ return `e; }
				}
				%match(c2){
					e@Int(i)->{ if (`i == 1) return `e;
							  	else if(`i == 0)  return `a;
					}
					e@True()->{ return `e; }
					e@Char(s)->{ return `e; }
				}
				return verificaCondicao(`a);
			}
			a@E(c1,c2) -> {
				%match(c1){
					e@Int(i)->{ if(`i == 0)  return `e;
							  	else if(`i == 1) return `a;
					}
					e@False()->{ return `e; }
					e@Char(s)->{ return `e; }
				}
				%match(c2){
					e@Int(i)->{ if(`i == 0)  return `e;
							  	else if(`i == 1) return `a;
					}
					e@False()->{ return `e; }
					e@Char(s)->{ return `e; }
				}
				return verificaCondicao(`a);
			}
		}
		return `exp;
	}

    %strategy stratBadSmells(Set idsUtilizados) extends Identity() {
    	visit Instrucao {
    		If(Nao(condicao),inst1,inst2) -> {
    			return `If(condicao,inst2,inst1);
    		}
    		If(condicao,inst1,inst2) -> {
    			Expressao cond = verificaCondicao(`condicao);
    			System.out.println(`cond);

    			if(`cond == `True() || `cond == `Int(1))	
    				return `inst1;
    			else if(`cond == `False() || `cond == `Int(0))
    				return `inst2;
    			else
    				return `If(cond,inst1,inst2);
    		}
    		Funcao(tipo,nome,argumentos,inst) -> {
    			idsUtilizados = new TreeSet<String>();
				`TopDown(stratCollectIds(idsUtilizados, 0)).visit(`inst);
    			Argumentos args = removeArgumentosNaoUtilizados(`argumentos, idsUtilizados);
    			return `Funcao(tipo,nome,args,inst);
    		}
    		Declaracao(tipo,decls) -> {
    			Boolean decl = verificaDeclaracoesNaoUtilizados(`decls, idsUtilizados);
    			if(decl)
    				return `Declaracao(tipo, decls);
    			else
    				return `SeqInstrucao(Exp(Empty()));
    		}
    	}
    	visit Expressao{
    		Call(id,param)->{
    			Parametros para = removeParametrosNaoUtilizados(`param, idsUtilizados);
    			return `Call(id,para);
    		}
    	}
    }

    %strategy stratCollectIds(Set idsUtilizados, int flag) extends Identity() {
    	visit Instrucao {
    		Atribuicao(id,opAtrib,exp) -> {
    			idsUtilizados.add(`id);
    		}
    	}
    	visit Expressao {
    		Id(id) -> {
    			if(flag == 0){
	    			idsUtilizados.add(`id);
	    		}
	    		flag=0;
    		}
    		IncAntes(opInc,id) -> { 
    			idsUtilizados.add(`id);
    		}
    		IncDepois(opInc,id) -> { 
    			idsUtilizados.add(`id);
    		}
    	}
    	visit Parametros{
    		Parametro(exp)->{
    			flag++;
    		}
    	}
    }

    %strategy CollectFuncsSignature(signatures:HashMap) extends Identity() {
      visit Instrucao {
		Funcao(tipo,nome,argumentos,inst) -> {
			signatures.put(`nome, `argumentos);
		}
      }
    }

    %strategy stratPrintAnnotations(ArrayList numInstrucao) extends Identity() {
      visit Instrucao {
			i@Atribuicao(_,_,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(Char(","))),Exp(Print(Int(num))));
				else
					return `SeqInstrucao(i,Exp(Print(Int(num))));
			}
			i@If(condicao,inst1,inst2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(Char(","))),Exp(Print(Int(num))));
				else
					return `SeqInstrucao(i,Exp(Print(Int(num))));
			}
			i@While(condicao,inst) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(Char(","))),Exp(Print(Int(num))));
				else
					return `SeqInstrucao(i,Exp(Print(Int(num))));
			}
			i@For(decl,condicao,exp,inst) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(Char(","))),Exp(Print(Int(num))));
				else
					return `SeqInstrucao(i,Exp(Print(Int(num))));
			}
			i@Return(exp) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(Char(","))),Exp(Print(Int(num))));
				else
					return `SeqInstrucao(i,Exp(Print(Int(num))));
			}
      }
      visit Expressao {
			e@ExpNum(exp1,op,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(Char(",")),Print(Int(num)));
				else
					return `Expressoes(e,Print(Int(num)));
			}
			e@Ou(cond1,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(Char(",")),Print(Int(num)));
				else
					return `Expressoes(e,Print(Int(num)));
			}
			e@E(cond1,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(Char(",")),Print(Int(num)));
				else
					return `Expressoes(e,Print(Int(num)));
			}
			e@Comp(exp1,opComp,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(Char(",")),Print(Int(num)));
				else
					return `Expressoes(e,Print(Int(num)));
			}
      }
    }

    /*Escreve para MSP*/
    private String compileAnnot(Instrucao inst) {
		NumToInt numInstrucao = new NumToInt(1);
		String toReturn = compileAnnotInstrucao(inst, numInstrucao);
		//return toReturn.concat("Halt");
		return toReturn.substring(0,toReturn.length()-1);
	}
	
	private String compileAnnotInstrucao(Instrucao i, NumToInt numInstrucao) {
		%match(i) {
			Atribuicao(id,opAtrib,exp) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				%match(opAtrib) {
					Atrib() -> { return "Pusha \"" + prefix + `id + "\"," + genExp + "Store,"; }
					Mult() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Mul,Store,"; }
					Div() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Div,Store,"; }
					Soma() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Add,Store,"; }
					Sub() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Sub,Store,"; }
				}
				return "";
			}

			Declaracao(tipo,decls) -> {
				String genDecl = `compileAnnotDeclaracoes(decls, tipo, numInstrucao);
				functionsDeclarations.append(genDecl);
				return "";
			}

			If(condicao,inst1,inst2) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genInst1 = `compileAnnotInstrucao(inst1, numInstrucao);
				String genInst2 = `compileAnnotInstrucao(inst2, numInstrucao);
				int num = numInstrucao.inc();

				return genCondicao + "Jumpf \"senao" + num + "\"," + genInst1 + "Jump \"fse" + num + "\",ALabel \"senao" + num + "\"," + genInst2 + "ALabel \"fse" + num + "\",";
			}

			While(condicao,inst) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genInst = `compileAnnotInstrucao(inst, numInstrucao);
				int num = numInstrucao.inc();

				return "ALabel \"enq" + num + "\"," + genCondicao + "Jumpf \"fenq" + num + "\"," + genInst + "Jump \"enq" + num +"\"," + "ALabel \"fenq" + num + "\",";
			}

			For(decl,condicao,exp,inst) -> {
				String genDecl = `compileAnnotInstrucao(decl, numInstrucao);
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String genInst = `compileAnnotInstrucao(inst, numInstrucao);

				int num = numInstrucao.inc();
				String labelInit = "ALabel \"for" + num + "\",";
				String jump = "Jumpf \"ffor"+ num + "\",";
				String labelJump = "ALabel \"ffor" + num + "\",";
				String labelEnd = "Jump \"for" + num + "\",";

				functionsDeclarations.append(genDecl);

				return labelInit.concat(genCondicao).concat(jump).concat(genInst).concat(genExp).concat(labelEnd).concat(labelJump);
			}

			Return(exp) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix = "f:";
				String ret = "Ret,";
				String storeVarFunct = "Pusha \"" + prefix + actualFunctionName + "\"," + genExp + "Store,";

				return storeVarFunct;
			}

			Funcao(tipo,nome,argumentos,inst) -> {

				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				actualFunctionName = `nome;
				String prefix = "f:";
				String functionDeclaration = "Decl \"" + prefix + `nome + "\" " + actualMemAddress + " " +  sizeAddress + ",";
				String functionRet = "";
				%match(tipo) {
					DVoid() -> { if (!actualFunctionName.equals("main")) functionRet = "Ret,"; }
					_ -> { if(!actualFunctionName.equals("main")) functionRet = "Ret,"; }
				}
				String halt = actualFunctionName.equals("main") ? "Halt," : "";
				String genArgs = `compileArguments(nome, argumentos);

				functionsDeclarations.append(functionDeclaration);
				functionsDeclarations.append(genArgs);

				String genInst = `compileAnnotInstrucao(inst, numInstrucao);
				String function = "ALabel \"f:" + `nome + "\"," + genInst + functionRet + halt;
				
				return function;
			}

			Exp(exp) -> {
				callReturnNeeded = false;
				String exp = `compileAnnotExpressoes(exp, numInstrucao);
				callReturnNeeded = true;

				return exp;
			}

			SeqInstrucao(inst1, inst*) -> {
				String genInst = `compileAnnotInstrucao(inst1, numInstrucao);
				String seqInst = genInst.concat(`compileAnnotInstrucao(inst*, numInstrucao));

				return seqInst;
			}
		}
		return "";
	}

	private String compileArguments(String functionName, Argumentos args) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> {
				return compileArguments(functionName, `arg1) + compileArguments(functionName, `tailArg);
			}
			Argumento(_,idArg) -> {
				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				String prefix = functionName + "_";
				String declaration = "Decl \"" + prefix + `idArg + "\" " + actualMemAddress + " " +  sizeAddress + ",";
				
				return declaration;
			}
		}
		return "";
	}

	public String compileAnnotDeclaracoes(Declaracoes decl, DefTipo tipo, NumToInt numInstrucao) {
		%match(decl) {
			ListaDecl(dec1,tail*) -> {
				String gen = `compileAnnotDeclaracoes(dec1, tipo, numInstrucao);
				String gen2 = `compileAnnotDeclaracoes(tail*, tipo, numInstrucao);

				return gen + gen2;
			}	

			Decl(id,exp) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";
					
				String storeValue;
				if (genExp.equals(""))
					storeValue = "";
				else
					storeValue = "Pusha \"" + prefix + `id + "\"," + genExp + "Store,";
					
				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				%match(tipo) {
					DInt() -> { return "Decl \"" + prefix + `id + "\" " + actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DChar() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DBoolean() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DFloat() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DVoid() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
				}
				return "";
			}
		}
		return "";
	}

	private String compileAnnotExpressoes(Expressao e, NumToInt numInstrucao) {
		%match(e) {
			ExpNum(exp1,op,exp2) -> {
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				%match(op) {
					Mais() -> { return genExp1 + genExp2 + "Add,"; }
					Vezes() -> { return genExp1 + genExp2 + "Mul,"; }
					Divide() -> { return genExp1 + genExp2 + "Div,"; }
					Menos() -> { return genExp1 + genExp2 + "Sub,"; }
					Mod() -> { return genExp1.concat(genExp2); }
				}
				return "";
			}

			Id(id) -> { 
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";
					
				return "Pusha \"" + prefix + `id + "\",Load,"; 
			}

			Pos(exp) -> { return `compileAnnotExpressoes(exp, numInstrucao); }

			Neg(exp) -> { return `compileAnnotExpressoes(exp, numInstrucao); }

			Nao(exp) -> { 
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				return genExp + "Not,";
			}

			Call(id,parametros) -> { 
					Argumentos argumentos = functionSignatures.get(`id);
					String prefix = "f:";
					String loadReturn = callReturnNeeded ? "Pusha \"" + prefix + `id + "\",Load," : "";
					String genCallParameters = compileCallParameters(`id, argumentos, `parametros, numInstrucao);
					String call = "Call \"" + prefix + `id + "\",";
					return genCallParameters + call + loadReturn;
			 }

			IncAntes(opInc,id) -> { 
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";
					
				%match(opInc) {
					Inc() -> { return "Pusha \"" + prefix + `id + "\",Inc"; } 
					Dec() -> { return "Pusha \"" + prefix + `id + "\",Dec"; }
				}
				return `id;
			}

			IncDepois(opInc,id) -> { 
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";
					
				%match(opInc) {
					Inc() -> { return "Pusha \"" + prefix + `id + "\",Inc,"; } 
					Dec() -> { return "Pusha \"" + prefix + `id + "\",Dec,"; }
				}
				return `id;
			}

			Condicional(condicao,exp1,exp2) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				return genCondicao.concat(genExp1).concat(genExp2);
			}

			Int(i) -> { return "Pushi "+ `i + ","; }

			Char(c) -> { return "Pushc '" + `c.charAt(0) + "',"; }

			True() -> { return "Pushb true,"; }

			False() -> { return "Pushb false,"; }

			Float(f) -> { return "Pushf "+`f + ","; }

			Ou(cond1,cond2) -> {
				String genCond1 = `compileAnnotExpressoes(cond1, numInstrucao);
				String genCond2 = `compileAnnotExpressoes(cond2, numInstrucao);

				return genCond1 + genCond2 + "Or,";
			}

			E(cond1,cond2) -> {
				String genCond1 = `compileAnnotExpressoes(cond1, numInstrucao);
				String genCond2 = `compileAnnotExpressoes(cond2, numInstrucao);

				return genCond1 + genCond2 + "And,";
			}

			Comp(exp1,opComp,exp2) -> {
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				%match(opComp) {
					Maior() -> { return genExp1 + genExp2 + "Gt,"; }
					Menor() -> { return genExp1 + genExp2 + "Lt,"; }
					MaiorQ() -> { return genExp1 + genExp2 + "GoEq,"; }
					MenorQ() -> { return genExp1 + genExp2 + "LoEq,"; }
					Dif() -> { return genExp1 + genExp2 + "Neq,"; }
					Igual() -> { return genExp1 + genExp2 + "Eq,"; }
				}
			}
			
			Input(tipo) -> {
				%match(tipo) {
					DInt() -> { return "IIn int,"; }
					DChar() -> { return "IIn char,"; }
					DBoolean() -> { return "IIn boolean,"; }
					DFloat() -> { return "IIn float,"; }
				}
			}

			Print(exp) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);

				return genExp + "IOut,";
			}

			Expressoes(exp1, exp*) -> {
				String genExp = `compileAnnotExpressoes(exp1, numInstrucao);
				String exps = genExp.concat(`compileAnnotExpressoes(exp*, numInstrucao));

				return exps;
			}
			Empty() -> { return ""; }
		}
		return "";
	}

	private String compileCallParameters(String functionName, Argumentos argumentos, Parametros parametros, NumToInt numInstrucao) {
		%match (parametros, argumentos){
			ListaParametros(param1,tailParam*), ListaArgumentos(arg1,tailArg*) -> {
				return compileCallParameters(functionName, `arg1, `param1, numInstrucao) + compileCallParameters(functionName, `tailArg, `tailParam, numInstrucao);
			}
			Parametro(exp), Argumento(_,idArg) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix = functionName + "_";
				return "Pusha \"" + prefix + `idArg + "\"," + genExp + "Store,";
			}
		}
		return "";
	}

	private String genAnnotation(int i) {
		if (i == 1) {
			return "Pushi "+i+",IOut,";
		}
		else {
			return "Pushc ',',IOut,Pushi "+i+",IOut,";
		}
	}

	public static void metricas(String fileCsv, Metrica met){
		try{
			BufferedReader fileReader = new BufferedReader(new FileReader("../limites/"+fileCsv+".csv"));
			String line = "";
			fileReader.readLine();
			line = fileReader.readLine();
			ArrayList<Integer> tokens = new ArrayList<Integer>();
			for(String s : line.split(",")){
				tokens.add(Integer.parseInt(s));	
			}
			if(tokens.size() == 5)
				met.setMetricas(tokens.get(0), tokens.get(1), tokens.get(2), tokens.get(3), tokens.get(4));
			} catch(Exception e) {
				e.printStackTrace();
			}
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
	private Integer maxLinhas;
	private Integer maxDecl;
	private Integer maxArgs;
	private Integer maxNested;
	private Integer maxCC;

	/* Contar os smells */
	private Integer nSmells = 0;

	public Metrica() {
		this.funcoes = 0;
		this.nSmells = 0;
		this.maxLinhas = 0;
		this.maxDecl = 0;
		this.maxArgs = 0;
		this.maxNested = 0;
		this.maxCC = 0;
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

	public int getNSmells(){
		return this.nSmells;
	}

	public void setMetricas(Integer l, Integer d, Integer a, Integer b, Integer c){
		this.maxLinhas = l;
		this.maxDecl = d;
		this.maxArgs = a;
		this.maxNested = b;
		this.maxCC = c;	
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

	public void setSmells(Integer i){
		this.nSmells = i;
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

	/* 0 -> nao e smell ; 1 -> smell */
	public int classificaSmellLinhas(String s) {
		int a, res = 0;
		if((a = this.funcoesLinhas.get(s)) > this.maxLinhas){
			res = 1;
			this.nSmells++;
		}
		return res;
	}

	public int classificaSmellDecl(String s) {
		int a, res = 0;
		if((a = this.funcoesDecl.get(s)) > this.maxDecl){
		  	res = 1;
		  	this.nSmells++;
		}
		return res;
	}

	public int classificaSmellArgs(String s) {
		int a, res = 0;
		if((a = this.funcoesArgs.get(s)) > this.maxArgs){
		  	res = 1;
		  	this.nSmells++;
		}
		return res;
	}

	public int classificaSmellNested(String s) {
		int a, res = 0;
		if((a = this.funcoesNested.get(s)) > this.maxNested){
		  	res = 1;
		  	this.nSmells++;
		}
		return res;
	}

	public int classificaSmellCC(String s) {
		int a, res = 0;
		if((a = this.funcoesCC.get(s)) > this.maxCC){
		  	res = 1;
		  	this.nSmells++;
		}
		return res;
	}

}
