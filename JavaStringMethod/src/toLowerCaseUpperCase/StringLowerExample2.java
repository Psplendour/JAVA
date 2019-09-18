package toLowerCaseUpperCase;

import java.util.Locale;

//This method allows us to pass locale too for the various langauges. Let's see an example below where we are getting string in english and turkish both.
public class StringLowerExample2 {

	public static void main(String[] args) {
		String s = "JAVATPOINT HELLO stRIng";    
        String eng = s.toLowerCase(Locale.ENGLISH);  
        System.out.println(eng);  
        
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot  
        System.out.println(turkish);
        
        
	}

}
