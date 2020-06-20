package JavaBasics.Automation;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.Assert;

import TestNgexamples.Calculator;

public class Additionprog {
	
	
	public static int[] add(int[] a1, int[] b1)
	{
		int[] sum = new int[6];
		for (int i=0;i<=5;i++)
		{
			sum[i]=a1[i]+b1[i];
		}
		
		return sum;
		
	}
	
	
	public void factor()
	
	{
		Scanner number = new Scanner(System.in);
		System. out. println("enter an integer");
		int abc = number. nextInt();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Additionprog ad = new Additionprog();

      		int [] a= {10,20,30,40,50,60};
			int[] b = {10,20,30,40,50,60};
			
			int[] sum= add(a, b);
			System.out.println("first array" + Arrays.toString(a));
			System.out.println("second array" + Arrays.toString(b));
			System.out.println("sum of 2 array's" + Arrays.toString(sum));
			
			
			int[] expected= {20, 40, 60, 80, 100, 120};
			Assert.assertEquals(expected, sum);
			System.out.println("Compare actual and expected" + Arrays.toString(expected));
		
			
			
			
			
	}
}
