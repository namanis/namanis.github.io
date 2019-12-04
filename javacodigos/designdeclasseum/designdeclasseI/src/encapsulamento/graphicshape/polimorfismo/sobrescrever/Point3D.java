package encapsulamento.graphicshape.polimorfismo.sobrescrever;



public class Point3D extends Point2D{
private int zPos;
//provide a public constructors that takes three arguments(x, y, and z values)
public Point3D(int x, int y, int z){
super(x,y);
zPos=z;

}

// override toString method as well

public String toString(){
return super.toString() + ", z=" + zPos;
}
// to test if we extended corretly, call the toString

public static void main (String [] args){
System.out.println(new Point3D(10,23,43));
}
}