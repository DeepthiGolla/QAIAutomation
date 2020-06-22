package JavaBasics.Automation;

import java.util.Scanner;

//Program to find given small case character is vowel or consonant 

public class VowelConsonant 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
	    char ch = sc.next().charAt(0);
	    //next(): It is used to get the next complete token from the scanner which is in use.
	    
		switch (ch) 
				 {
		            case 'a':
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		                System.out.println(ch + " is vowel");
		                break;
		            default:
		                System.out.println(ch + " is consonant");
		        }
		}
}

