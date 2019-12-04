package com.alpi.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicate2{
	public static void main(String [] args){
	BiPredicate<List<Integer>, Integer> listContains = List::contains;
	List aList = Arrays.asList(10, 20, 30);
	System.out.println(listContains.test(aList, 20));
}
}