package charAt;
//accessing first and last character from the provided string
public class CharAtExample3 {

	public static void main(String[] args) {
		 String str = "Welcome to Javatpoint portal"; 
		 
		int strLength=str.length();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(strLength-1));
		//System.out.println(str.charAt(str.length()-1));
	}

}
