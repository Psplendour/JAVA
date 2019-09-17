package Methods;
//Returning a Value from a Method
import java.util.Scanner;

public class Returnvalue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = scan.nextInt();
		System.out.println("Enter the Second value");
		int b = scan.nextInt();
		//Add(a,b); //only calling the Add method
		int sum=Add(a,b); //calling Add method and storing the return value to a variable sum
		System.out.println(sum*10);
		}
	 
	//Create a method Add which takes input and return int value to the main method and call it to the main method
	public static int Add(int a,int b)
	 {
		 int c;
		 c=a+b;
		 System.out.println(c);
		 return(c);
	 }
}
