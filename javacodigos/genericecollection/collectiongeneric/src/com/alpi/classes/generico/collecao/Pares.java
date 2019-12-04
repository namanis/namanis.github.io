package com.alpi.classes.generico.collecao;

public class Pares<T, G> {
	
	private T object1;
	private G object2;

	public Pares(T obj1, G obj2){
		
		object1=obj1;
		object2=obj2;
	}
	
	public T getFirst(){
		return object1;
	}
	public G getSecond(){
		return object2;
	}
	
	public String toString(){
		return "[" + object1+"]" + "["+object2+"]"; 
	}
}
