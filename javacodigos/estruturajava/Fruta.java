public class Fruta {
private String name = "Manga";
{ 
System.out.println("Escrevendo no campo");
}
public Fruta() {
name = "Pera";
System.out.println("Escrevendo no construtor");
}
public static void main(String[] args) {
Fruta  fruta = new Fruta();
System.out.println(fruta.name); } }