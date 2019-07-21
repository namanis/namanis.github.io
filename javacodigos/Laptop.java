public class Laptop {
public void start(){
 try {
 System.out.print("Starting up ");
 throw new Exception();
 } catch(Exception e) {
 System.out.print("Problem ");
 System.exit(0);
 } finally {
 System.out.print("Shutting down ");
 } 
 }
 public String exceptions() {
 String result = " ";
 String v = null;
 try {
 try {
 result += "before ";
 v.length();
 result += "after";
 } catch (NullPointerException e) {
 result += "catch ";
 throw new RuntimeException();
 } finally {
 result += "finally ";
 throw new Exception();
 }
 } catch (Exception e) {
 result += "done";
 }
 return result;
 }
 public static void main(String[] args) {
 ///new Laptop().start();
Laptop lpt1 = new Laptop();

System.out.println(lpt1.exceptions());

 Laptop lpt = new Laptop();
 lpt.start();
 
 } }
 