package stringToBoolean;
//Java Convert String to boolean
public class StringToBooleanExample {

	public static void main(String[] args) {
		String s1 ="true";
		String s2 ="TRUE";
		String s3="True";
		String s4="OK";
		
		boolean b1=Boolean.parseBoolean(s1);
		boolean b2=Boolean.parseBoolean(s2);
		boolean b3=Boolean.parseBoolean(s3);
		boolean b4=Boolean.parseBoolean(s4);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("---------------------------------------------------");
		
		boolean b5 = Boolean.valueOf(s1);
		boolean b6 = Boolean.valueOf(s2);
		boolean b7 = Boolean.valueOf(s3);
		boolean b8 = Boolean.valueOf(s4);
		
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		

	}

}
