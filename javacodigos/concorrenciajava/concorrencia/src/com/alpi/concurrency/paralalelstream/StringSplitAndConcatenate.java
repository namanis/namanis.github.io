package com.alpi.concurrency.paralalelstream;

import java.util.Arrays;
class StringConcatenator {
public static String result = "";
public static void concatStr(String str) {
result = result + " " + str;
}
}
class StringSplitAndConcatenate {
public static void main(String []args) {
String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
//Arrays.stream(words).forEach(StringConcatenator::concatStr);//sequencial dependente o estado global
//Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);//paralelo sofre de race condition
System.out.println(StringConcatenator.result);
}
}