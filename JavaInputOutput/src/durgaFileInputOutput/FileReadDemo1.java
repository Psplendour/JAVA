package durgaFileInputOutput;
import java.io.*;
public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("ABC.txt");
		int i=fr.read();
        while(i!=-1)
        {
        	//System.out.print(i);//1001171141039710831111021161199711410132831111081171161051111101151097989910
        	System.out.print((char)i);
        	i=fr.read();
        }
        fr.close();
	}

}
//durga
//Software Solutions
//abc