package com.alpi.concurrency.paralalelstream;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
/*class StringConcatenator {
public static String result = "";
public static void concatStr(String str) {
result = result + " " + str;
}
}*/
class CorrectStringSplitAndConcatenate {
public static void main(String []args) {
String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
Optional<String> originalString =
(Arrays.stream(words).parallel().reduce((a, b) -> a + " - " + b));
System.out.println(originalString.get());
System.out.println(ForkJoinPool.commonPool().getParallelism());
}
}