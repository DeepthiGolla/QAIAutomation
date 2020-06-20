package Collections;

import java.util.LinkedList;
import java.io.*;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedlistAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//LinkedList is better for manipulating data.

		LinkedList <String> Ll = new LinkedList<String>();
		
		Ll.add("S1");
		Ll.add("S2");
		Ll.add("S3");
		
		Ll.addFirst("Students");
		Ll.addLast("total");
		//List will be displayed as whole 
		System.out.println(Ll);
		
		
		//Each element of the list will display one by one 
	ListIterator Ltr =  Ll.listIterator();
		
	while (Ltr.hasNext()) 
		
		//hasNext() returns boolean value 
	{
		
		System.out.println(Ltr.next());
		
	}
		
	}
	
	//remove (index), removeAll(), removeLast(), removeFirst() methods to remove element of the list but it wont shuffle to make it in order thats why 
	//retriving in linkedlist  is bit fast than array list 

}
