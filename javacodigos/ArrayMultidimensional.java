public class ArrayMultidimensional{
public static void main(String [] args){

/*for (int i=0; i<doisD.length; i++){
for(int j=0; j< doisD[i].length; j++)
System.out.println(doisD[i][j] + " ");
System.out.println();
}*/

int [] [] doisD = {{2,3},{9,5,3},{10},{10,9,7,8,5,6,3,2,54}};

for (int[] inner : doisD) {
for (int num : inner)
System.out.print(num + " ");
System.out.println(doisD[3][8] + " ");
}


}
} 

