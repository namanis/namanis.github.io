import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int mes;
        //criacao da variavel mes
        
        System.out.println("Digite o mês em número inteiro");
       mes = entrada.nextInt();
        //entrada de dados
        
        switch(mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
           case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            default:
                System.out.println("Digite SOMENTE números entre 1 e 6");
                break;
        }
    }
}