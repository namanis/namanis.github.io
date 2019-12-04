package com.alpi.classes.aninhadas;

public class StatusReporter {
static Shape.Color getDescriptiveColor(final Shape.Color color){


	
class DescriptiveColor extends Shape.Color{
	public String toString(){
		return "you selected a color with RGB values" + color;
	}
}
return new DescriptiveColor();
}

public static void main(String [] args){
	Shape.Color descriptiveColor =StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
	System.out.println(descriptiveColor);
}
}

