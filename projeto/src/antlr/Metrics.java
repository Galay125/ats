package antlr;

import java.util.*;

public class Metrics {
	private int maxLines;
	private int maxLinesFunc;
	private int maxArgs;
	private int maxArgsFunc;
	private int maxFunc;
	private int maxNastedBlocks;
	
	public Metrics(){
		this.maxLines = 100;
		this.maxLinesFunc = 20;
		this.maxArgs = 20;
		this.maxArgsFunc = 5;
		this.maxFunc = 10;
		this.maxNastedBlocks = 5;
	}
	
	public void maxFunc(int func){
		System.out.println("Programa: "+ func + " funções (max: " + this.maxFunc + ")");
	}
	
	public void linesOfCode(int lines){
		System.out.println("Programa: "+ lines + " linhas (max: " + this.maxLines + ")");
	}
	
	public void linesOfCodeFunc(HashMap<String,Integer> lines){
		for(String s : lines.keySet()){
			System.out.println("Função "+ s + ": " + lines.get(s) + " linhas (max: " + this.maxLinesFunc + ")");
        }
	}
	
	public void maxArgs(int args){
			System.out.println("Programa: "+ args + " argumentos (max: " + this.maxArgs + ")");
	}
	
	public void maxArgsFunc(HashMap<String,Integer> args){
		for(String s : args.keySet()){
			System.out.println("Função "+ s + ": " + args.get(s) + " argumentos (max: " + this.maxArgsFunc + ")");
        }
	}
	
	public void maxNastedBlocks(HashMap<String,Integer> blocks){
		for(String s : blocks.keySet()){
			System.out.println("Função "+ s + ": " + blocks.get(s) + " blocos (max: " + this.maxNastedBlocks + ")");
        }
	}
	
}
