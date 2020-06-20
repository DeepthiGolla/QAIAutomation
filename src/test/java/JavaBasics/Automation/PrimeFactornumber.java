package JavaBasics.Automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import org.testng.Assert;

public class PrimeFactornumber {

	public static void main(String args[]){
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	      
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
	}
	
	
	/*public static List<Integer> factors (int number)
	    {
	        int n = number;
	        List<Integer> f = new ArrayList<Integer>();
	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                f.add(i);
	                
	            }
	        }
	        return f;
	    }
					
				
	/*public static List<Integer> primenumber (List<Integer> f)	
	
	{
		
		
		
		
		return f;
		
		
		
		
	}
				
		
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		
			 for (Integer integer : factors(20)) 
		            System.out.println(integer);
	   
	
		}*/
	

	
	
