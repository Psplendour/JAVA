package getChars;
//The java string getChars() method copies the content of this string into specified char array.
//public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
public class StringGetCharsExample2 {

	public static void main(String[] args) {
		
		String str = new String("Welcome to Javatpoint");  
        char[] ch  = new char[20];  
        try 
        {  
            str.getChars(1, 26, ch, 0);  
            System.out.println(ch);  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  

}

//java.lang.StringIndexOutOfBoundsException: String index out of range: 26
