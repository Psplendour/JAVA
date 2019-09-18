package doubleToString;

public class DoubleToStringExample {

	public static void main(String[] args) {
		
		double d=12.3;  
		String s=String.valueOf(d);  //Converting the Double to String by valueOf method of String class
		System.out.println(s);
		
		String s1=Double.toString(d);  //Converting the Double to String by Static method of Double Class  
		System.out.println(s1); 

	}

}
