package abstractClass;
//Abstract class having constructor, data member and methods
public class Honda1 extends Bike1 {
	void run()
	{
		System.out.println("running safely..");
	}  
}

//Child class which inherits Abstract class  
//Example of an abstract class that has abstract and non-abstract methods
//If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract