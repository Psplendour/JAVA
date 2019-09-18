package javaComparableInterface;

public class Student1  implements Comparable<Student1>{
	
	int rollno;  
	String name;  
	int age;  
	
	Student1(int rollno,String name,int age)//Constructor Declaration
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	    public int compareTo(Student1 st)   //Implementing the compareTo Method to make the Student Object Comparable which follow the Default natural sorting order
	    {                                   //This method is called by JVM Internally
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;

	}

}
