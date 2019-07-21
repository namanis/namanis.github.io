public class Order2 {
 String value = "t";
 { value += "a"; }
 { value += "c"; }
 public Order2() {
 value += "b";
 }
 public Order2(String s) {
 value += s;
 }
 public static void main(String[] args) {
 Order2 order2 = new Order2("f");
 order2 = new Order2();
 System.out.println(order2.value);
 } }