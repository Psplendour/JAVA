package thisPoc;
// this: to refer current class instance variable
public class Student1 {
	int rollno;  
	String name;  
	float fee;  
	
	Student1(int rollno,String name,float fee)
	{
    //rollno=rollno;   The assignment to variable rollno has no effect(Warning)
	//name=name;       The assignment to variable rollno has no effect(Warning)
	//fee=fee;         The assignment to variable rollno has no effect(Warning)
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	} 
}
/*1.parameters (formal arguments) and instance variables are same. So,
we are using this keyword to distinguish local variable and instance variable.

2.The this keyword can be used to refer current class instance variable.
If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
*/



