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
	      
	      /*Main text = new Main();
		  
		  String file = "../exemplos/fi.i";
		  
		  List<String> lines = text.readSmallTextFile(file);
		  
		  for(String line : lines){
			  System.out.println(line);
		  }*/

		  
	  }
	  
	  private static void log(Object aMsg){
		    System.out.println(String.valueOf(aMsg));
		  }
}
