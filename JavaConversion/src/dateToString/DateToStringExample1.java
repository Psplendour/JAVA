package dateToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample1 {

	public static void main(String[] args) {
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String strDate = dateFormat.format(date);  
         System.out.println("Converted String: " + strDate); 
         
         //System.out.println(Calendar.getInstance().getTime());//Thu Aug 01 14:18:21 IST 2019
	}

}
//Not clear,Please clear it by doing the POC of Java Date 