package geral;

import java.io.IOException;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
	
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	  public static void main(String args[]) throws IOException {
		  
		  Main text = new Main();
		  
		  String file = "../exemplos/fi.i";
		  
		  List<String> lines = text.readSmallTextFile(file);
		  
		  for(String line : lines){
			  System.out.println(line);
		  }

		  
	  }
	  
	  List<String> readSmallTextFile(String file) throws IOException {
		    Path path = Paths.get(file);
		    return Files.readAllLines(path, ENCODING);
		  }
	  
	  private static void log(Object aMsg){
		    System.out.println(String.valueOf(aMsg));
		  }
}
