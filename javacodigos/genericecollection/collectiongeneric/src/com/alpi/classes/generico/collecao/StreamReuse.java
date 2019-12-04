package com.alpi.classes.generico.collecao;

import java.util.stream.IntStream;
public class StreamReuse {
public static void main(String []args) {
IntStream chars = "bookkeep".chars();
chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));
//System.out.println(chars.count());

}
}