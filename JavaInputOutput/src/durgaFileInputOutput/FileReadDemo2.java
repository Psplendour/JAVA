package durgaFileInputOutput;
import java.io.*;
public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("ABC.txt");
		FileReader fr1 = new FileReader(f);
		char[] ch=new char[(int) f.length()];//Initialize the array
		fr1.read(ch);
		for(char c1:ch) 
		{
			System.out.print(c1);
		}
		fr1.close();
		}
	}
//durga
//Software Solutions
//abc