package com.alpi.lambda;
//import java.util.Arrays;
import java.util.function.Function;
public class FunctionTeste {
	public static void main(String [] args) {
	Function<String, Integer> strLength = str -> str.length();
	System.out.println(strLength.apply("supercalifragilisticexpialidocious"));
	// prints: 34
}
}