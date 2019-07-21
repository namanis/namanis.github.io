import java.util.Arrays;

public class SortArray{
public static void main(String [] args){
int[] numbers = { 6, 9, 1 };
Arrays.sort(numbers);
for (int i = 0; i < numbers.length; i++) 
 System.out.print (numbers[i] + " ");

String[] strings = { "10", "9", "100" };
Arrays.sort(strings);
for (String string : strings)
System.out.print(string + " ");
}
}