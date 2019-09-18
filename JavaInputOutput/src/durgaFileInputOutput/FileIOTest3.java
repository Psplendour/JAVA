package durgaFileInputOutput;
//Code to create a Directory named with abc in current Working Directory and create a file named with abc.txt in that directory.
import java.io.File;
import java.io.IOException;
public class FileIOTest3 {
public static void main(String[] args) throws IOException {
		File f = new File("IOFile");
		f.mkdir();//If directory IOFile not present the it will create that.
		
		File f1 = new File("IOFile","abc.txt");
		//File f1 = new File(f,"abc.txt");
		f1.createNewFile();//If file not present there then it will create that
		System.out.println(f1.exists());
		}
}
