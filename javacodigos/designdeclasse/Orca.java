 abstract class Whale {
 public abstract void dive() ;
 public static void main(String[] args) {
 Whale whale = new Orca();
 whale.dive();
 }
 }

public class Orca extends Whale {
 public void dive(int depth) { System.out.println("Orca diving"); }
 }
