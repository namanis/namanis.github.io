package com.alpi.keystatic;

public class CounterII {
private static int count;
static {
// code in this static block will be executed when
// the JVM loads the class into memory
count = 1;
}
public CounterII() {
count++;
}
public static void printCount() {
System.out.println("Number of instances created so far is: " + count);
}
public static void main(String []args) {
CounterII anInstance = new CounterII();
CounterII.printCount();
CounterII anotherInstance = new CounterII();
CounterII.printCount();
}
}