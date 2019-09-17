package TryCatchBlockCatchingHandlingExceptions;
//Catching and Handling Exceptions in Java using Try Catch Blocks
public class Exception1 {

	public static void main(String[] args) {
		int b[]= new int[3];
			try{
				int a =100/0;
				System.out.println("Value of the b is "+b[4]);
			}
			catch (ArithmeticException e)
			{
				//System.out.println(e.toString());
				//System.out.println(e.getMessage());
				System.out.println(e);
			}
			
			catch (ArrayIndexOutOfBoundsException e)
			{
				//System.out.println(e.toString());
				//System.out.println(e.getMessage());
				System.out.println(e);
			}
		}
}
//Risky code within the try block and corresponding handling code inside the catch block
//It has one try block and multiple catch block
//Exception class catch all the exception provided by java
//ArithmeticException and ArrayIndexOutOfBoundsException class are some specific class it can handle  Arithematic and Array exception