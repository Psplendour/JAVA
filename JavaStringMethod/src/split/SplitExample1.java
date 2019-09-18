package split;

public class SplitExample1 {

	public static void main(String[] args) {
		String s1 ="Hello,How are you thesedays?";
		String[] word=s1.split(" ");//splits the string based on whitespace  
		//String[] words=s1.split("\\s"); "\\s" is used for whiteSpace
		 for(String str:word)//using java foreach loop to print elements of string array  
		 {
		System.out.println(str);
		 }

	}

}
