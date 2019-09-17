package interface_poc;
//Java Interfaces
public class Rectangle implements Shape{
	 public void draw() //Interface fields are public, static and final by default, and the methods are public and abstract.
    {
		System.out.println("drawing rectangle");
	}

}

//class extends class
//interface extends interface
//class implements interface

//Just like abstract ,interface also cannot be initiated
//By default ,method and member function of the interface class are abstarct by nature.
//class can be extended but interfaces can only be implemented
//Interface fields are public, static and final by default, and the methods are public and abstract.