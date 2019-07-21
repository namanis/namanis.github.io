 public class DoSomething {
public void go() {
 System.out.print("A");
 try {
 stop();
 } catch (ArithmeticException e) {
 System.out.print("B");
 } finally {
 System.out.print("C");
 }
 System.out.print("D");
 }
 public static void stop() {
 System.out.print("E");
//Object x = null;
 Object x = "M";
 x.toString();
 System.out.print("F");
 }
 public static void main(String[] args) {
 
 
  new DoSomething().go();
 
 }
 }