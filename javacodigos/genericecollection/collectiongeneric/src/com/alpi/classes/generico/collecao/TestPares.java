package com.alpi.classes.generico.collecao;

public class TestPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pares<Integer, String> par = new Pares<Integer, String>(new Integer(9), " 2018");
	System.out.println(par);
	
	Pares<Integer, String> worldCup = new Pares<Integer, String>(2018, "Russia");
	System.out.println("World cup " + worldCup.getFirst() +
	" in " + worldCup.getSecond());
	
	Pares<Integer, String> worldCup2 = new Pares<>(2018, "Russia"); // diamond sintax
	System.out.println("World cup " + worldCup2.getFirst() +
	" in " + worldCup2.getSecond());
	
	
	}
	}


