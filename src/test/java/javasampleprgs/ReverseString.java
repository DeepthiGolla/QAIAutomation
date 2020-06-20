package javasampleprgs;

import java.util.Scanner;

//Reverse string, prompt for a string and print the reverse of the string 

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s, rev = "";
		
		Scanner sc = new Scanner( System.in);
		
		
		
		s= sc.next();
		
		//System.out.println("Enter a String:");
		
		System.out.println(	"Enter a string:" +s);
		sc.nextLine();
		
		int Strlen;
		
		Strlen = s.length();
		System.out.println(	Strlen);
		
		for (int i=Strlen-1; i>=0;i--)
		{
			 rev = rev + s.charAt(i);
			
		}
			System.out.print( "Reverrse of the string " +s + "is: " +rev);
			
			
		
		
		sc.close();
		
		

	}

}
