package com.alpi.classes.aninhadas;

public class TestColor {
public static void main(String []args) {
// since Color is a static nested class,
// we access it using the name of the outer class, as in Shape.Color
// note that we do not (and cannot) instantiate Shape class for using Color class
Shape.Color white = new Shape.Color(255, 255, 255);
System.out.println("White color has values:" + white);
}
}