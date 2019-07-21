 interface CanHop {}
public class Frog implements CanHop {
public static void main(String[] args) {
TurtleFrog frog = new TurtleFrog();

System.out.println(" TurtleFrog");
}
}

 class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}
