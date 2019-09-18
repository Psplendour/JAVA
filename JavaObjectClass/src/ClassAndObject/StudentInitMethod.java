package ClassAndObject;
//Object and Class Example: Initialization through method
public class StudentInitMethod {
	 int rollno;  
	 String name; 
	 
	 void insertRecord(int r, String n)//First method which insert the vale
	 {  
	  this.rollno=r;  
	  this.name=n;  
	 }  
	 
	 void displayInformation()//Second method which display the value
	 {
		 System.out.println("The Roll no of the student: "+rollno+" and his Name: "+name);
	 }  
	
}  


