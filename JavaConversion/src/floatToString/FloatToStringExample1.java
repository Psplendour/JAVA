package floatToString;

public class FloatToStringExample1 {

	public static void main(String[] args) {
		
		float f=12.3F;//F is the suffix for float  
		String s=String.valueOf(f); //Converting the Float to String by valueOf method of String class  
		System.out.println(s);  
		
		String s1=Float.toString(f); //Converting the Float to String by Static method of Float Class 
		System.out.println(s1);

	}

}
