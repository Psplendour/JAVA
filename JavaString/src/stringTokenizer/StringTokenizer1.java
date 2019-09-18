package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is khan"," "); 
		      
		while (st.hasMoreTokens()) 
		{  
	         System.out.println(st.nextToken());  
	    }

}
}
//StringTokenizer class that tokenizes a string "my name is khan" on the basis of whitespace.