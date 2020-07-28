package devStableex;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DevstableTestclass 

{
	 WebDriver driver;
	PageObjModel2 pom1 ;

	
	@BeforeClass
	public void setup() throws InterruptedException, IOException

	   {
		
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//chromedriver84");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
	    driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pom1 = new PageObjModel2(driver);

	   }
	
	
	@Test
	public void TC1_launchtestpage()
	{
	  String url= pom1.launchtestpage();
	  Assert.assertNotNull(url);
	  Reporter.log("Dev stable page is launched successfully");
	  
	 }
	
	@Test(dependsOnMethods= {"TC1_launchtestpage"}) 
	public void TC2_selectactiivty()
	{
	   boolean a= pom1.selectactivity();
	   Assert.assertFalse(a);
	   Reporter.log("JobSheet Activity selected successfully");		
	}
	@Test(dependsOnMethods= {"TC2_selectactiivty"}) 
	public void TC3_launchtake()
	{
		String url= pom1.launchtake();
		Assert.assertNotNull(url);
		Reporter.log("Take launched successfully");
		  	
	}
	
	@Test(dependsOnMethods= {"TC3_launchtake"}) 
	public void TC4_switchframe()
	{
		pom1.switchframe();
		Reporter.log("Successfully switched to frame");
		  	
	}
	
	@Test(dependsOnMethods= {"TC4_switchframe"}) 
	public void TC5_entername()
	{
		String nam=pom1.entername();
        //Assert.assertEquals(actual,expected);
		Assert.assertEquals("sanvi",nam);
		Reporter.log("Name entered as sanvi");
		  	
	}
	
	@Test(dependsOnMethods= {"TC5_entername"})
	public void TC6_enterstation()
	{
			String nam=pom1.enterstation();
	     
			Assert.assertEquals("Hyderabad",nam);
			Reporter.log("Station is Hyderabad");
			  	
	}
	@Test(dependsOnMethods= {"TC6_enterstation"})
	public void TC7_enterdate()
	{
			String nam=pom1.enterdate();
			Assert.assertNotNull(nam);
			//Assert.assertEquals("08/26/2020",nam);
			Reporter.log("date entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC7_enterdate"})
	public void TC8_enteryear()
	{
			String nam=pom1.enteryear();
	       
			Assert.assertEquals("2020",nam);
			Reporter.log("year entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC8_enteryear"})
	public void TC9_entermake()
	{
			String nam=pom1.entermake();
	      
			Assert.assertEquals("new make",nam);
			Reporter.log("new make entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC9_entermake"})
	public void TC10_entermodel()
	{
			String nam=pom1.entermodel();
	        
			Assert.assertEquals("model 2020",nam);
			Reporter.log("model 2020 entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC10_entermodel"})
	public void TC11_entermileage()
	{
			String nam=pom1.entermileage();
	      
			Assert.assertEquals("1234",nam);
			Reporter.log("1234 entered ");
			  	
	}
	
	@Test(dependsOnMethods= {"TC11_entermileage"})
	public void TC12_entervin()
	{
			String nam=pom1.entervin();
	   
			Assert.assertEquals("vin22",nam);
			Reporter.log("vin22 entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC12_entervin"})
	public void TC13_enterengine()
	{
			String nam=pom1.enterengine();
	    
			Assert.assertEquals("engine 2020",nam);
			Reporter.log("engine 2020 entered");
			  	
	}
	@Test(dependsOnMethods= {"TC13_enterengine"})
	public void TC14_enterengine2()
	{
			String nam=pom1.enterengine2();
	        
			Assert.assertEquals("engine 2020_2",nam);
			Reporter.log("engine 2 entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC14_enterengine2"})
	public void TC15_enterstation2()
	{
			String nam=pom1.enterstation2();
	      
			Assert.assertEquals("station2_2020",nam);
			Reporter.log("station2_2020 entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC15_enterstation2"})
	public void TC16_enterproblems()
	{
			String nam=pom1.enterproblems();
	       
			Assert.assertEquals("This is QA Test",nam);
			Reporter.log("This is QA Test entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC16_enterproblems"})
	public void TC17_enterproblems2()
	{
			String nam=pom1.enterproblems2();
	        
			Assert.assertEquals("This is testing program",nam);
			Reporter.log("This is testing program entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC16_enterproblems"})
	public void TC17_enterconclusions()
	{
			String nam=pom1.enterconclusions();
	   
			Assert.assertEquals("This is conclusion",nam);
			Reporter.log("This is conclusion entered");
			  	
	}
	@Test(dependsOnMethods= {"TC17_enterconclusions"})
	public void TC18_addFile() throws InterruptedException
	{
			String nam=pom1.addFile();
	   
			Assert.assertEquals(nam,"USAmap.png");
			Reporter.log("USAmap.png file is entered");
			  	
	}
	
	@Test(dependsOnMethods= {"TC18_addFile"})
	public void TC19_submitAct()
	{
			boolean nam=pom1.submitAct();
	   
			Assert.assertTrue(nam);
			Reporter.log("Submitted");
			  	
	}
	
	@Test(dependsOnMethods= {"TC19_submitAct"})
	public void TC20_completeFinal()
	{
			boolean status=pom1.completeFinal();
	   
			Assert.assertTrue(status);
			Reporter.log("Submitted activity for grading");
			  	
	}
	 
	 
	 @AfterClass()
	 public void tearDown()
	 {
		 
		driver.close();
     }
	 
}