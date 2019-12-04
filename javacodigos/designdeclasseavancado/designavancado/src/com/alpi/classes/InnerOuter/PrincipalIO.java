package com.alpi.classes.InnerOuter;

public class PrincipalIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exterior ext = new Exterior();
Exterior.Interior in = ext.new Interior();

ext.prinValue();
in.printValue();
ext.setValue(2018);
ext.prinValue();
in.printValue();
		
	}

}
