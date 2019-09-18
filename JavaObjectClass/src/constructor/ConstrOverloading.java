package constructor;

public class ConstrOverloading {
	    int id;  
	    String name;  
	    int age; 
	   
	    ConstrOverloading(int i,String n) //creating two arg constructor  
	    {
	    	    id = i;  
	    	    name = n;
	    }
	    
	    ConstrOverloading(int i,String n,int a) //creating three arg constructor  
	    {
	    	    id = i;  
	    	    name = n;
	    	    age=a;
	    }
	    
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+age);
	    	
	    } 
	    
}
