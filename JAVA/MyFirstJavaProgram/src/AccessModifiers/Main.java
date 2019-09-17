package AccessModifiers;
//Public, Private, Protected and this (Java Access Modifiers)

/*Access Levels
 Modifier    class    package  Subclass   world
 Private       Y         N        N        N
 no Modifier   Y         Y        N        N
 protected     Y         Y        Y        N
 public        Y         Y        Y        Y
 */
public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setName("Ram");
		
		System.out.println(stu.getName());
		
		}
}

