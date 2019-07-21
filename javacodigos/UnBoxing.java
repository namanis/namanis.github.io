import java.util.ArrayList; 
import java.util.List; 
   
public class Unboxing { 
   
    public static void main(String[] args) { 
        Integer in = new Integer(-8); 
   
        // 1. Unboxing through method invocation 
        int absVal = absoluteValue( in ); 
        System.out.println( "absolute value of " + in + " = " + absVal ); 
   
        List<Double> doubleList = new ArrayList<Double>(); 
    // It is autoboxed through method invocation. 
        doubleList.add(3.1416);     
   
        // 2. Unboxing through assignment 
        double phi = doubleList.get(0); 
        System.out.println( "phi = " + phi ); 
    } 
   
    public static int absoluteValue( int i ) { 
        return (i < 0) ? -i : i; 
    } 
}