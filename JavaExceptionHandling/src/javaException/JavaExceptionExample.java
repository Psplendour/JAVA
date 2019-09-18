package javaException;

import java.io.IOException;

public class JavaExceptionExample {

	public static void main(String[] args) {
		 try{  
		   int data=100/0;  //code that may raise exception 
		   }
		 catch(ArithmeticException p)
		   {
			 System.out.println(p);
		   }  
		      
		  // System.out.println("rest of the code...");  //rest code of the program  NullPointerException ArithmeticException
    }
  
}
