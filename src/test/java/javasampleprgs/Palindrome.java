package javasampleprgs;

import java.util.Scanner;

public class Palindrome {

	//palindrome program for given string
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
	
		String reverse="";
		Scanner sc = new Scanner(System.in);
		
		s= sc.nextLine();
		
		System.out.println("Enter name:" +s);
		
		int len = s.length();
		//3
		
		for (int i=len-1; i>=0; i--)
			
		{
			
			reverse =reverse+s.charAt(i);
			
		}
			if (s.equals(reverse))
				
		
				System.out.println("Palindrome" +s);
				else 
					System.out.println("Not Palindrome" +s);
				
				
				
			
			
			
		sc.close();
		
			
		}
	

	}



	