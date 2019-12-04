package com.alpi.classes.interfaces.Lambda;

interface Function {
void call();
}
class AnnonymousInnerClass {
public static void main(String []args) {
Function function = new Function() {
public void call() {
System.out.println("Hello world");
}
};
function.call();
}
}