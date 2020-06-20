package javasampleprgs;

import java.util.Scanner;

public class KeyboardScanner 
{

	//Scanner program to enter int, double , string and sum of them
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  int a ;
  double b;
  String  s;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Integer:");
  a=sc.nextInt();
  
  System.out.println("Enter an Integer:" +a);
		  
  
  System.out.println("Enter Double");
  
  b=sc.nextDouble();
  System.out.println("Enter a floating point number:" +b);
  	
  System.out.println("Enter your name:");
  
  s=sc.nextLine();
  s=sc.next();
  
  System.out.println(" Your name is : "+s);
  
 double d;
  
  d = a + b;
  
  System.out.println(d);
  
  System.out.println("Hi! " +s + ", the sum of "  + a + " and "  +b + " is "  +d); 
  
	sc.close();	
		
		
		
	}

}
