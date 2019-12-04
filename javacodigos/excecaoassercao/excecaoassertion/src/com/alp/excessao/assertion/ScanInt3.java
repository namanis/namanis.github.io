package com.alp.excessao.assertion;

import java.util.Scanner;
import java.util.InputMismatchException;
class ScanInt3 {
public static void main(String [] args) {
String integerStr = "1";
System.out.println("The string to scan integer from it is: " + integerStr);
Scanner consoleScanner = new Scanner(integerStr);
/*try {
System.out.println("The integer value scanned from string is: " +
consoleScanner.nextInt());
} catch(InputMismatchException ime) {
// nextInt() throws InputMismatchException in case
// anything other than an integeris provided in the string
System.out.println("Error: Cannot scan an integer from the given string");*/

try {
System.out.println("You typed the integer value: " + consoleScanner.nextInt());
} catch(InputMismatchException ime) {
// if something other than integer is typed, we'll get this exception, so handle it
System.out.println("Error: You typed some text that is not an integer value...");
} catch(Exception e) {
// catch IllegalStateException here which is unlikely to occur...
System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
}
}
}
