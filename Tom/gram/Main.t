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

	public static void menu(String file){

		System.out.println("\n************** Menu ************");
		
		if(file != null)
				System.out.println("\nFicheiro executado:"+file+"\n");

		System.out.println("1 ----------------- Ler ficheiros");
		System.out.println("2 ----------------- Gerar Árvore GOM ");
		System.out.println("3 ----------------- Gerar código MSP");
		System.out.println("4 ----------------- Gerar ficheiro .dot");
		System.out.println("t ----------------- Teste de Strategy");
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
 		Tree b = null;
 		String aux = null;
 		Main main = new Main();
 		ArrayList<Integer> numInstrucao = new ArrayList<Integer>();

		while(sair == false){
 			 
 			 menu(file);
			 
			 opcao = teclado.readLine();
			 
			 switch(opcao){
			 	case "1":
			 		System.out.println("\nDigite o nome do ficheiro: ../exemplos/fi.i | ../exemplos/fatorial.i | ../exemplos/maiorDeDoisNumeros.i");
			 		file = readFile();
			 	break;

			 	case "2":
			 		try {
						iLexer lexer = new iLexer(new ANTLRFileStream(file));
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						iParser parser = new iParser(tokens);
						// Parse the input expression
						b = (Tree) parser.prog().getTree();
						p = (Instrucao) iAdaptor.getTerm(b);

						System.out.println("Arvore gerada = " + p); // name of the Gom module + Adaptor

						/*Export code generated to .txt file*/
					} catch(Exception e) {
						e.printStackTrace();
					}
			 	break;

			 	case "3":
			 			try{
			 				main = new Main();
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
							System.out.println("2--- Tratar bad smalls");
							System.out.println("0--- Sair\n");
							aux = readFile();
							
							if(aux.equals("1")){
								/* Injecção */
								TreeSet<Integer> blocosMaisUsados = new TreeSet<Integer>();
								Main.parseFile(file,blocosMaisUsados);
								numInstrucao.clear();
								numInstrucao.add(1);
								Instrucao p3 = `BottomUp(stratFaultInjectionWithKnowledge(numInstrucao, blocosMaisUsados)).visit(p2);
								instrucoes = main.compileAnnot(p3);
							}
							else if(aux.equals("2")){
								/*Bad Smells*/
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
						}
			 	break;

			 	case "4":
			 			/* Export this representation to .dot file*/
						try{
							System.out.println("Nome de Ficheiro: ");
							aux = readFile();
							FileWriter out=new FileWriter(aux);
							Viewer.toDot(p,out);
						}
						catch (IOException e){
							System.out.println("ERROR in dot file"); 
						}
			 	break;


			 	case "t":
						try{
							`TopDown(printFixe()).visit(p);
						}
						catch(VisitFailure e) {
								System.out.println("the strategy failed");
						}
			 	break;

			 	case "0":
			 		 sair = true;
			 	break;
			 }

		}		

	}

	private static String readFile() throws IOException{
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String s = br.readLine();
		  
		  return s;
	  }


	public Main() {
		actualFunctionName = "";
		functionSignatures = new HashMap<String, Argumentos>();
		callReturnNeeded = true;
		functionsDeclarations = new StringBuilder();
		memAdress = 0;
	}

	public static Argumentos removeArgumentosNaoUtilizados(Argumentos args, TreeSet<String> idsUtilizados) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> {
				%match(arg1) {
					a@Argumento(_,idArg) -> {
						if (idsUtilizados.contains(`idArg))
							return `ListaArgumentos(a,removeArgumentosNaoUtilizados(tailArg*,idsUtilizados));
						else
							return removeArgumentosNaoUtilizados(`tailArg*,idsUtilizados);
					}
				}
			}
		}
		return args;
	}

    %strategy stratBadSmells() extends Identity() {
    	visit Instrucao {
    		If(Nao(condicao),inst1,inst2) -> {
    			return `If(condicao,inst2,inst1);
    		}
    		Funcao(tipo,nome,argumentos,inst) -> {
    			TreeSet<String> idsUtilizados = new TreeSet<String>();
				`TopDown(stratCollectIds(idsUtilizados)).visit(`inst);
    			Argumentos args = removeArgumentosNaoUtilizados(`argumentos,idsUtilizados);
    			return `Funcao(tipo,nome,args,inst);
    		}
    	}
    }

    %strategy stratCollectIds(Set idsUtilizados) extends Identity() {
    	visit Instrucao {
    		Atribuicao(id,opAtrib,exp) -> {
    			idsUtilizados.add(`id);
    		}
    	}
    	visit Expressao {
    		Id(id) -> { 
    			idsUtilizados.add(`id);
    		}
    		IncAntes(opInc,id) -> { 
    			idsUtilizados.add(`id);
    		}
    		IncDepois(opInc,id) -> { 
    			idsUtilizados.add(`id);
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

    %strategy stratFaultInjection() extends Identity() {
      visit Instrucao {
		If(condicao,inst1,inst2) -> {
			return `If(condicao,inst2,inst1);
		}
		While(condicao,inst) -> {
			return `While(Nao(condicao),inst);
		}
		For(decl,condicao,exp,inst) -> {
			return `For(decl,Nao(condicao),exp,inst);
		}
      }
    }

    %strategy stratFaultInjectionWithKnowledge(ArrayList numInstrucao,Set blocos) extends Identity() {
      visit Instrucao {
			i@Atribuicao(_,_,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `i;
			}
			If(condicao,inst1,inst2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `If(condicao,inst2,inst1);
			}
			While(condicao,inst) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `While(Nao(condicao),inst);
			}
			For(decl,condicao,exp,inst) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `For(decl,Nao(condicao),exp,inst);
			}
			i@Return(exp) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
      }
      visit Expressao {
			e@ExpNum(exp1,op,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@Ou(cond1,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@E(cond1,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@Comp(exp1,opComp,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
      }
    }

    %strategy printFixe() extends Identity() {
      visit Instrucao {
		If(condicao,inst1,inst2) -> {
			System.out.println("Passei num if, brutal mano !");
		}
		While(condicao,inst) -> {
			System.out.println("Passei num while, brutal mano !");
		}
		For(decl,condicao,exp,inst) -> {
			System.out.println("Passei num for, brutal mano !");
		}
      }
    }

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
					Inc() -> { return "Pusha \"" + prefix + `id + "\",In"; } 
					Dec() -> { return "Pusha \"" + prefix + `id + "\",De"; }
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

	private static boolean parseFile(String filename, TreeSet<Integer> blocos) { 
		try { 
			BufferedReader br = new BufferedReader( new FileReader(filename) ); 
			String line = ""; 
			StringTokenizer token = null; 

			while((line = br.readLine()) != null) { 
				token = new StringTokenizer(line, ","); 

				while(token.hasMoreTokens()) { 
					String tokenS = token.nextToken();
					blocos.add(Integer.parseInt(tokenS));
				} 
			} 
			return true; 
		} catch(Exception e) { 
			return false; 
		}
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

	public Metrica() {
		this.funcoes = 0;
	}
}
