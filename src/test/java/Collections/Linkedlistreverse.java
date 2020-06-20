package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Linkedlistreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList <String> Ll = new LinkedList<String>();
		
		Ll.add("S1");
		Ll.add("S2");
		Ll.add("S3");
		
		Ll.addFirst("Students");
		Ll.addLast("total");
		//List will be displayed as whole 
		System.out.println(Ll);
		
		
		//Each element of the list in reverse order 
		
	Iterator Ltr =  (Iterator) Ll.descendingIterator();
		
	while (Ltr.hasNext()) 
		
		//hasNext() returns boolean value 
	{
		
		System.out.println(Ltr.next());
		
	}
	System.out.println(Ll);
	
	}
		
	}


