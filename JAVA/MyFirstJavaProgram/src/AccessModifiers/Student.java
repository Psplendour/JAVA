package AccessModifiers;
//Public, Private, Protected and this (Java Access Modifiers)
//When the member variable is declared private then they are not accessible to the main class
//So to access the private member variable from the other class we have to use getter and setter method
public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*The variable name with this keyword shows that the member variable of the class
	 The variable name without this keyword shows the local variable 
	 */
	}
