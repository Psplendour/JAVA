package durgaFileInputOutput;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100);
		fw.write("urga\nSoftware Solutions");
		fw.write("\n");
		char[] ch1={'a','b','c'};
		fw.write(ch1);
		fw.write("\n");
		fw.flush();
		fw.close();
		}
}
 