package mapByDurga;
//Demp Program For Customizing sorting order
import java.util.*;
public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap m=new TreeMap(new MyComparator());
		m.put("XXX",10);
		m.put("AAA",20);
		m.put("ZZZ",30);
		m.put("LLL",40);
        System.out.println(m);
        
	}

}
