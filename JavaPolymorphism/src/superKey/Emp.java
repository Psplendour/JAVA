package superKey;

public class Emp extends Person{
	 int salary1;
	 Emp(int id,String name,int salary) 
	 {
	
		super(id, name);//reusing parent constructor  
		salary1=salary;
		
	 }
 
	 void display()
	 {
		 System.out.println(id+" "+name+" "+salary1);
	 }  
}
