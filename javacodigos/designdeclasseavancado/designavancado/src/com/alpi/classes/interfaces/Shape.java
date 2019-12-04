package com.alpi.classes.interfaces;


//Shape is the base class for all shape objects; shape objects that are associated with
//a parent shape object is remembered in the parentShape field
abstract class Shape {
abstract double area();
//private Shape parentShape;
//public void setParentShape(Shape shape) {
//parentShape = shape;
//}
//public Shape getParentShape() {
//return parentShape;
//}
}
//Rollable interface can be implemented by circular shapes such as Circle
interface Rollable {
void roll(float degree);


//Circle is a concrete class that is-a subtype of CircularShape;
//you can roll it and hence implements Rollable through CircularShape base class
}


