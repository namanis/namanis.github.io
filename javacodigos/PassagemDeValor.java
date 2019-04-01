public class PassagemDeValor{ 

public static void main(String[] args) {

int num= 4;
 newNumber(1);

String name = "Webby";
speak(name);

StringBuilder name1 = new StringBuilder();
speakS(name1);
System.out.println(name1);//StringBuilder
System.out.println(name); 
 System.out.println( num); // 4
}
public static void speak(String name) {
name = "Sparky";
System.out.println(name);
}
 public static void newNumber(int num) {

//num=8;
 System.out.println(num);

 }

public static void speakS(StringBuilder s) {
s.append("Chamando metodo pelo parametro");
}
}