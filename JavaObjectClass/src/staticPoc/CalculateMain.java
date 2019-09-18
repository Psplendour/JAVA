package staticPoc;
//Another example of a static method that performs a normal calculation
import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the cube");
		int length =scan.nextInt();
		
		int result = Calculate.cube(length);
		System.out.println("The vol of the Cube : "+result);

	}

}
