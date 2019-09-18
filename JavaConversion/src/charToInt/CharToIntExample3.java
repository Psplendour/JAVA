package charToInt;

public class CharToIntExample3 {

	public static void main(String[] args) {
		char c='1';  
		int a=Integer.parseInt(String.valueOf(c));
		System.out.println(a);
		
		int b = Character.valueOf(c);
		System.out.println(b);
		
	}

}
