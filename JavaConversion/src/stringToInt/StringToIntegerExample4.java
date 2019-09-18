package stringToInt;
//NumberFormatException Case
public class StringToIntegerExample4 {

	public static void main(String[] args) {
		
		String s="hello";  
		int i=Integer.parseInt(s);  
		System.out.println(i); 

	}

}
//If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException.