package Inheritance;
//Inheritance in Java
//MyClass-->main Class 
//A base class is a class from which other classes are derived in an object-oriented programming language.
//A derived class is a class  derived from another existing class i.e base class.
//Polygon-->base class or super class
//Rectangle & Triangle--> Derived class or child class 
public class MyClass1 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		//rec.set_value(10, 20);   //-->In MyClass2 we are getting the input from user so no need of set_value method of Polygon class 
		Triangle tri = new  Triangle();
		//tri.set_value(10, 20);   //-->In MyClass2 we are getting the input from user so no need of set_value method of Polygon class 
		
		System.out.println("The area of the rectangle is "+rec.area());
		System.out.println("The area of the rectangle is "+tri.area());

	}

}
