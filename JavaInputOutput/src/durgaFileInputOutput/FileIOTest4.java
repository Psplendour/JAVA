package durgaFileInputOutput;
import java.io.File;
import java.io.IOException;
//Code to create a file named with Demo.txt in already present "D:/xyz folder"
public class FileIOTest4 {
        public static void main(String[] args) throws IOException {
		File f = new File("D://xyz","Demo.txt");
		f.createNewFile();
		System.out.println(f.exists());
}
}
