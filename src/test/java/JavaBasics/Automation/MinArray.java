package JavaBasics.Automation;

import java.util.Arrays;

public class MinArray 
{
/*
 We are organizing a horse race with horses having distinct strengths. 
 The strength of the horses is represented by an array of integers. 
 In order to make the race competitive, your program should find out the pair of 
 horses with similar strengths:

For example: {3,67,9, 46, 55}

Output: 3,9
 */
	public static void main(String[] args)
	{
		int []a={3,67,9, 46, 55};
		
		//Arrays.sort(a);
		
		//for (int k = 0; k < a.length; k++) 
		
		//System.out.println(a[k]);
		
		for (int i = 0; i < a.length; i++) 
			
		{
			
			for (int j=0;j<a.length;j++)
			{
			
			   int diff = a[j]-a[i]; 
				if (i==j)
					
				{  
					 
					diff = a[i];
					System.out.println(diff);
					
					
					
					
		     	}
				
				
			}
			
	   }
		  
}
}