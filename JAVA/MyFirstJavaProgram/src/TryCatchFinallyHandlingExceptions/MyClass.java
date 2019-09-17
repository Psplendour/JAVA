package TryCatchFinallyHandlingExceptions;
//java Finally block (try-catch-finally Exception Handling in Java )
public class MyClass {

	public static void main(String[] args) {
		try{
			//int a=100;
			int a=100/0;
		   }
		catch (Exception e)
		{
			System.out.println("Catch Called");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Called");
		}
		}
     }
//the finally block always execute when the try block exit
//This ensure that finally block is executed even if  an unexcepted error occurs;;
//It is a good practice to use finally with try catch block