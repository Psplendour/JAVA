package stringTokenizer;
//Example of nextToken(String delim) method of StringTokenizer class
import java.util.StringTokenizer;

public class StringTokenizer2 {

	public static void main(String[] args) {
		
		  StringTokenizer st = new StringTokenizer("my,name,is,khan");  
        
	      // printing next token 
		  while (st.hasMoreTokens()) 
			{  
	      System.out.println("Next token is : " + st.nextToken(",")); 
			}

	}

}
