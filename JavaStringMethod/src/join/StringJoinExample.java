package join;
//The java string join() method returns a string joined with given delimiter. In string join method, delimiter is copied for each elements.
public class StringJoinExample {

	public static void main(String[] args) {
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		
		System.out.println("-----------------------------------------");
		
		String date =String.join("/", "25","04","2019");
		System.out.print(date);
		
		String time = String.join(":","  10","25","AM");
		System.out.println(time);
		
		System.out.println("-----------------------------------------");
		
		String time1 = String.join(":","10","","AM");//In case of null element, "null" is added. 
		System.out.println(time1);

	}

}
