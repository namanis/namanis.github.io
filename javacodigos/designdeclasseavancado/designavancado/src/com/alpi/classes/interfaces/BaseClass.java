package com.alpi.classes.interfaces;

 class BaseClass {
public void foo() { System.out.println("BaseClass's foo"); }
}
interface BaseInterface {
default public void foo() { System.out.println("BaseInterface's foo"); }
}
 