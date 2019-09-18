package stringToInt;

public class StringToIntExample1 {

	public static void main(String[] args) {
		String s1 = "200";
		String s2 ="150";
		
		int a1=Integer.parseInt(s1);//Parsing String to Int
		int a2=Integer.parseInt(s2);//Parsing String to Int
		
		String s3 = String.valueOf(a1);//Parsing Int to String
		String s4 = String.valueOf(a2);//Parsing Int to String
		
		System.out.println(s1+s2);//200150
		System.out.println(a1+a2);//350
		System.out.println(s3+s4);//200150
		
	}

}
