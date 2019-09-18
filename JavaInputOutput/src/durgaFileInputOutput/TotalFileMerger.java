package durgaFileInputOutput;
import java.io.*;

public class TotalFileMerger {

	    public static void main(String[] args, boolean String) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		File f = new File("D://xyz//IOFile");
		String[] s= f.list();
		
		for(String s1:s)
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(f,s1)));
			String line = br.readLine();
			
			while(line!=null)
			{
			pw.println(line);
			line = br.readLine();
			}
		}
         //pw.flush();
	}

}
