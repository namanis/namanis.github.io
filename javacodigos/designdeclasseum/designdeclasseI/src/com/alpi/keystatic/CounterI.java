package com.alpi.keystatic;

//Counter class should count the number of instances created from that class
public class CounterI {
private static int count; // variable to store the number of objects created
//for every Counter object created, the default constructor will be called;
//so, update the counter value inside the default constructor
public CounterI() {
count++;
}
public static void printCount() { // method to print the counter value so far
System.out.println("Number of instances created so far is: " + count);
}
public static void main(String []args) {
CounterI anInstance = new CounterI();
//note we call printCount using the class name
//instead of instance variable name
CounterI.printCount();
CounterI anotherInstance = new CounterI();
CounterI.printCount();
}
}