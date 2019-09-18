package encapsulation;
//A Java class to test the encapsulated class.
public class MyStudent {

	public static void main(String[] args) {
		
		Student s=new Student();  //creating instance of the encapsulated class
		
		s.setName("vijay");   //setting value in the name member  
		
		System.out.println(s.getName());  //getting value of the name member  
	}

}
