package GettingUserInput;
//Getting User Input using Javas
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// To publish output on screen we use System.out
		//To get input on screen we use System.in
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int user_input_number=scan.nextInt();
		System.out.println("The number is"+" "+user_input_number);
		
		System.out.println("Enter the Decimal number ");
		double user_input_DecimalNumber=scan.nextDouble();
		System.out.println("The Decimal Number is"+" "+user_input_DecimalNumber);
		
		scan.nextLine();/*If any input is taken above rather than string then 
		                   we have to add this line first time to get input from Console*/
		System.out.println("Enter the String1");
		String user_input_String=scan.nextLine();
		System.out.println("The String1 is"+" "+user_input_String);
		
	
		System.out.println("Enter the String2 ");
		String user_input_String1=scan.nextLine();
		System.out.println("The String2 is"+" "+user_input_String1);
		}

}
