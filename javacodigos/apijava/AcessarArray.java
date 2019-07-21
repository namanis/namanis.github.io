import java.util.*;
public class AcessarArray{
	
public static void main(String [] args){
	int [] numbers = new int[10];


/*	for (int i = 0; i < numbers.length; i++){
	numbers[i] = i+5;
	System.out.println(numbers[i]);*/

	//numbers[9] = 3;
numbers.length = 1;
for (int i = 0; i < numbers.length; i++){
	numbers[i] = i + 5;
System.out.println(numbers[i]);
}
}
}
