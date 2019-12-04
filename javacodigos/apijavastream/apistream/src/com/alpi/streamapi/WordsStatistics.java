package com.alpi.streamapi;


import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
public class WordsStatistics {
public static void main(String []args) {
String limerick = "There was a young lady named Bright " +
"who traveled much faster than light " +
"She set out one day " +
"in a relative way " +
"and came back the previous night ";
IntSummaryStatistics wordsStatistics =
Pattern.compile(" ")
.splitAsStream(limerick)
.mapToInt(word -> word.length())
.summaryStatistics();
System.out.printf(" Number of words = %d \n Sum of the length of the words = %d \n" +
" Minimum word size = %d \n Maximum word size %d \n " +
" Average word size = %f \n", wordsStatistics.getCount(),
wordsStatistics.getSum(), wordsStatistics.getMin(),
wordsStatistics.getMax(), wordsStatistics.getAverage());

System.out.println(IntStream.of(10, 20, 30, 40).sum());
System.out.println(IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val)));
System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt()); //fatorial
}
}