package thisPoc;
//Calling parameterized constructor from default constructor
public class Student5 {
	
	Student5(int id)//parameterised constructor
	{
		System.out.println(id);
	}
	
	Student5()//Default Constructor
	{
		this(5);//Calling parameterized constructor from default constructor
		System.out.println("Hello Student5");
	}
}



