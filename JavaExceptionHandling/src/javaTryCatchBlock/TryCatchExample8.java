package javaTryCatchBlock;

public class TryCatchExample8 {

	public static void main(String[] args) {
		 try  
	        {  
	        int data=50/0; //may throw exception   
	  
	        }  
	              
	        catch(ArrayIndexOutOfBoundsException e)  // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code"); 

	}

}

//In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
//It is getting error to handle the ArithmeticException using ArrayIndexOutOfBoundsException 