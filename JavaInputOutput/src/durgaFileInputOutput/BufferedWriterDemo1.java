package durgaFileInputOutput;
import java.io.*;
public class BufferedWriterDemo1 
        {
        public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("def.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1={'a','b','c'};
		bw.write(ch1);
		bw.newLine();
		bw.write("Durga");
		bw.newLine();
		bw.write("Software Solution");
		bw.flush();
		bw.close();
		}
}
 