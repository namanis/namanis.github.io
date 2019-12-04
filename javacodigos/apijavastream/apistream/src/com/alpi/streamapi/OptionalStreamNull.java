package com.alpi.streamapi;

import java.util.Optional;

public class OptionalStreamNull {
	public static void main(String []args) {
	Optional<String> string = Optional.ofNullable(null);
	System.out.println(string.map(String::length).orElse(-1));
	//lançando uma exceção
	Optional<String> string1 = Optional.ofNullable(null);
	System.out.println(string1.map(String::length).orElseThrow(IllegalArgumentException::new));
}
}