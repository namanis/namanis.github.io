package com.alpi.streamapi;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExtractStreamPeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1, 2, 3, 4, 5)
		.peek(i -> System.out.printf("%d ", i))
		.map(i -> i * i)
		.peek(i -> System.out.printf("%d ", i))
		.count();
		
		DoubleStream.of(1.0, 4.0, 9.0)
		.map(Math::sqrt)
		.peek(System.out::println)
		.sum();
	}

}
