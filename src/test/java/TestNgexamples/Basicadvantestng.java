package TestNgexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Basicadvantestng {
	
	

	WebDriver driver;
	Genericvariables generic;
	Actions ac;
	
	WebElement frameone;
	String box1;
	String fourthwindow;
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	String symbolname;
	int id;
	Connection con1;
	Statement stmt1;
	ResultSet rs1;
	String query1;
	 String box2;
	/*Note: 
		driver.findElement(generic.getBasic()).click(); or driver.findElement(generic.getbasic).click();
	you can use function or you can use public by variable here by referring to class object 
	
	1. I have divided java class into @test methods for each operation
	2. Created new generic class, define public By variables and created methods , return those variable's 
	in test class's - we need to create object for a class and using object , needs to call those methods 
	so thats how when ever locaters has changed then we can edit directly there with out disturbing other code 
	
	Note: 
	
1. Convert Java Class (Main method) to TestNG test class , for that 2 class's - Badicadvantestng.java and Genericvariables.java 
2. We should break by methods and each method should not have more than 10 lines 
3. Element Locators should be defined as Variable , we need to use that variable in methods or class level 
4. I should use proper Assertions with both expected and actual value 
While defining Assertions , We can give actual, expected and user friendly message 
	*/
	 
@BeforeClass
public void setup() throws InterruptedException

   {
	generic = new Genericvariables();
	System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-extensions");
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.0.1.86/tatoc");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	
	}
	@Test
	 public void TC1_Basic() throws InterruptedException
    {
	
	driver.findElement(generic.getBasic()).click();
	String actual = driver.getTitle();
	Assert.assertEquals("Grid Gate - Basic Course - T.A.T.O.C", actual);	
	Reporter.log("Grid gate launched successfully");	
    }
	
	@Test(dependsOnMethods= {"TC1_Basic"}) 
    public void TC2_Green() throws InterruptedException
   {
		
        driver.findElement(generic.getGreenbox()).click();
       // Thread.sleep(10000);
        String S =driver.getTitle();
		Assert.assertEquals("Frame Dungeon - Basic Course - T.A.T.O.C", S);
		Reporter.log("Frame dungeon is loaded successfully");
		
	}
	
	@Test (dependsOnMethods= {"TC2_Green"}) 
	
	public void TC3_Frame() throws InterruptedException
	{
       //String secwindow = driver.getWindowHandle();
	   //System.out.println(secwindow);
		
	    frameone = driver.findElement(generic.getMain());
	  
	   driver.switchTo().frame(frameone);
	   //Thread.sleep(1000);
	   box1 = driver.findElement(generic.getBoxone()).getAttribute("class");
	   
	   Assert.assertNotNull(box1);
	   Reporter.log("box1 color is captured successfully");
	}
	@Test (dependsOnMethods= {"TC3_Frame"}) 
	public void TC4_Frametwo() throws InterruptedException
	{
	    do
        {
    	   driver.switchTo().defaultContent();
		driver.switchTo().frame(frameone);
		driver.findElement(generic.getReload()).click();
		Thread.sleep(1000);
		WebElement framechild = driver.findElement(generic.getChild());
		driver.switchTo().frame(framechild);
	    box2=driver.findElement(generic.getboxtwo()).getAttribute("class");
	    System.out.println(box2);
	    Thread.sleep(1000);
	   }
	    while (!box1.equals(box2));
	    //System.out.println("Box1 and Box 2 colors are matched");
        Reporter.log("box1 and box2 colors are matched");
	}
	@Test(dependsOnMethods= {"TC4_Frametwo"}) 
	public void TC5_Compare()
	{

       driver.switchTo().defaultContent();
       driver.switchTo().frame(frameone);
	   driver.findElement(generic.getNext()).click();	
	   String SS=driver.getCurrentUrl();
	   Assert.assertEquals("http://10.0.1.86/tatoc/basic/drag", SS);
	   Reporter.log("Driver successfully navigated to drag and drop page");
	
		
		}

	@Test(dependsOnMethods= {"TC5_Compare"}) 
	public void TC6_Dnd() throws InterruptedException
	{
		//Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement drag = driver.findElement(generic.getDrag());
		WebElement drop = driver.findElement(generic.getDrop());
		ac.dragAndDrop(drag, drop).build().perform();
		driver.findElement(generic.proceedPage()).click();
		String Win=driver.getCurrentUrl();
		Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows", Win);
		Reporter.log("popup window page launched successfully");
		
	}
	
	@Test(dependsOnMethods= {"TC6_Dnd"}) 
	
	public void TC7_Pop() throws InterruptedException
	
	{
		 ac=new Actions(driver);
		 fourthwindow = driver.getWindowHandle();
		//System.out.println(fourthwindow);
		driver.switchTo().window(fourthwindow);
		driver.findElement(generic.launchWin()).click();
		String popup = driver.getCurrentUrl();
		//Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows/popup",popup);
		Reporter.log(popup+"Popup page launched successfully");
		
	}
	@Test (dependsOnMethods= {"TC7_Pop"}) 
	public void TC8_Child()
	{// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();   // Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
		String childWindow=itr.next();    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		if(!fourthwindow.equals(childWindow))
		{
		driver.switchTo().window(childWindow);
		String Title=driver.getTitle();
		Reporter.log(Title);
		//System.out.println(driver.switchTo().window(childWindow).getTitle());
	    WebElement text =  driver.findElement(generic.getName());
	    ac.moveToElement(text).build().perform();
	    text.sendKeys("deepthitest");
	    String s = text.getText();
	    Assert.assertNotNull(s);
	    Reporter.log(s+" name entered successfully");
	   // System.out.println(s);
	    driver.findElement(generic.clkSubmit()).click();
	    
	    }
	    }
	}
	@Test(dependsOnMethods= {"TC8_Child"}) 
     public void TC9_Prowin()
     {
    	
	    driver.switchTo().window(fourthwindow);
	    String fourth=driver.getCurrentUrl();
	    Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows#", fourth);
	    Reporter.log("Switched back to 4th window successfully");
	   	driver.findElement(generic.clkNext()).click();
	   	String next=driver.getCurrentUrl();
	   	Assert.assertEquals("http://10.0.1.86/tatoc/basic/cookie", next);
	   	Reporter.log("Cookie page launched successfully");
	//	String fifthwindow = driver.getWindowHandle();
	//System.out.println(fifthwindow);

	}
	@Test(dependsOnMethods= {"TC9_Prowin"}) 
	public void TC10_Cookie() 
	
	{
		//Thread.sleep(1000);
     driver.findElement(generic.genToken()).click();
     String token =	driver.findElement(generic.genToken()).getText();
     Assert.assertNotNull(token);
     Reporter.log(token+" generated successfully");
     //System.out.println(token);
     String[] splited = token.split("\\s+");
     Cookie name = new Cookie("Token", splited[1]);
     driver.manage().addCookie(name);
     driver.findElement(generic.clkProceed()).click();

	}
	
	
  @Test(dependsOnMethods= {"TC10_Cookie"})  
	
	public void TC11_AdvC()
	
	{
		//String exitbasic=driver.getCurrentUrl();
		//Assert.assertEquals("http://10.0.1.86/tatoc/end", exitbasic);
		//Reporter.log(exitbasic+"End! Obstacle Course is Complete!");
		driver.findElement(generic.clkadvcourse()).click();
		
	}
	
	@Test (dependsOnMethods= {"TC11_AdvC"}) 
	
	public void TC12_Menu() throws InterruptedException
	
	{
		//Thread.sleep(1000);
		String adv=driver.getCurrentUrl();
		Assert.assertEquals("http://10.0.1.86/tatoc/advanced/hover/menu", adv);
		Reporter.log(" Menu page launched successfully");
        driver.findElement(generic.clkMenu2()).click();
        driver.findElement(generic.clkNexts()).click();
        String querygate=driver.getCurrentUrl();
		Assert.assertEquals("http://10.0.1.86/tatoc/advanced/query/gate", querygate);
		Reporter.log("SQL DB query gate page launched successfully");
	}
	
	@Test(dependsOnMethods= {"TC12_Menu"}) 
	
	public void TC13_DB() throws ClassNotFoundException, SQLException, InterruptedException
	
	{
		//Thread.sleep(1000);
		symbolname = driver.findElement(generic.getSymbol()).getText();
		Assert.assertNotNull(symbolname);
		Reporter.log(symbolname+"Symbol captured successfully");
		//System.out.println(symbolname);
		Class.forName("com.mysql.jdbc.Driver"); 
		 con=DriverManager.getConnection(  
		"jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");  
		 Assert.assertNotNull(con);
		 Reporter.log("Connected to sql db successfully");
	}
	@Test(dependsOnMethods= {"TC13_DB"}) 
	public void TC14_Con1() throws SQLException, ClassNotFoundException
	{
        stmt= con.createStatement();  
		String query="select id from identity where symbol='"+symbolname+"';";
		rs=stmt.executeQuery(query);  
		while(rs.next())  
		{
			 ResultSetMetaData rsmd = rs.getMetaData();
			 //getting column name
			 String colname = rsmd.getColumnName(1);
			 Assert.assertNotNull(colname);
			 Reporter.log("1st column name captured");
			 System. out.println(colname);
			 //getting id from 1st column
		     id=rs.getInt(1);
		     Assert.assertNotNull(id);
			 Reporter.log("id captured");
		    // System. out.println(id);
		     
		     
		}
	}
	@Test(dependsOnMethods= {"TC14_Con1"}) 
	public void TC15_Con2() throws ClassNotFoundException, SQLException
	{
		     Class.forName("com.mysql.jdbc.Driver"); 
		      con1=DriverManager.getConnection(  
		     "jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01"); 
		      Assert.assertNotNull(con1);
		      Reporter.log("Again connected to sql db successfully");
		     stmt1= con1.createStatement();  
		     query1="select name,passkey from credentials where id='"+id+"' ;";
		     
	}
	@Test(dependsOnMethods= {"TC15_Con2"}) 
	public void TC16_Val() throws SQLException
	{
			  rs1=stmt1.executeQuery(query1);  
			    while(rs1.next())
			{
			
				String name1=rs1.getString(1);	
				String passkey=rs1.getString(2);
				Assert.assertNotNull(name1);
				Reporter.log("Name retrived");
				Assert.assertNotNull(passkey);
				Reporter.log("Passkey retrived");
	      
			    driver.findElement(generic.getNameloc()).sendKeys(name1);
				driver.findElement(generic.getPasskey()).sendKeys(passkey);
				driver.findElement(generic.clksubmit1()).click();
				String video=driver.getCurrentUrl();
				Assert.assertEquals("http://10.0.1.86/tatoc/advanced/video/player", video);
				Reporter.log("Video player page launched");
			
				
		}
			 
				con.close();
				con1.close();
		}

@AfterClass
	public void teardown() throws SQLException
	
	{
		/*con.close();
		Assert.assertNull(con);
		Reporter.log("Con is closed");
		
		con1.close();
		Assert.assertNull(con1);
		Reporter.log("Con1 is closed");*/
		driver.close();
		Reporter.log("Driver closed");
	}
	
}
