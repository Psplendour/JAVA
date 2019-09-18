package staticPoc;

public class StaticMethodMain {

	public static void main(String[] args) {
		StaticMethod.change();//calling change method ,no need to create the object of the class to invoke the static method 
		StaticMethod s1 = new StaticMethod(1,"Ram");
		StaticMethod s2 = new StaticMethod(2,"Shayam");
		StaticMethod s3 = new StaticMethod(3,"Mukesh");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it
