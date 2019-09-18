package getChars;
//The java string getChars() method copies the content of this string into specified char array.
//public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
public class StringGetCharsExample {

	public static void main(String[] args) {
		 String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[10];  
	      try{  
	         str.getChars(6, 16, ch, 0);  //javatpoint
	         System.out.println(ch);  
	      }catch(Exception ex)
	      {
	    	  System.out.println(ex);
	      }

	}

}
