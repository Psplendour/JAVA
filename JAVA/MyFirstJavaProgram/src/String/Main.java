package String;
//Java String

/*
 1. length()-->To find the length of the string
 2. toUpperCase()
 3. toLowerCase()
 4.replace(arg0, arg1)
 5. indexOf('k') -->If char not present then returns -1
 */
public class Main {

	public static void main(String[] args) {
		String myString="India Will surely win the WorldCup 2019.";
		
		int stringLength =myString.length();
		System.out.println(stringLength);
		
		System.out.println(myString.toUpperCase());
		
		System.out.println(myString.toLowerCase());
		
		System.out.println(myString.replace('e', 'A'));
		
		System.out.println(myString.indexOf('k'));
		}

}
