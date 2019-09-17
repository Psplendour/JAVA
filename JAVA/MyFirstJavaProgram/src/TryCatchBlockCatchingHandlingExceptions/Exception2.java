package TryCatchBlockCatchingHandlingExceptions;
//Catching and Handling Exceptions in Java using Try Catch Blocks
public class Exception2 {

	public static void main(String[] args) {
		int b[]= new int[3];
		try{
			//int a =100/0;
			System.out.println("Value of the b is "+b[4]);
		}
		
		catch (Exception e)
		{
			System.out.println("Error is :"+e);
		}

	}

}
//Risky code within the try block and corresponding handling code inside the catch block
//It has one try block and multiple catch block
//Exception class catch all the exception provided by java