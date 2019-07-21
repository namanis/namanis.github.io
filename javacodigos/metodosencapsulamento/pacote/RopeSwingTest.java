import rope.*;
import static rope.Roppe.*;
public class RopeSwingTest {
private static Roppe rope1 = new Roppe();
private static Roppe rope2 = new Roppe();
{
System.out.println(rope1.length);
}
public static void main(String[] args) {
rope1.length = 2;
rope2.length = 8;
System.out.println(rope1.length);
}
}
