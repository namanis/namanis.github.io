package com.alpi.lambda;

import java.util.Arrays;

public class FunctionUseTest2{ 
	
public static void main(String [] args) {
Arrays.stream("4, -9, 16".split(", "))
.map(Integer::parseInt)
.map(i -> (i < 0) ? -i : i)
.forEach(System.out::println);
}
}