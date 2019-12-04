package com.alpi.classes.generico.collecao;


import java.util.stream.IntStream;
class EvenSquares {
public static void main(String []args) {
IntStream.rangeClosed(0, 10)
.map(i -> i * i)
.filter(i -> (i % 2) == 0)
.forEach(System.out::println);

IntStream.rangeClosed(0, 10) // imprime o mesmo mesmo invertendo as posicoes de flter e map
.filter(i -> (i % 2) == 0) 
.map(i -> i * i) // call map AFTER calling filter
.forEach(System.out::println);


}
}