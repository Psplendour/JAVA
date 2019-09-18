package charAt;
//Java String charAt() method example
public class CharAtExample {

	public static void main(String[] args) {
		String name="javatpoint"; 
		char ch = name.charAt(2);
		//char ch=name.charAt(10);//returns the char value at the 10th index 
		//It is getting error  java.lang.StringIndexOutOfBoundsException
		System.out.println(ch);
     }

}
