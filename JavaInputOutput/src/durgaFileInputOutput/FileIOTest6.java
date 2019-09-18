package durgaFileInputOutput;
//To display the name of all the file and directory present in a Directory
import java.io.File;
public class FileIOTest6 {

	public static void main(String[] args) {
		File f = new File("D://xyz//B");
		String[] s = f.list();
		int count =0;
		
		for(String s1:s )
		{
			System.out.println(s1);
			count++;
		}
        System.out.println("The no of file and Directories "+count);
	}
}
