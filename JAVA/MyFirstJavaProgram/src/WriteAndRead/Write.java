package WriteAndRead;
//Create a File and Write in it Using PrintWriter and File class

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) {
		
		   try {
				File file = new File("FileName.txt");
				if(!file.exists())
				{
					file.createNewFile();
				}
				PrintWriter pw = new PrintWriter(file);
				pw.println("This is my First Content");
				pw.println(1000000);
				pw.close();
				System.out.println("Done");
				} 
			
			
			   catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


