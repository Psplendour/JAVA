package ParentChild;

public class Programmer extends Employee{
	int bonus=10000;  
	public static void main(String[] args) {
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is: "+p.salary);  
		System.out.println("Bonus of Programmer is: "+p.bonus); 
		}
}
//Programmer is the subclass and Employee is the superclass.
//The relationship between the two classes is Programmer IS-A Employee
//It means that Programmer is a type of Employee.


/*Format of inheritance
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  
*/