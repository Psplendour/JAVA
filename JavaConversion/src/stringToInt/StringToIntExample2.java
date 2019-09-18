package stringToInt;
//Understanding String Concatenation Operator
public class StringToIntExample2 {

	public static void main(String[] args) {
		String s1 = "200";
		int i = Integer.parseInt(s1);
		
		System.out.println(s1+100);//200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(i+100);//300, because 200+100, here + is a binary plus operator  

	}

}
