package constructor;
//Example of parameterized constructor
public class ParConstructor {
	int id;  
    String name;  
	ParConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

}
