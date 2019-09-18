package stringToDate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {

	    public static void main(String[] args) throws Exception {
		String sDate1="31/12/1998";
		
		 SimpleDateFormat formatter1= new SimpleDateFormat("dd/MM/yyyy");
		 Date date1= formatter1.parse(sDate1);
		 System.out.println(sDate1+"\t"+date1);  

	}

}
