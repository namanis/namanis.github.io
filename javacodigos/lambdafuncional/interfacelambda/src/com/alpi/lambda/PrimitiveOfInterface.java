package com.alpi.lambda;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveOfInterface {
	public static void main(String []args) {
	AtomicInteger ints = new AtomicInteger(0);
	IntStream.generate(ints::incrementAndGet).limit(10).forEach(System.out::println);
	// prints integers from 1 to 10 on the console
	
	AtomicInteger ints2 = new AtomicInteger(0);
	Stream.generate(ints2::incrementAndGet).limit(10).forEach(System.out::println); //com autoboxing
	// prints integers from 1 to 10 on the console
}
}