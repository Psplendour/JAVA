package concat;
//concatenating multiple string objects
public class ConcatExample2 {

	public static void main(String[] args) {
		    String str1 = "Hello";  
	        String str2 = "Javatpoint";  
	        String str3 = "Reader";  
	           
	        String str4 = str1.concat(str2); // Concatenating one string       
	        System.out.println(str4);  
	         
	        String str5 = str1.concat(str2).concat(str3); // Concatenating multiple strings   
	        System.out.println(str5);
	}

}
