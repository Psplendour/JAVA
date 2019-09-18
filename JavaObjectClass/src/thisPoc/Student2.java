package thisPoc;
//Program where this keyword is not required
public class Student2 {
	int rollno;  
	String name;  
	float fee;  
	
	Student2(int r,String n,float f)
	{  
	rollno=r;  
	name=n;  
	fee=f;  
    }
	
	void display()//Method declartaion
	{
		System.out.println(rollno+" "+name+" "+fee);
		
	}
}

/*If local variables(formal arguments) and instance variables are different,
there is no need to use this keyword like in the following program:*/
