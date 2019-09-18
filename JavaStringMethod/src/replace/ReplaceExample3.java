package replace;

public class ReplaceExample3 {

	public static void main(String[] args) {
		   String str = "oooooo-hhhh-oooooo";  
	        String rs = str.replace("h","s"); // Replace 'h' with 's'  
	        System.out.println(rs);  
	        rs = rs.replace("s","h"); // Replace 's' with 'h'  
	        System.out.println(rs); 

	}

}

//The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.