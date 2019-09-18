package staticPoc;

public class StaticMethod {
	
	int rollno;  
    String name;  
    static String college = "ITS";  
    
    static void change() //static method to change the value of static variable  
    {  
        college = "BBDIT";  
    } 

    StaticMethod(int r, String n)//constructor to initialize the variable  
    {  
        rollno = r;  
        name = n;  
    } 
    
    void display()
    {
    	System.out.println("Roll No : "+rollno+" Name:  "+name+" College: "+college);
    	
    }  
}
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it
