package ClassAndObject;
import java.util.Scanner;
//Object and Class Example: Initialization through method
public class StudentInitMethodMain {

	public static void main(String[] args) {
		 int Rollno;  
		 String Name; 
		 
		 Scanner scan=new Scanner(System.in);
		 
		 StudentInitMethod s1=new StudentInitMethod();
		 System.out.println("Enter the roll no  of first student");
		 Rollno=scan.nextInt();
		 System.out.println("Enter the Name of first student");
		 Name = scan.next();
		 s1.insertRecord(Rollno,Name);
		 s1.displayInformation();
		 
		 StudentInitMethod s2=new StudentInitMethod();
		 System.out.println("Enter the roll no of Second student");
		 Rollno=scan.nextInt();
		 System.out.println("Enter the Name of Second student");
		 Name = scan.next();
		 s2.insertRecord(Rollno,Name);
		 s2.displayInformation();
		 }
}
