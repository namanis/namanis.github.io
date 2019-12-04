package com.alpi.concurrency.paralalelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
class PrimeNumbers {
// numeros primos são n dividos por 1 e por ele mesmo
private static boolean isPrime(long val) {
for(long i = 2; i <= val/2; i++) {
if((val % i) == 0) {
return false;
}
}
return true;
}
public static void main(String []args) {
long numOfPrimes = LongStream.rangeClosed(2, 100_000)
.parallel()
.filter(PrimeNumbers::isPrime)
.count();
System.out.println(numOfPrimes);
List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
System.out.println(ints.parallelStream().filter(i -> (i % 2) == 0).isParallel());
}
}