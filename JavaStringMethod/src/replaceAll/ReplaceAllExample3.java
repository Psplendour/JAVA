package replaceAll;

public class ReplaceAllExample3 {

	public static void main(String[] args) {
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("\\s","");  //String replaceString=s1.replaceAll(" ","");   We can also write like this
		System.out.println(replaceString);  

	}

}
