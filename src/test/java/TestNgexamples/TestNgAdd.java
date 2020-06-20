package TestNgexamples;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class TestNgAdd {
	
	//@Parameters({"a","b","sum"})
	@Test()
	
	public void Add1()
	{
		Calculator cal=new Calculator();
		
		
		int a[]= {10,20,30,40,50,60};
		int b[] = {10,20,30,40,50,60};
		
		
		for (int i=0;i<=a.length;i++)
		{
			for (int j=0;j<i;j++)
			{
				int s=a[0];
				int s2=b[0];
			int[] sum1 =new int[5];
			for (int k=0;k<j;k++)
			{
					sum1[k] = cal.Add(s, s2);
				//	int expected[]= {20,40,60,80,100,120};
			        // Assert.assertEquals(expected[], sum1[k]);
					System.out.println(sum1);
					//System.out.println(expected);
					
					//i=0,j=0,k=0, sum1=20
					//
					
			}
	}
			

			
		}
		
		
	}
	   
	    //arrays , array list , passing values from notepad or excel 
	    //dependsonMethods 
	    //Testng data providers 
	    //chronological 
	    //Assert.assertEquals(sum1, sum);	
		
	
   
@Test()
	
	public void Sub()
	{
		Calculator cal=new Calculator();
	    int sum1 = cal.Sub(20, 10);
	  
	    Assert.assertEquals(sum1, 10);
		
		
	}
@Test()

public void Div()
{
	Calculator cal=new Calculator();
    int sum1 = cal.Div(5, 5);
  
    Assert.assertEquals(sum1, 1);
	
	
}
@Test()

public void Multi()
{
	Calculator cal=new Calculator();
    int sum1 = cal.Multi(10, 20);
 
    Assert.assertEquals(sum1, 200);
	
	
}
	
}
