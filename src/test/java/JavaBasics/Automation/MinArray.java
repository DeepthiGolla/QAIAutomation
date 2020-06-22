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
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) 
		{
		   System.out.println(a[i]);
		   
		 }
		   
		   System.out.println(a[0]+ "," +a[1]);
     }

}