package indexOf;
//The java string indexOf() method returns index of given character value or substring. If it is not found, it returns -1. The index counter starts from zero.
public class IndexOfExample2 {

	public static void main(String[] args) {
		String s1 = "This is indexOf method";         
        // Passing Substring    
        int index = s1.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index);
        
        
        String s2="What is your name?";
        int index1=s2.indexOf("xc");//It returns -1 if substring does not found 
        System.out.println(index1);

	}

}
