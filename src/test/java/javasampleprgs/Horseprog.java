package javasampleprgs;

public class Horseprog {
	
	
	/*Write a program to find out the prime factors(Factors which are prime numbers) of a given number?

For Example:
 
Number: 20
Factors: 2,4,5,10
Prime factors: 2, 5

We are organizing a horse race with horses having distinct strengths. The strength of the horses is represented by an array of integers. In order to make the race competitive, your program should find out the pair of horses with similar strengths:

For example: {3,67,9, 46, 55}

Output: 3,9

*/


	public static void main(String[] args) {
		
	//	int[] strenghts = {3,9,19, 46, 5};
		
		int[] strenghts = {11,10,60,89,1,2,3,7};
		
			int len= strenghts.length;
			System.out.println(len);
			
			//sorting logic 
			
			//	Arrays.sort(strenghts);
			
			for(int i=0; i<strenghts.length; i++)
			
			{
				for(int j=0; j<strenghts.length-i-1; j++)
				
				{
					if(strenghts[j]>strenghts[j+1])  //here we are comparing 2nd value with 1st value and if 
						//first value is more than second then swap 
					
					{
						int temp=strenghts[j];
						strenghts[j]=strenghts[j+1];
						strenghts[j+1]=temp;
						
					}	
					
				}
			}
			
			
			
			//3, 5, 19, 46, 67
			
			//6,7,10,11,60,80
			
			int min=strenghts[1]-strenghts[0];
			int flag=0;
			
			for(int i=0; i<strenghts.length; i++) {
				for(int j=i+1; j<strenghts.length-1; j++) {
					int diff=strenghts[j]-strenghts[i];
					if(diff<min) {
						min=diff;
						diff=min;
						flag=1;
						System.out.println(strenghts[i] +" "+ strenghts[j]);
					}
				}
			}
			
			if(flag == 0) {
				System.out.println(strenghts[0] +" "+ strenghts[1]);
			}
		}
	
	

	}


