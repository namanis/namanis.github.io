public class Rodent {

	public static void main(String[] args) {
Beaver rod = new Beaver();
	rod.chew2();
	}
protected static Integer chew()  {
System.out.println("Rodent is chewing");
return 1;
}
}
class Beaver extends Rodent {
public  Number chew2() {
System.out.println("Beaver is chewing on wood");
return 2;
}
}