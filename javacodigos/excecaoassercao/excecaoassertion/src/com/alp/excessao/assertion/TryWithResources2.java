package com.alp.excessao.assertion;

import java.util.Scanner;
class TryWithResources2 {
public static void main(String [] args) {
System.out.println("Type an integer in the console: ");
try(Scanner consoleScanner = new Scanner(System.in)) {
System.out.println("You typed the integer value: " + consoleScanner.nextInt());
}
}
}