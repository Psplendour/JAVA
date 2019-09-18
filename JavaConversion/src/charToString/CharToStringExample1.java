package charToString;

public class CharToStringExample1 {

	public static void main(String[] args) {
		
		char c='S';  
		String s=String.valueOf(c);    //Convert char to String by valueOf method of String class 
		System.out.println("String is: "+s);
		
		String s1=Character.toString(c);  //Convert char to String by toString  method of Character class 
		System.out.println("String is: "+s1); 

	}

}
