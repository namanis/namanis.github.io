package com.alpi.entrada.saida;

import java.io.*;
class StreamTest {
public static void main(String []args ){
try{
PrintStream ps = new PrintStream("log.txt");
System.setOut(ps);
System.out.println("Test output to System.out");
} catch(Exception ee){
ee.printStackTrace();
}
}
}