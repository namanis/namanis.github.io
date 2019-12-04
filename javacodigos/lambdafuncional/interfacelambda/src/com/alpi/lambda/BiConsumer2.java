package com.alpi.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer2 {

	public static void main(String [] args){
	BiConsumer<List<Integer>, Integer> listAddElement = List::add;
	List aList = new ArrayList();
	listAddElement.accept(aList, 10);
	System.out.println(aList);
	// prints: [10]
}
}