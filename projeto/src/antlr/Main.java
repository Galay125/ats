package antlr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;

public class Main {
	
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	  public static void main(String args[]) throws IOException {
		  
		  String file = readFile();
		  
		  CharStream str = new ANTLRFileStream("../exemplos/"+file);
		  gramCLexer lexer = new gramCLexer(str);
		  gramCParser parser = new gramCParser (new CommonTokenStream(lexer));
		  
	      parser.prog();
	      
	      Metrics metricas = new Metrics();
	      
	      metricas.maxFunc(parser.getFuncs());
	      metricas.linesOfCode(parser.getLines());
	      metricas.maxArgs(parser.getArgs());
	      System.out.println();
	      metricas.linesOfCodeFunc(parser.getLinesFunc());
	      metricas.maxArgsFunc(parser.getArgsFunc());
	      metricas.maxNastedBlocks(parser.getNastedBlocks());
	  }
	  
	  /* Lê o ficheiro que irá ser verificado */
	  private static String readFile() throws IOException{
		  
		  System.out.println("Digite o nome do ficheiro: fi.i | fatorial.i | maiorDeDoisNumeros.i");
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String s = br.readLine();
		  
		  return s;
	  }
	  
	  
	  private static void log(Object aMsg){
		    System.out.println(String.valueOf(aMsg));
	  }
}
