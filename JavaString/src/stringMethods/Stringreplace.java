package stringMethods;
//Java String replace() method
public class Stringreplace {

	public static void main(String[] args) {
		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s1.replace("J","K");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString); 
        }
    }
//The string replace() method replaces all occurrence of first sequence of character with second sequence of character.
