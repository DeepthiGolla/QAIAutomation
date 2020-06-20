	package TestNgexamples;

	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.Reporter;

public class pageObjModel {
	
	WebDriver driver;
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
		
		public By basic = By.xpath("//a[text()='Basic Course']");
		public By greenb= By.xpath("//div//div[@class='page']/table/tbody/tr/td/div[@class='greenbox']");
    	public By boxone = By.xpath("//div[text()='Box 1']");
		public By reload= By.xpath("//a[contains(@onclick,'reloadChildFrame')]");
	    public By iframemain =By.xpath("//iframe[@id='main']");
		public By iframechild = By.xpath("//iframe[@id='child']");
		public By boxtwo = By.xpath("//div[text()='Box 2']");
		public By gonext = By.xpath("//a[contains(@onclick,'gonext')]");
	    public By dragbox=By.xpath("//div[@id='dragbox']");
		public By dropbox=By.xpath("//div[@id='dropbox']");
		public By proceed = By.xpath("//a[contains(@onclick,'gonext')]");
		public By launchwin = By.xpath("//a[contains(@onclick,'launchwindow')]");
		public By name = By.id("name");
		public By submit = By.xpath("//input[@id='submit']");
		public By next =By.xpath("//a[contains(@onclick,'gonext')]");
		public By gentoken = By.xpath("//a[contains(@onclick,'generateToken')]");
		
		public By tokengot =By.xpath("//span[@id='token']");
		
		public By proceeds = By.xpath("//a[contains(@onclick,'gonext')]");
		
		public By advcourse = By.xpath("//a[text()='Advanced Course']");
		
		public By menu2 = By.xpath("//div[@class='menutop m2']");
		
		public By nexts =By.xpath("//span[contains(@onclick,'gonext')]");
		public By symboldis = By.xpath("//div[@name='symboldisplay']");
		
		public By nameloc = By.xpath("//input[@id='name']");
		
		public By passkeyloc = By.xpath("//input[@id='passkey']");
		
		public By submit1 =By.xpath("//input[@id='submit']");
		
		String line;
		
		public pageObjModel(WebDriver driver) throws IOException
		{
			// in below we are using text file to input url to driver 
			this.driver=driver;
			
			String fileName = "//Users//dgolla//documents//QAI Automation //Automation//baseurl.txt";
			File file = new File(fileName);
			FileInputStream	 fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			//driver.get("http://10.0.1.86/tatoc");
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		}
		
	public String Basic() 
	    {
		
		driver.findElement(basic).click();
	    return driver.getCurrentUrl();		
			
	    }

	    public String Green() 
	   {
			driver.findElement(greenb).click();
			 return driver.getCurrentUrl();	
	        
			
		}
	   public String Frame() 
		{
	        frameone = driver.findElement(iframemain);
		    driver.switchTo().frame(frameone);
		    
		   box1= driver.findElement(boxone).getAttribute("class");
		   return box1;
		}
		public void Frametwo() throws InterruptedException 
		{
		    do
	        {
		    	
	    	driver.switchTo().defaultContent();
			driver.switchTo().frame(frameone);
			
			
			driver.findElement(reload).click();
			//WebDriverWait wait = new WebDriverWait(driver,30);
			
			Thread.sleep(1000); //this is called hard wait , we should avoid using them
			WebElement framechild = driver.findElement(iframechild);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(framechild));
			driver.switchTo().frame(framechild);
		    box2=driver.findElement(boxtwo).getAttribute("class");
		    //System.out.println(box2);
		    Thread.sleep(1000);
		    
		   }
		    while (!box1.equals(box2))  ;
		}
		public String Compare()
		{

	       driver.switchTo().defaultContent();
	       driver.switchTo().frame(frameone);
		   driver.findElement(gonext).click();	
		   return driver.getCurrentUrl();
			
			}
		public String Dnd() 
		{
			Actions ac=new Actions(driver);
			WebElement drag = driver.findElement(dragbox);
			WebElement drop = driver.findElement(dropbox);
			ac.dragAndDrop(drag, drop).build().perform();
			driver.findElement(proceed).click();
		    return driver.getCurrentUrl();
			
		}
		
      	public String Pop() 
		{
			 ac=new Actions(driver);
			 fourthwindow = driver.getWindowHandle();
			driver.switchTo().window(fourthwindow);
			driver.findElement(launchwin).click();
		    return driver.getCurrentUrl();
			
			
		}
		  public String Child() throws InterruptedException
		  {// It returns no. of windows opened by WebDriver and will return Set of Strings
			Set<String> set =driver.getWindowHandles();   // Using Iterator to iterate with in windows
			Iterator<String> itr= set.iterator();
			String s;
			while(itr.hasNext())
			{
			String childWindow=itr.next();    // Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!fourthwindow.equals(childWindow))
			{
			driver.switchTo().window(childWindow);
			//return driver.getCurrentUrl();
	      	//System.out.println(driver.switchTo().window(childWindow).getTitle());
		   WebElement text= driver.findElement(name);
		   Thread.sleep(1000);
		    ac.moveToElement(text).build().perform();
		    text.sendKeys("deepthitest");
		   s = text.getText();
		    //Assert.assertNotNull(s);
		    //Reporter.log(s+" name entered successfully");
		   // System.out.println(s);
		    driver.findElement(submit).click();
			return s;

	    
		    }
		    }
			return driver.getCurrentUrl();
		}
	
	     public String Prowin()
	     {
	    	
		    driver.switchTo().window(fourthwindow);
		    driver.findElement(next).click();
		   	return driver.getCurrentUrl();

		}
		
		public String Cookie() 
		
		{
	     driver.findElement(gentoken).click();
	     String token =	driver.findElement(tokengot).getText();
	   
	     String[] splited = token.split("\\s+");
	     Cookie name = new Cookie("Token", splited[1]);
	     driver.manage().addCookie(name);
	     driver.findElement(proceeds).click();
	     return driver.getCurrentUrl();
		}
		
		public String AdvC()
		
		{
			
			driver.findElement(advcourse).click();
			return driver.getCurrentUrl();
		}
		
		public String Menu() 
		
		{
			
		 driver.findElement(menu2).click();
	     driver.findElement(nexts).click();
	     return driver.getCurrentUrl();
		}
		
		
		
		public String DB() throws ClassNotFoundException, SQLException, InterruptedException
		
		{
			symbolname = driver.findElement(symboldis).getText();
			Class.forName("com.mysql.jdbc.Driver"); 
			 con=DriverManager.getConnection(  
			"jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");  
				return symbolname;
			 
		}
		
		public void Cquery() throws SQLException, ClassNotFoundException
		{
	        stmt= con.createStatement();  
			String query="select id from identity where symbol='"+symbolname+"';";
			rs=stmt.executeQuery(query);  
			while(rs.next())  
			{
				 ResultSetMetaData rsmd = rs.getMetaData();
				 //getting column name
				 String colname = rsmd.getColumnName(1);
				 id=rs.getInt(1);
			    
			}
					
			}
		
		public void Ctquery() throws ClassNotFoundException, SQLException
		{
			     Class.forName("com.mysql.jdbc.Driver"); 
			      con1=DriverManager.getConnection(  
			     "jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");
			     stmt1= con1.createStatement();  
			     query1="select name,passkey from credentials where id='"+id+"' ;";
			     
		}
		
		public void Val() throws SQLException
		{
				  rs1=stmt1.executeQuery(query1);  
				    while(rs1.next())
				{
				
					String name1=rs1.getString(1);	
					String passkey=rs1.getString(2);
					driver.findElement(nameloc).sendKeys(name1);
					driver.findElement(passkeyloc).sendKeys(passkey);
					driver.findElement(submit1).click();
					
				
					
			}
				 
					con.close();
					con1.close();
					//return driver.getCurrentUrl();
			}

}
