package TestNgexamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;




public class TestClassSec 
{
	
	
@Test

public void TC1_Even()

{
	
	int n =100;
	System.out.print("even Numbers from 1 to "+n+" are:");
	
	for (int i=0;i<=n;i++)
	{
		if (i % 2 == 0) 
		
		{
			System.out.print(i + ", ");
				
	}
		Assert.assertNotNull(i);
		  Reporter.log("even numbers");	
		
		for (int j=0;j<=n;j++)
		{
			if (j % 2 == 1) 
			{
				System.out.print(j + ", ");
					
		}
		
			Assert.assertNotNull(j);
			Reporter.log("odd numbers");

		
	
	}
	}}
	
	
	@Test
	
	@Parameters({"a"}) 
	
	public void primeFactnum(int n)
	
	{
	
  for(int i = 2; i< n; i++) 
    {
       while(n%i == 0) 
       {
          System.out.println(i+" ");
          n = n/i;
       }
    }
    if(n >2) 
    {
       
   	Assert.assertNotNull(n);
	  Reporter.log("prime Fact numbers");
    }
	
	}
	
	



	
}

