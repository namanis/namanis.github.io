import java.util.*;
public class ArrayMultidimensional{
public static void main(String [] args){
//int [] [] doisD = new int [3][2];
int [][] doisD={{1,2,},{4,5},{7,8}};
for (int i=0; i<doisD.length; i++){
for(int j=0; j< doisD[i].length; j++)
System.out.println(doisD[i][j] + "-");
System.out.println(" ");


}
}


/*for (int[] inner : doisD) {
for (int num : inner)
System.out.println(num + "..");// esses pontos representa a corrida dentro do array
//System.out.print(doisD[2][1] + "-- ");//esses traços  representa a corrida dentro do array
 
}
*/
//mude os numeros dentro do array pra você entender como funciona a dimensão e teste!
}
 }

