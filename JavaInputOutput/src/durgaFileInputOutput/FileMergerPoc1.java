package durgaFileInputOutput;
import java.io.*;
public class FileMergerPoc1 {
        public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("File4.txt");
		BufferedReader bf1 = new BufferedReader(new FileReader("File1.txt"));
		BufferedReader bf2 = new BufferedReader(new FileReader("File2.txt"));
		String line1 = bf1.readLine();
		String line2 = bf2.readLine();
		while(line1!=null || line1!=null )
		{
			if(line1!=null)
			{
			pw.println(line1);
			line1 = bf1.readLine();
			}
			if(line2!=null)
			{
			pw.println(line2);
			line2 = bf2.readLine();
			}
		}
		 pw.flush();
		 bf1.close();
		 bf2.close();
		 pw.close();
}
}

//D:\WorkSpace_New\JavaFileInputOutput\IOFile