package durgaFileInputOutput;
import java.io.*;
public class FileMergerPoc {
        public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("File3.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader("File1.txt"));
		String line = bf.readLine();
		while(line!=null)
		{
			pw.println(line);
			line = bf.readLine();
		}
		
		bf = new BufferedReader(new FileReader("File2.txt"));
		line = bf.readLine();
		while(line!=null)
		{
			pw.println(line);
			line = bf.readLine();
		}
		 pw.flush();
		 bf.close();
		 pw.close();
}
}
