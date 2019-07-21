public abstract class Whale {
 public void dive(){
 	System.out.println(" Whale is Diving") ;}
 public static void main(String[] args) {
 Whale whale = new Orca();
 whale.dive();
 }
 }

class Orca extends Whale {
 public void dive(int depth) { System.out.println("Orca diving"); }
 }
