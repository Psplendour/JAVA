package StaticKey;
//'static' keyword in Java 
public class myClass {
//What does the static key word do in a class
	public static void main(String[] args) {
		// static member belong to the class instead of a specific instance.
		//static member or method  can be accessed directly by class name
		//Non Static member method only be accessed by the instance created 
		Hello hello = new Hello();
		Hello.doSomething("How r u?"); //here static method doSomething is called directly by class name
		
		Hello hello1 = new Hello();
		hello1.doSomethingElse("I am fine :)");//here nonStatic method doSomethingElse is created by instanced 
		
		Hello.age=15;//static member accessed by class(Working fine)
		hello.age=15;//static member accessed by instance but getting warning so best practice that call static by class  
		System.out.println(Hello.age);
		
		//Hello.id=15;//Non static accessed by class getting error
		hello.id=20;//Non static accessed by instance(Working fine) 
		System.out.println(hello.id);
	}

}
