package ClassAndObject;
//Object and Class Example: main within the class
public class StudentExample {
	 //defining fields  
	 int id;//field or data member or instance variable  
	 String name; 
	
	 public static void main(String[] args) {
		 //Creating an object or instance  
		  StudentExample s1=new StudentExample();//creating an object of Student 
		  
		  //Printing values of the object  
		  System.out.println(s1.id);//accessing member through reference variable  
		  System.out.println(s1.name);  
	}

}
