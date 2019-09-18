package getBytes;
//The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.
public class StringGetBytesExample {

	public static void main(String[] args) {
		String s1="ABCDEFG1";  
		byte[] barr=s1.getBytes();  
		
		for(int i=0;i<barr.length;i++)
		{  
		System.out.println(barr[i]);  
		}  

	}

}
