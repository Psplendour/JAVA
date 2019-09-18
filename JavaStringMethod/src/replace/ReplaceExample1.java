package replace;
//Java String replace(char old, char new) method example
public class ReplaceExample1 {

	public static void main(String[] args) {
		
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);  

	}

}
//The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.