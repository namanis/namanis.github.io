package com.alpi.classes.generico.collecao;
import java.util.stream.IntStream;
class EvenNumbers {
public static void main(String []args) {
IntStream.rangeClosed(0, 10)
.filter(i -> (i % 2) == 0)
.forEach(System.out::println);
}
}
	