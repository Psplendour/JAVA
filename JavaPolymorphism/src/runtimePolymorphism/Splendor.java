package runtimePolymorphism;
//Example of Java Runtime Polymorphism
public class Splendor extends Bike {
	void run()
	{
		System.out.println("running safely with 60km");
	}  
	public static void main(String[] args)
	{
		Bike B1 = new Splendor();
		B1.run();//upcasting  
	}
}
//upcasting:- Referece of variable of Parent Class -->Object of Child class
//If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
