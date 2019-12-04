package com.alpi.lambda;

import java.util.function.BiFunction;

public class BiInterface {
	public static void main(String [] args){
	BiFunction<String, String, String> concatStr = (x, y) -> x + y;
	System.out.println(concatStr.apply("hello ", "world"));
	
	//In this example, the arguments and return type are same type, but they can be different, as in:
		BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		System.out.println(compareDoubles.apply(10.0, 10.0));
}
}