package com.alpi.classes.generico.collecao;

public class TetBoxPrint {
public static void main(String [] args){
	
	BoxPrinter<Integer> value = new BoxPrinter<Integer>(new Integer(10));
	System.out.println(value);
	BoxPrinter<String> value2 = new BoxPrinter<String>("Olá Mundão de Jah!");
	System.out.println(value2);

}
}
