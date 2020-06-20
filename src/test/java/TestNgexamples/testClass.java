package TestNgexamples;


import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testClass {
	
	WebDriver driver;
	pageObjModel pom ;
	 String b1;
	 String b2;
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException

	   {
		
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver80");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
	    driver = new ChromeDriver();
		//driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pom = new pageObjModel(driver);
		Thread.sleep(1000);
	   }
	
	@Test
	public void TC1_Basic()
	{
	  String url= pom.Basic();
	  Assert.assertNotNull(url);
	  Reporter.log("Basic url is launched successfully");
	  
	   }
	@Test(dependsOnMethods= {"TC1_Basic"}) 
	public void TC2_Green()
	{
		String gurl= pom.Green();
		  Assert.assertNotNull(gurl);
		  Reporter.log("Grid with greenbox url launched successfully");		
	}
	@Test(dependsOnMethods= {"TC2_Green"}) 
	public void TC3_Frame()
	{
		
	  String b1=  pom.Frame();
      Assert.assertNotNull(b1);
	   Reporter.log(b1+"box1 color is captured successfully");
		
	}
	@Test(dependsOnMethods= {"TC3_Frame"}) 
	public void TC4_Ftwo() throws InterruptedException
	{
		pom.Frametwo();
		Assert.assertEquals(b1, b2);
		Reporter.log("b1 and b2 box colors are matched" );
		
	}
	
	@Test(dependsOnMethods= {"TC4_Ftwo"}) 
	public void TC5_Comndpro()
	{
		String durl=pom.Compare();
		Assert.assertEquals("http://10.0.1.86/tatoc/basic/drag", durl);
		Reporter.log("Driver successfully navigated to drag and drop page");
	}
	@Test(dependsOnMethods= {"TC5_Comndpro"}) 
	public void TC6_dndd()
	{
		String Win=pom.Dnd();
		Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows", Win);
		Reporter.log("popup window page launched successfully");
	}
	@Test(dependsOnMethods= {"TC6_dndd"}) 
	public void TC7_Popwin()
	
	{
		String win=pom.Pop();
		Assert.assertNotNull(win);
		Reporter.log("Popup page launched successfully");
		
	}
	@Test(dependsOnMethods= {"TC7_Popwin"}) 
	public void TC8_Childpop() throws InterruptedException
	{
	   String curl= pom.Child();
	   String strname = null;
		Reporter.log(strname);
		Assert.assertNotNull(curl);
		Reporter.log("Launched back to window page from popup page successfully");
		
		
	}
	@Test(dependsOnMethods= {"TC8_Childpop"}) 
	public void TC9_Proceed()
	{
		
		String next=pom.Prowin();
	   	Assert.assertEquals("http://10.0.1.86/tatoc/basic/cookie", next);
	   	Reporter.log("Cookie page launched successfully");
	}
	
	@Test(dependsOnMethods= {"TC9_Proceed"}) 
	public void TC10_Cookie()
	{
		String exitbasic=pom.Cookie();
	    Assert.assertEquals("http://10.0.1.86/tatoc/end", exitbasic);
	   Reporter.log(exitbasic+"End! Obstacle Course is Complete!");
	}
	
	@Test(dependsOnMethods= {"TC10_Cookie"}) 
	
	public void TC11_Advance()
	{
		
		String aurl=pom.AdvC();
		Assert.assertEquals("http://10.0.1.86/tatoc/advanced/hover/menu", aurl);
		Reporter.log(" Menu page launched successfully");
		
	}
	
	
	 @Test(dependsOnMethods= {"TC11_Advance"}) 
	public void TC12_MenuItem() throws ClassNotFoundException, SQLException, InterruptedException
	{
		 
		String querygate=pom.Menu();
		Assert.assertNotNull(querygate);
		Reporter.log("SQL DB query gate page launched successfully");
	}
	 
	 @Test(dependsOnMethods= {"TC12_MenuItem"}) 
	public void TC13_Sqldb() throws ClassNotFoundException, SQLException, InterruptedException 
	{
	 String name= pom.DB();
		Reporter.log(name);
	  Reporter.log("Query from con1 is successful");
		
	}
	
	 @Test(dependsOnMethods= {"TC13_Sqldb"}) 
	public void TC14_Con1query() throws ClassNotFoundException, SQLException
	
	{
		
		pom.Cquery();
		Reporter.log("Query from con2 is successful");
	}
	 
	 @Test(dependsOnMethods= {"TC14_Con1query"}) 
	public void TC15_Con2query() throws SQLException, ClassNotFoundException
	{
		pom.Ctquery();
		//Assert.assertEquals("http://10.0.1.86/tatoc/advanced/video/player", video);
		Reporter.log("Query from con2 is successful");
		
		
		
	}
	 @Test(dependsOnMethods= {"TC15_Con2query"}) 
	 public void TC16_Videocon() throws ClassNotFoundException, SQLException
		
		{
			
			pom.Val();
			Reporter.log("Video player page launched");
		}
	 
	 @AfterClass()
	 public void tearDown()
	 {
		 
		 driver.close();
		 
		 
	 }
	 
	 
	 }

