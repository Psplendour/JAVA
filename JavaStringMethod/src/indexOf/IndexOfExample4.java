package indexOf;
//The java string indexOf() method returns index of given character value or substring. If it is not found, it returns -1. The index counter starts from zero.
//This method takes char and index as arguments and returns index of first character occured after the given fromIndex.
public class IndexOfExample4 {

	public static void main(String[] args) {
		String s1 = "This is indexOf method";         
        // Passing char and index from  
        int index = s1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+index);
         	
	}

}
