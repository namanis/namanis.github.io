
public class Operacao2 {

public static void main(String [] args){
int x = 6;
boolean y = (x <= 6) || (++x <= 7);
System.out.println(x);

//Porque x>=6 é verdade, o operador increment no lado diretio d expressão nunca é avaliado.
}
}