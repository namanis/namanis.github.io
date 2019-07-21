import java.util.Random; // import nos conta onde encontrar o Random
public class ImportExample {
public static void main(String[] args) {
Random r = new Random(); 
System.out.println(r.nextInt(10));//imprime numero entre 0 e 9
}
}