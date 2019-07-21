import java.util.*;
public class AutoBoxing{
public static void main(String [] args){

List<Double> weights = new ArrayList<>();
 weights.add(50.5); // [50.5]
 weights.add(new Double(60)); // [50.5, 60.0]
// weights.remove(50.5); // [60.0]
 double first = weights.get(0); // 60.0


System.out.println( weights + " " + first);

List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.remove(0);
//numbers.remove(new Integer(1));
System.out.println(numbers);
}
}