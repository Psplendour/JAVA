package charAt;
// counting frequency of a character in the string
public class CharAtExample5 {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint portal";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
			{
				count++;
			}
		}
      System.out.println("Frequency of t is: "+count);
	}

}
