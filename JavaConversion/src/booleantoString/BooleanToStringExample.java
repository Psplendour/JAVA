package booleantoString;
//Java Convert boolean to String
public class BooleanToStringExample {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 =false;
		
		//Boolean.toString()
		String s1 = Boolean.toString(b1);
		String s2 = Boolean.toString(b2);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------------------------------------------");
		
		//String.valueOf()
		String s3 = String.valueOf(b1);
		String s4 = String.valueOf(b2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
