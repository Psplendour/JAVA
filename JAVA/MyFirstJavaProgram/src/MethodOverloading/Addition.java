package MethodOverloading;
//Method Overloading in Java
public class Addition {
	//Method 1-->Method Add type integer,taking integer as input
    public static int Add (int a,int b)
	{
		return (a+b);
	}
  //Method 2-->Method Add type double,taking double as  input
	public static double Add (double a,double b)
	{
		return (a+b);
	}
	//Method 3-->Method Add type String,taking String as  input
	public static String Add (String a,String b)
	{
		return (a+b);
	}
	
	//Constructor
	Addition()
	{
		System.out.println("Hi this is construction called");
	}
}
