package encapsulamento.graphicshape.polimorfismo.sobrescrever;


class Point {
private int xPos, yPos;
public Point(int x, int y) {
xPos = x;
yPos = y;
}
// this toString method overrides the default toString method implementation
// provided in the Object base class
public String toString() {
return "x = " + xPos + ", y = " + yPos;
}

public boolean equals(Point other){
	if(other==null){
		return false;
	}
	
	if((xPos == other.xPos) && (yPos == other.yPos)){
		return true;}
		else {return false;}
	}
@Override
public boolean equals(Object other) {
if(other == null)
return false;
//check if the dynamic type of 'other' is Point
//if 'other' is of any other type than 'Point', the two objects cannot be
//equal if 'other' is of type Point (or one of its derived classes), then
//downcast the object to Point type and then compare members for equality
if(other instanceof Point) {
Point anotherPoint = (Point) other;
//two points are equal only if their x and y positions are equal
if((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
return true;
}
return false;

}
public static void main(String []args) {
System.out.println(new Point(10, 20));

Object obj = new Point(10, 20);
System.out.println(obj);
System.out.println(new Point(10, 200));

Point point1 = new Point(10 ,20);
Point point2 = new Point(10,20);
Point point3 = new Point(30,10);
Point point4 = new Point(30,10);
System.out.println("Point 1 comparado a a point 2 é ? " + point1.equals(point2));

System.out.println("Point 2 comparado a a point 3 é ? " + point2.equals(point3));

System.out.println("Point 3 comparado a a point 4 é ? " + point3.equals(point4));


Object p1 = new Point(10, 20);
Object p2 = new Point(50, 100);
Object p3 = new Point(10, 20);
System.out.println("p1 equals p2 is " + p1.equals(p2));
System.out.println("p1 equals p3 is " + p1.equals(p3));

Object p4 = new Point(10, 20);
Object p5 = new Point(50, 100);
Object p6 = new Point(10, 20);
System.out.println("p4 equals p5 is " + p4.equals(p5));
System.out.println("p5 equals p6 is " + p5.equals(p6));
}
}


//Subscrevendo atraves do toString() para eveitar perda de referencia doo objeto;