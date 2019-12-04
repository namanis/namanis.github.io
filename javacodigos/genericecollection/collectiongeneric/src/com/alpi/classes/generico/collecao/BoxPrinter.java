package com.alpi.classes.generico.collecao;

public class BoxPrinter<T> {
	private T val;
	public BoxPrinter(T arg){
		val= arg;
		
	}
	
	public String toString(){
		return "[" + val+"]";
	}

}
