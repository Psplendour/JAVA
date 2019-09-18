package staticPoc;
//Example of static variable
public class StaticVariable 
{
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable     

        StaticVariable(int r, String n)//constructor  
          {  
            rollno = r;  
            name = n;  
          }
        void display ()
        {
        	System.out.println("Roll no : "+rollno+" Name: "+name+" CollegeName: "+college);
        	
        }
        
}  
