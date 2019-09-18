package thisPoc;
//this() : to invoke current class constructor
public class Student4 {
	
	Student4()
	{
		System.out.println("Hello Student4");
	}
	
	Student4(int id)
	{
		this();//invoke current class constructor
		System.out.println(id);
	}
}
