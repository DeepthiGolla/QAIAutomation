package Collections;

import java.util.ArrayList;

public class ArraylistLoop extends Arraylistadd {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub

		ArrayList all = new ArrayList<String>();
		
		all.add(0,"Deep");
	    all.add(1,"Suri");
		all.add(2,"Sree");
		all.add(3,"Sunny");
		//all.add(4,"Rajji");
	
		System.out.println(all);
		
		//Using forloop to iterate and display the list and also here used size method to know the size of list 
		
		int list = all.size();
		
		System.out.println(list);
		
		for (int i=0;i<list;i++)
		
		{
			System.out.println(all.get(i));
			
		}
		
	}

}
