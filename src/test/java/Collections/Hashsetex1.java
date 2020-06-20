package Collections;

import java.util.HashSet;

public class Hashsetex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//purpose of this program is to know the difference between Removeall () and Clear()
		
		HashSet set1 =new HashSet<String>();
		
		set1.add("1");
		set1.add("2");
		set1.add("3");
		
		set1.add("4");
		
		System.out.println(set1);
		
		HashSet set2 = new HashSet<String>();
		
		set2.add("10");
		set2.add("11");
		set2.add("12");
		
		
		System.out.println(set2);
		
		set1.addAll(set2);
		
		System.out.println(set1);
		
		//removeall only removes all elements from set1 collection and only remove set2 elements from set1 collection 
		
		set1.removeAll(set2);
		
		System.out.println("set1 is" +set1);
		System.out.println("set2 is " +set2);
		
		//clear method clear all elements of the list/collection 
		
		set1.clear();
		
		System.out.println(set1);
		

		
//Question - why set2 displays in different order from insertion 
		
		//Answer: HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
		
	}

}
