package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HastSetadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		
		//Hashset will not display duplicate values 
		
		set.add("Deepthi");
		set.add("Deepthi");
		set.add("Raja");
		set.add("sunny");
		
		Iterator<String> li =  set.iterator();
		
		while (li.hasNext())
				
				 {
			
			System.out.println(li.next());
		}
		
		
	}

}
