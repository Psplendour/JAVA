package Class;
//Classes and Objects in Java
//Use of getter and setter
public class main1 {

	public static void main(String[] args) {

			Student std = new Student();//std-->object or Instance
			std.setId(1);
			std.setName("Ram");
			std.setAge(25);
			System.out.println(std.getName()+"'s ID is "+std.getId()+" and age is "+std.getAge());
			
			Student std1 = new Student();//std1-->object or Instance
			std1.setId(2);
			std1.setName("Shyam");
			std1.setAge(29);
			System.out.println(std1.getName()+"'s ID is "+std1.getId()+" and age is "+std1.getAge());

	}

}
