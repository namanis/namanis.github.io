public class RopeSwing {
private static final String leftRope;
 private static final String rightRope;
 private static final String bench;
 private static final String name ;

 static {
 leftRope = "left";
 rightRope = "right";
 }
 static {
 name = "name";
  bench = "bench";
 //rightRope = "right";
 }
 public static void main(String[] args) {
RopeSwing rp= new RopeSwing();
RopeSwing rp1= new RopeSwing();
RopeSwing rp2= new RopeSwing();
RopeSwing rp3= new RopeSwing();
System.out.println(rp.rightRope);
System.out.println(rp1.leftRope);
System.out.println(rp2.name);
System.out.println(rp3.bench);
 }
 }