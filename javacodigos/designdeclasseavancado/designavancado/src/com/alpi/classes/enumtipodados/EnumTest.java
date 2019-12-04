package com.alpi.classes.enumtipodados;

public class EnumTest {
	
	PrinterType printerType;
	
	
	public EnumTest(PrinterType pType){
	
	printerType=pType;
	}
	
	public void feature(){
	
		switch(printerType){
		case DOTMATRIX:
			System.out.println("Dot-matrix printers are econimal nd almost obsolete");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out.println("LaSer printers provide best quality prints");
			break;
		}
		System.out.println("Print page capacity per minute: " + printerType.getPrintPageCapacity());
				
	}
	
	public static void main(String[] args) {
		EnumTest enumTest = new EnumTest(PrinterType.DOTMATRIX);
		enumTest.feature();
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
		}
		}
		


