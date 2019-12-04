package com.alpi.classes.generico.collecao;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StreamObjectoArray {
	public static void main(String []args) {
	Object [] words = Pattern.compile(" ").splitAsStream("1 2 3 4 5").toArray();
	System.out.println(Arrays.stream(words).mapToInt(str -> Integer.valueOf((String)str)).sum());
}
}