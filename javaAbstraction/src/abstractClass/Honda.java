package abstractClass;
//Example of Abstract class that has an abstract method
public class Honda extends Bike {
	void run()
	{
		System.out.println("running safely");
	}  
	
	public static void main(String[] args) {
		 Bike obj = new Honda();  
		 obj.run();  
    }
}

// If there is an abstract method in a class, that class must be abstract.