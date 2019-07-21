abstract class Animal {
protected int age;
public void eat() { 
System.out.println("Animal is eating");
}
public abstract String getName();
}
public class Swan extends Animal {
	public static void main(String [] args){
		Swan swan =  new Swan();
		swan.eat();
		System.out.println(swan.getName());
}
	
public String getName() {
return "Swan";
}
} 
