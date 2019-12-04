package com.alpi.streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CollectorsToMap {
public static void main(String []args) {
Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")

//.collect(Collectors.toMap(name -> name, name -> name.length()));
.collect(Collectors.toMap(Function.identity(), name -> name.length()));
nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
}
}