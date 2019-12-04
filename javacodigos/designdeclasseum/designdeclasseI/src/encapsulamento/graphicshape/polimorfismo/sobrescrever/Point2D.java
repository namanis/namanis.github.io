package encapsulamento.graphicshape.polimorfismo.sobrescrever;


public class Point2D{
private int xPos, yPos;
public Point2D(int x, int y){
xPos=x;
yPos=y;
}

public String toString(){
return "x= " + xPos + ", y = "+yPos;
}

public int hashCode() {
long bits = java.lang.Double.doubleToLongBits(getX());
bits ^= java.lang.Double.doubleToLongBits(getY()) * 31;
return (((int) bits) ^ ((int) (bits >> 32)));
}
private double getY() {
	// TODO Auto-generated method stub
	return 0;
}

private double getX() {
	// TODO Auto-generated method stub
	return 0;
}

public static void main (String [] args){
System.out.println(new Point(2,3));
}
}

