package AccessModifiers;
/*1. Setter and getter create the method (set and get method)
  2. In set method argument by default it give the variable name start with small letter
  3.To differentiate between member variable and local argument variable of a method "this" keyword is used.
  4.The variable name with this keyword shows that the member variable of the class
  5. The variable name without this keyword shows the local variable 
 */
public class ThisKeyWord {
	private int age;
	private String name;
	private double marks;
	private double salary;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
