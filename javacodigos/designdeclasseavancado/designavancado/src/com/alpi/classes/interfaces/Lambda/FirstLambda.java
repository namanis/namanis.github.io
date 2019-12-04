package com.alpi.classes.interfaces.Lambda;

interface LambdaFunction{
	void call();
}
public class FirstLambda {
 public static void main(String [] args){
	 LambdaFunction lambdaFunction = () -> System.out.println("Hello World");
   lambdaFunction.call();
 }
}
