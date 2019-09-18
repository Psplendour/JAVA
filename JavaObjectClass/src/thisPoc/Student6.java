package thisPoc;

public class Student6 {
	int rollno;  
	String name,course;  
	float fee;  
	
	Student6(int rollno,String name,String course)//Parametrised constructor 1
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}  
	
	Student6(int rollno,String name,String course,float fee)//Parametrised constructor 2
	{ 
	//Call to this() must be the first statement in constructor.
	this(rollno,name,course);//reusing constructor  
	this.fee=fee;  
	} 
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fee);
		
	}  
}
//Call to this() must be the first statement in constructor.
//The this() constructor call should be used to reuse the constructor from the constructor.