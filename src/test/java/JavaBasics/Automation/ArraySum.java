package JavaBasics.Automation;

public class ArraySum 
{

	public static void main(String[] args) 
	
/*Write a program, which takes two parameters

First Parameter is the array of integers and the second parameter is the integer called as Sum

Your program should find out all the unique pairs in the array whose sum is equal to the second parameter

For example: 
First Parameter: {3,5,8, 2, 9, 6} 
Second Parameter: 11 */
	
	{
		int[] a = {3,5,8, 2, 9, 6};
      	int b = 11;
		for (int i=0;i<a.length;i++)
			
		{
			for (int j=i+1;j<a.length;j++)
				
			{
				int first = a[i];
				int second =a[j];
				if ((first + second) == b) 
						
				    { 
				System.out.println(first+", "+second);
				    }
             }
		
		
		}
		
	}
	
}



