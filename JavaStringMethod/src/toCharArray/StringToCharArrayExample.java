package toCharArray;

public class StringToCharArrayExample {

	public static void main(String[] args) {
		String S1 = "Hello";
		char[] ch = S1.toCharArray();
		
		for(int i=0;i<ch.length;i++ )
		{
			System.out.println(ch[i]);
		}

	}

}
