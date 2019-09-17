package WriteAndRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyRead {
    public static void main(String[] args) {
    	BufferedReader br =null;
    	try 
	       {
			FileReader	file = new FileReader("FileName.txt");
		    br = new BufferedReader(file);
			String line;
			
			while((line = br.readLine()) !=null)
			{
				System.out.println(line);
			}
		   } 
	       catch (Exception e) 
	       {
	    	   System.out.println(e);
		   } 
	       finally  
	       {
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   }
		
	}

}
