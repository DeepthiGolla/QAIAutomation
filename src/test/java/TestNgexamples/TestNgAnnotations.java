package TestNgexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestNgAnnotations {
	

  @BeforeSuite (alwaysRun=true)
	public void BS()
	
	{
		System.out.println("BeforeSuite");
		
	}
  @BeforeTest
  
  public void BT()
  
  {
	  System.out.println("BeforeTest");
	  
  }
  
  @BeforeClass
  public void BC() 
  
  {
	  System.out.println("BeforeClass");
	  
  }
  
  @BeforeMethod
  public void BM() 
  
  {
	  
	  System.out.println("BeforeMethod");
  }
  
  @Test
  public void Test() 
  
  {
	  System.out.println("Test");  
	  
  }
  @AfterMethod
  public void AM() 
  
  {
	  System.out.println("AfterMethod");
	  
  }
  
  @AfterClass
  public void AC() 
  
  {
	  System.out.println("AfterClass");
	  
  }
  
  @AfterTest
  public void AT() 
  
  {
	  System.out.println("AfterTest");
	  
  }
  @AfterSuite(alwaysRun=true)
  public void AS() 
  
  {
	  System.out.println("AfterSuite");
	  
  }
  
}
