package javasampleprgs;

import java.util.Scanner;

public class PhoneKeyPad {

	
	//Phonekeypad program to enter string and convert to a sequence of keypad digits in phone 
	//ABC(2) DEF(3) GHI(4) JKL(5) MNO(6) PQRS(7) TUV(8) WXYZ(9)
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s;
		char c;
		
		s= sc.nextLine().toLowerCase();
		
		System.out.println ("enter name :" +s);

		for (int i= 0;i<s.length();i++)
		{
			
			c=s.charAt(i);
			//System.out.println("Char " + i + " is " + s.charAt(i));
			
			switch (c)
			{
			case 'a' :
				
		    System.out.print(2);

		      break;
		
			case 'b' :
				
				System.out.print(2);

				break;
				
			case 'c' :
				
				System.out.print(2);

				break;
				
              case 'd' :
				
				System.out.print(3);

				break;
				
				
case 'e' :
	
	System.out.print(3);

	break;
	
case 'f' :
	
	System.out.print(3);

	break;
	
case 'g' :
	
	System.out.print(4);

	break;
	
case 'h' :
	
	System.out.print(4);

	break;
	
case 'i' :
	
	System.out.print(4);

	break;
	
case 'j' :
	
	System.out.print(5);

	break;
case 'k' :
	
	System.out.print(5);

	break;
case 'l' :
	
	System.out.print(5);

	break;
case 'm' :
	
	System.out.print(6);

	break;
case 'n' :
	
	System.out.print(6);

	break;
case 'o' :
	
	System.out.print(6);

	break;
	
case 'p' :
	
	System.out.print(7);

	break;
	
case 'q' :
	
	System.out.print(7);

	break;
case 'r' :
	
	System.out.print(7);

	break;
case 's' :
	
	System.out.print(7);

	break;
case 't' :
	
	System.out.print(8);

	break;
case 'u' :
	
	System.out.print(8);

	break;
case 'v' :
	
	System.out.print(8);

	break;
case 'w' :
	
	System.out.print(9);

	break;
case 'x' :
	
	System.out.print(9);

	break;
case 'y' :
	
	System.out.print(9);

	break;
case 'z' :
	
	System.out.print(9);

	break;
		
		default:
			System.out.println("Invalid char");
			
				
					
			}		
		}	
				
	}

}
