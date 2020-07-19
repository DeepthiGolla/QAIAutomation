package JavaBasics.Automation;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		for (int i=0;i<=10;i++)
			
		{
			int pt = n * i;
			System.out.println(pt);
			
			
		}
		
		
		
		

	}

}
