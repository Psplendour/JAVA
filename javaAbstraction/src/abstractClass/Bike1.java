package abstractClass;
//Abstract class having constructor, data member and methods
public abstract class Bike1 { //Abstract Class
	
	Bike1()//Constructor
	{
		System.out.println("bike is created");
	} 
	
	abstract  void run(); //Abstract Method 
	   
	void changeGear()//Concrete Method
	   {
		   System.out.println("gear changed");
	   } 
}

//Example of an abstract class that has abstract and non-abstract methods
//If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract