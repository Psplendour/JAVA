package interface_poc;
//Java Interfaces
public class MyClass {

	public static void main(String[] args) {
	 Shape c =new Circle();
	 Shape r =new Rectangle();
	 
	 c.draw();
	 r.draw();

	}

}

//class extends class
//interface extends interface
//class implements interface

//Just like abstract ,interface also cannot be initiated
//By default ,method and member function of the interface class are abstarct by nature.
//class can be extended but interfaces can only be implemented
//Interface fields are public, static and final by default, and the methods are public and abstract.