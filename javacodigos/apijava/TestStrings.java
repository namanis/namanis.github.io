public class TestStrings {
public void roar(String roar1, StringBuilder roar2) {
roar1.concat("!!!");
roar2.append("!!!");
}
public static void main(String[] args) {
String roar1 = "roar";
StringBuilder roar2 = new StringBuilder("roar");
new TestStrings().roar(roar1, roar2);

System.out.println(roar1);
System.out.println();

/////////////////////////////////////////////////////////////////////////

String letters = "abcdef";
System.out.println(letters.length());
System.out.println(letters.charAt(3));
//System.out.println(letters.charAt(6));
System.out.println();

////////////////////////////////////////////////////////////////////////

String numbers = "012345678";
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
System.out.println();

////////////////////////////////////////////////////////////////////////////

String s = "purr";
System.out.println(s.toUpperCase() );
System.out.println( s.trim() );
System.out.println(s.substring(1, 3) );
System.out.println();

///////////////////////////////////////////////////////////////////////////////

 s += " two";
 System.out.println(s.length()  + " " + s);
 System.out.println();

//////////////////////////////////////////////////////////////

 String a = "";
 a += 2;
 a += 'c';
 a += false;  
 if ( a == "2cfalse")
  System.out.println("==");
System.out.println();
 if ( a.equals("2cfalse")) 
 System.out.println("equals");
 System.out.println();

//////////////////////////////////////////////////////////////////

 int total = 0;
 StringBuilder letters1 = new StringBuilder("abcdefg");
 total += letters1.substring(1, 2).length();
 total += letters1.substring(6, 6).length();
 total += letters1.substring(5, 5).length();
 System.out.println(total);
 System.out.println();

////////////////////////////////////////////////////////////////////

StringBuilder numbers1 = new StringBuilder("0123456789");
numbers1.delete(2, 8);
numbers1.append("-").insert(2, "+");
System.out.println(numbers1);
System.out.println();

///////////////////////////////////////////////////////////////////////////////

StringBuilder b = new StringBuilder("rumble");
b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
System.out.println(b);
System.out.println();

////////////////////////////////////////////////////////////////////////////////////

 StringBuilder puzzle = new StringBuilder("Java");
 puzzle.reverse();
 System.out.println(puzzle);
System.out.println();

} }