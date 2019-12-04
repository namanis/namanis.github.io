package encapsulamento.graphicshape.polimorfismo.covariant;



class Circle extends Shape {
	// other methods elided
	public Circle(int x, int y, int radius) { /* initialize fields here */ }
	//public Shape copy() // Covariante
	public Circle copy() // Covariante 
	{
		return null;
		/* return a copy of this object */ }
	}