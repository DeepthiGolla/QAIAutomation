package JavaBasics.Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Program to find factors and add them to array for given number 
//find prime number from Factors array 

public class Primefactnowitharray {


	public  List<Integer> factors(int number)
	
	{
		  List<Integer> f = new ArrayList<Integer>();
		   for (int i=2;i<=number;i++)
	      {
	         if((number%i == 0) )
	        	 
	         {
	        	 f.add(i);
	        	 System.out.println(i);
	         }
	     }
	 return f;
		
	}
	
/*public  void primefact(ArrayList<Integer> prime)
	{
	
	//Factors array of 20: 2, 4, 5, 10, 20 
		
		{
			 List<Integer> primearray = new ArrayList<Integer>();
		   
//primearray=prime;
//int n = primearray.length;

		    
		    //loop through the numbers one by one
		   // for(int i=0; i<primearray.length; i++){
		        boolean isPrime = true;

		        //check to see if the numbers are prime
		        for (int j=2; j<i; j++){

		            if(i%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        //print the number
		        if(isPrime)

		            System.out.println(i + " are the prime numbers in the array ");
		    }
		}
			 
	}*/
				
			 
	        
			  
	           
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Primefactnowitharray obj = new Primefactnowitharray();
		List<Integer> prime = new ArrayList<Integer>();
		 prime = obj.factors(20);
		 //obj.primefact();
		//system.print.outline("factors are" +prime);

		//obj.primefact(prime);
		

	}
}
