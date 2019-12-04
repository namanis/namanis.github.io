package com.alpi.classes.interfaces;

abstract class CircularShape extends Shape implements Rollable { }
public class Circle extends CircularShape {
private int xPos, yPos, radius;
public Circle(int x, int y, int r) {
xPos = x;
yPos = y;
radius = r;
}
public double area() { return Math.PI * radius * radius; }
@Override
public void roll(float degree) {
//implement rolling functionality here...
//for now, just print the rolling degree to console
System.out.printf("rolling circle by %f degrees", degree);
}
public static void main(String[] s) {
Circle circle = new Circle(10,10,20);
System.out.println(circle.area());
circle.roll(45);

}
}