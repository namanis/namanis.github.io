package encapsulamento.graphicshape.polimorfismo.sobrescrever.hashcode;
import java.util.HashSet;
import java.util.Set;


public class Circle {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r) {
	xPos = x;
	yPos = y;
	radius = r;
	}
	public boolean equals(Object arg) {
	if(arg == null) return false;
	if(this == arg) return true;
	if(arg instanceof Circle) {
	Circle that = (Circle) arg;
	if( (this.xPos == that.xPos) && (this.yPos == that.yPos)
	&& (this.radius == that.radius )) {
	return true;
	}
	}
	return false;
	}
	public int hashCode() {
		// use bit-manipulation operators such as ^ to generate close to unique
		// hash codes here we are using the magic numbers 7, 11 and 53,
		// but you can use any numbers, preferably primes
		return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
		}
	}


