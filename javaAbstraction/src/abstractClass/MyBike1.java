package abstractClass;
//Abstract class having constructor, data member and methods
public class MyBike1 {

	public static void main(String[] args) {
		  Bike1 obj = new Honda1();  
		  obj.run();  
		  obj.changeGear();

	}

}
//Example of an abstract class that has abstract and non-abstract methods
//If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract