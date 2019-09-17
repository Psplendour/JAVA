package StaticKey;
//'static' keyword Example in Java
public class Student {
	//Variable declaration
	String name;
	int age;
	//static member declaration
    public static int noOfStudent=0;
    //constructor 
    Student()
    {
    	noOfStudent++;
    }
    // static method declaration 
    public static int getNoOfStudent()
    {
    	return (noOfStudent);
    }
    //setter and getter of variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	}
