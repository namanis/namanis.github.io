public class Primitivo{
public void fly(int i) {
System.out.print("int ");
}
public void fly(long l) {
System.out.print("long ");
}
public static void main(String[] args) {
Primitivo p = new Primitivo();
p.fly(123);
p.fly(123L);
} }