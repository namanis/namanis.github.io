package encapsulamento.graphicshape.polimorfismo.sobrescrever.hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestCircle {
public static void main(String []args) {
Set<Circle> circleList = new HashSet<Circle>();
circleList.add(new Circle(10, 20, 5));
System.out.println(circleList.contains(new Circle(10, 20, 5)));
}
}
