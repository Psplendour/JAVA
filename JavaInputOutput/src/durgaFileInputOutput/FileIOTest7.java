package durgaFileInputOutput;
//To display the name of only the files present in a Directory
import java.io.File;
public class FileIOTest7 {

	public static void main(String[] args) {
		File f = new File("D://xyz//B");
		String[] s = f.list();
		int count =0;
		
		for(String s1:s )
		{
			File f1=new File(f,s1);
			//if (f1.isDirectory())//check is it a Directory
			if (f1.isFile())//Check is it a file 
			{
			System.out.println(s1);
			count++;
			}
		}
        System.out.println("The no of file and Directories "+count);
	}

}
