package javaCollectons;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("Ram");
		s.add("Mohan");
		s.add("Tom");
		s.add("Sohan");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
