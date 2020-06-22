package JavaBasics.Automation;

import java.util.ArrayList;
import java.util.List;


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
	
public  void primefact(List<Integer> prime)
	{ //Factors array of 20: 2, 4, 5, 10, 20 
	/*List<Integer> p = new ArrayList<Integer>();
		//size() functional will be used to know the length of array list 
            */
			for (int i=0;i<prime.size();i++)
			{
				
				int num = prime.get(i);
				
				int j,m=0,flag=0;      
				  
				  m=num/2;      
				  if(num==0||num==1)
				  {  
				  // System.out.println(num+" is not prime number");      
				  }
				  else
				  {  
				   for(j=2;j<=m;j++)
				   {      
				    if(num%j==0)
				    {      
				    // System.out.println(num+" is not prime number");      
				     flag=1;      
				     break;      
				    }      
				   }      
				   if(flag==0)  { System.out.println(num+" is prime number"); }  
				  }//end of else  
				}  
				
			}
		
public static void main(String[] args) {
		
	  Primefactnowitharray obj = new Primefactnowitharray();
		List<Integer> prime = new ArrayList<Integer>();
		 prime = obj.factors(20);
		 obj.primefact(prime);

	}
}
