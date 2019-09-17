package Methods;
//Parameter passing
public class ParameterPassingMethod {

	public static void main(String[] args) 
	{
		sayHello("Ram");
		sayHello("Shayam");
		sayHello("Sunil");
		
	    Add(12,30);
	}
	
	//Create a method sayHello and call it to the main method
	 public static void sayHello(String name)
     {
    	 System.out.println("Hello"+name); 
     }
	//Create a method sayHello and called  by main method
	 public static void Add(int a,int b)
	 {
		 System.out.println(a+b);
	 }
	 
}
