package durgaFileInputOutput;
//Code to create a Directory named with abc in current Working Directory
import java.io.File;
import java.io.IOException;
public class FileIOTest2 {
	    public static void main(String[] args) throws IOException {
		File f = new File("IOFile");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}
}
