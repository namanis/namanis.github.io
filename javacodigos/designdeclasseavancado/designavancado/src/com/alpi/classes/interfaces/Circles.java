package com.alpi.classes.interfaces;

//Shape is the base class for all shape objects; shape objects that are associated with
//a parent shape object is remembered in the parentShape field
abstract class Shape2 {
abstract double area();
private Shape2 parentShape;
public void setParentShape(Shape2 shape) {
parentShape = shape;
}
public Shape2 getParentShape() {
return parentShape;
}
}
//Rollable interface can be implemented by circular shapes such as Circle
interface Rollable2 {
void roll(float degree);
}
abstract class CircularShape2 extends Shape2 implements Rollable2 { }
//Circle is a concrete class that is-a subtype of CircularShape;
//you can roll it and hence implements Rollable through CircularShape base class
public class Circles extends CircularShape2 {
private int xPos, yPos, radius;
public Circles(int x, int y, int r) {
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
Circles circle = new Circles(10,10,20);
circle.roll(45);
}
}