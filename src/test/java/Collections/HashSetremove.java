package Collections;

import java.util.HashSet;

public class HashSetremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet<String>();
		
		set.add("d");
		set.add("s");
		
		System.out.println ("Initial set is "+set);
		
		set.remove("d");
		
		System.out.println (" set after remove is "+set);
		
		
		HashSet set1 = new HashSet <String> ();
		
		set1.add("sree");
		
		set1.add("sanu");
		
		//set1 values will be added to set but both will look as seperate sets see output
		// [s, [sanu, sree]]
		
		set.add(set1);
		
		System.out.println (" set after remove is "+set);
		
		set.removeAll(set1);
		
		System.out.println (" set after remove is "+set);
		
		
		set.clear();
		
		System.out.println (" set after remove is "+set);
		
		
	}

}
