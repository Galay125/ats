package antlr;

import java.io.IOException;
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
		  
		  CharStream str = new ANTLRFileStream("../exemplos/fatorial.i");
		  gramCLexer lexer = new gramCLexer(str);
		  gramCParser parser = new gramCParser (new CommonTokenStream(lexer));
		  
	      parser.prog();
	      
	      Metrics metricas = new Metrics();
	      
	      metricas.maxFunc(parser.getFuncs());
	      metricas.linesOfCode(parser.getLines());
	      metricas.maxArgs(parser.getArgs());
	      System.out.println("\n");
	      metricas.linesOfCodeFunc(parser.getLinesFunc());
	      metricas.maxArgsFunc(parser.getArgsFunc());
	      
	  }
	  
	  
	  private static void log(Object aMsg){
		    System.out.println(String.valueOf(aMsg));
		  }
}
