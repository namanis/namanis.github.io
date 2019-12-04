package com.alpi.streamapi;

import java.util.stream.Stream;

public class ExtractStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();
		System.out.printf("The stream has %d elements", count);
	}

}
