 import java.util.function.*;
/*interface Climb {
 boolean isTooHigh(int height, int limit);
 } 
*/

 public class Climber{ 
 	
 public static void main(String[] args) {

Climber c1 = new Climber();
c1=6;
check(c1, l -> l.isTooHigh(4), 5);

//check(climb, h -> h.isTooHigh(2),5);
/*climb.isTooHigh();
check(climb);*/
 
 }
 boolean isTooHigh(int height, int limit);
 private static void check(Climber climb, Predicate<Climber> pred) {
 if pred.test(isTooHigh( height , 10)) 
 System.out.println("too high");
 else 
 System.out.println("ok");
 }
 }

 /*caller((e) -> { String f = ""; return "Poof"; }); 

  public class Panda {
 int age;
 public static void main(String[] args) {
 Panda p1 = new Panda();
 p1.age = 6;
 check(p1, p -> p.age < 5);

 }
 private static void check(Panda panda, Predicate<Panda> pred) {
 String result = pred.test(panda) ? "match" : "not match"; 
 System.out.print(result);
 } }
*/