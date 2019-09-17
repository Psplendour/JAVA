package recursion;
//Recursion in java
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Give a positive integer value");
	
    int input=scan.nextInt();
	System.out.println(factorial(input));
		}
	
	public static int factorial(int a)
	{
		if (a<=1)
		{
		return 1;
		}
		else 
		{
			return (a*factorial(a-1));
		}
	}

}
//5!=5*4*3*2*1
//N!=N *(N-1)*(N-2)...... *2*1
//jAVA allow the method to call itself
//Calling a method by itself called recursion