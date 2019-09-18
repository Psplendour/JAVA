package ClassAndObject;
//Object and Class Example: Initialization through reference
public class StudentInitReferenceMain {

	public static void main(String[] args) {
		StudentIntiReference s1 = new StudentIntiReference();
		StudentIntiReference s2 = new StudentIntiReference();
		
		s1.id=1;
		s1.name="Ram";
		s2.id=2;
		s2.name="Shayam";
		
		System.out.println("Id is: "+s1.id +" and Name is: "+s1.name);
		System.out.println("Id is: "+s2.id +" and Name is: "+s2.name);
		}

}
