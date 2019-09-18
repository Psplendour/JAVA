package durgaFileInputOutput;
import java.io.File;
import java.io.IOException;
//Code to create a file named with Demo.txt in  "D:/xyz/A folder"
public class FileIOTest5 {
        public static void main(String[] args) throws IOException {
		File f = new File("D://xyz/A");
		f.mkdir();
		File f1 = new File(f,"Demo.txt");
		f1.createNewFile();
}
}
