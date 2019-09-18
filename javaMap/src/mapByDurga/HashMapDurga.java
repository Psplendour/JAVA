package mapByDurga;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDurga {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Chiranjeve",700);  //Add Entry (Key-Value)to HashMap
		m.put("Balaish",800);     //Add Entry (Key-Value)to HashMap
		m.put("Venketesh",200);   //Add Entry (Key-Value)to HashMap
		m.put("Nagarjun",500);    //Add Entry (Key-Value)to HashMap
		
		System.out.println(m); // {Venketesh=200, Chiranjeve=700, Nagarjun=500, Balaish=800}
		
		System.out.println(m.put("Chiranjeve", 1000)); //put Method return 700 old value object when we insert the duplicate key value
		
		Set<String> s = m.keySet(); //to get all the key from the Map
		System.out.println(s);
		
		Collection<Integer> c= m.values();//to get all the values of the Map
		System.out.println(c);
		
		Set s1= m.entrySet();//to get all the entry of the map
		System.out.println(s1);
		
		Iterator itr =s1.iterator();
		while(itr.hasNext())
		{
		Map.Entry m1 =(Map.Entry) itr.next();
		System.out.println(m1.getKey()+"............"+m1.getValue());
		if(m1.getKey().equals("Nagarjun"))
		{
		  m1.setValue(100000);
		}
		}
		
		System.out.println(m);
		}

}
