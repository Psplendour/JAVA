package superKey;
//super can be used to invoke parent class method
public class Dog2 extends Animal2 
{
	void eat()
	{
		System.out.println("eating bread...");
	}  
	void bark()
	{
		System.out.println("barking...");
	} 
	
	void work()
	{  
		super.eat();//Base class method eat call  
		bark(); //same class method bark call
	}  
}
