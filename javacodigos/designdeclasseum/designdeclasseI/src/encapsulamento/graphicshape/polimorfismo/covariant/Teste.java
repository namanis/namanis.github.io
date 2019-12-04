package encapsulamento.graphicshape.polimorfismo.covariant;



public class Teste {
	public static void main(String []args) {
		Circle c1 = new Circle(10, 20, 30);
		//Circle c2 = (Circle)c1.copy(); evitar downcast
		Circle c2 = c1.copy();
		}
		}

