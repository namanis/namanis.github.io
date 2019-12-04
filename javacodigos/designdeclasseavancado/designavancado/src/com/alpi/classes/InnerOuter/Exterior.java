package com.alpi.classes.InnerOuter;

public class Exterior {
	private int value = 2017;
	public class Interior{
		public void printValue(){
			System.out.println("Interior: Value : " + value);
		}
	}
	public void prinValue(){
		System.out.println("Exterior : Value : " + value);
	}
	public void  setValue(int newValue){
		this.value=newValue;
	}
}



