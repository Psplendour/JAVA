package encapsulation;
//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
public class Student {
	private String name; //private data member

	public String getName() //getter method for name
	{
		return name;
	}

	public void setName(String name) //setter method for name 
	{
		this.name = name;
	}
}
