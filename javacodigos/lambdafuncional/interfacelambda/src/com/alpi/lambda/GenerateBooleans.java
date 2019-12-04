package com.alpi.lambda;

import java.util.stream.Stream;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
class GenerateBooleans {
public static void main(String []args) {
Random random = new Random();
Stream.generate(random::nextBoolean)
.limit(2)
.forEach(System.out::println);

//retorna um valor sem  levr nada
Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
System.out.println(currentDateTime.get());

Function<String, Integer> anotherInteger = Integer::new;
System.out.println(anotherInteger.apply("100"));
// this code prints: 100
}
}