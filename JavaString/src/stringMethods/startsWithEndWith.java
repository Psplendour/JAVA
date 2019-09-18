package stringMethods;
//Java String startsWith() and endsWith() method
public class startsWithEndWith {

	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.startsWith("S"));//true
		System.out.println(s.startsWith("N"));//false
		
		System.out.println(s.endsWith("n"));//true
		System.out.println(s.endsWith("N"));//false
	}

}
