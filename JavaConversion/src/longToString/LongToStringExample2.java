package longToString;

public class LongToStringExample2 {

	public static void main(String[] args) {
		
		long i=9993939399L;  
		String s=Long.toString(i); //Converting the Long to String by Static method of Long Class 
		System.out.println(s);   
		
		
		String s1=String.valueOf(i); //Converting the Long to String by valueOF method of String class
		System.out.println(s1);

	}

}
