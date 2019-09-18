package durgaFileInputOutput;
//Code to create a file named with abc.txt in current Working Directory
import java.io.*;
public class FileIOTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}

