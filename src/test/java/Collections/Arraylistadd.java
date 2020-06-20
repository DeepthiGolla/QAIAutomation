package Collections;

import java.util.ArrayList;

public class Arraylistadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		
		//command to add elements in a list 
		
		//ArrayList is better for storing and accessing data.
		
		al.add("Deepthi");
		al.add("Sree");
		al.add("super");
		
		System.out.println(al);
		
		al.add(0,"super");
		
		
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("one");
		al1.add("second");
		
		al1.add("three");
		
		System.out.println(al1);
		
		al1.addAll(al);
		
		
		System.out.println(al1);
		
		al1.remove(6);
		
		System.out.println(al1);
		
		//al1.removeAll(al1);
		
		
		
		
	}

}
