package thisPoc;

public class Student3 {
	void display1()
	{
		System.out.println("invoke current class method");
	}
	void display2()
	{
		System.out.println("--------------------------------");
		this.display1();//invoke current class method
	}
}
//Note: If we don't mention this keyword while calling the current method compiler automatically add this keyword.