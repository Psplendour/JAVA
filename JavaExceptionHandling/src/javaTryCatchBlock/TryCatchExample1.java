package javaTryCatchBlock;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int data=50/0; //may throw exception   
        System.out.println("rest of the code");

	}

}

//Arise the  the problem if we don't use a try-catch block.

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at javaTryCatchBlock.TryCatchExample1.main(TryCatchExample1.java:7)
*/