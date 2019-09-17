package Class;
//Classes and Objects in Java
public class main {

	public static void main(String[] args) {
		Student std = new Student();//std-->object or Instance
		std.id=1;
		std.name="Ram";
		std.age=25;
		System.out.println(std.name+"'s ID is "+std.id+" and age is "+std.age);
		
		Student std1 = new Student();//std1-->object or Instance
		std1.id=2;
		std1.name="Shyam";
		std1.age=29;
		System.out.println(std1.name+"'s ID is "+std1.id+" and age is "+std1.age);
		}

}
