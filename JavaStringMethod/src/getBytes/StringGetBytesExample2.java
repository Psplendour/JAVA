package getBytes;
//The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.
public class StringGetBytesExample2 {

	public static void main(String[] args) {
		 String s1 = "ABCDEFG";  
	        byte[] barr = s1.getBytes();  
	        for(int i=0;i<barr.length;i++){  
	            System.out.println(barr[i]);  
	        }  
	       
	        String s2 = new String(barr);   // Getting string back   
	        System.out.println(s2);  
	}

}
