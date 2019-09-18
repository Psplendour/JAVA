package thisPoc;
//this: to refer current class instance variable
public class Student1Main {

	public static void main(String[] args) {
		Student1 s1 = new Student1(10,"Ram",120f);
		Student1 s2 = new Student1(20,"Shayam",130f);
		
		s1.display();
		s2.display();

	}

}
/*
The this keyword can be used to refer current class instance variable.
If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
*/