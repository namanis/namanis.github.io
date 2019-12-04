package com.alpi.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class WordsCalculation2 {
	public static void main(String []args) {
		String[] string = "you never know what you have until you clean your room".split(" ");
		System.out.println(Arrays.stream(string).min(String::compareTo).get());
	Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
	System.out.println(Arrays.stream(string).min(lengthCompare).get());
}
}