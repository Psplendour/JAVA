package charAt;
//accessing all the elements present at odd index or even place
public class CharAtExample4 {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint portal";
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("Char at "+i+" Position is  "+str.charAt(i));
			}
		}
	}

}
