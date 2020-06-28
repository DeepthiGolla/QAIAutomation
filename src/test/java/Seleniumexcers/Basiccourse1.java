package Seleniumexcers;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

public class Basiccourse1 {

	public static void main(String[] args) throws InterruptedException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		{
	
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("http://10.0.1.86/tatoc");
		
		driver.findElement(By.xpath("//a[text()='Basic Course']")).click();
				
		
	
		driver.findElement(By.xpath("//div//div[@class='page']/table/tbody/tr/td/div[@class='greenbox']")).click();
		
		String secwindow = driver.getWindowHandle();
		
		
		System.out.println(secwindow);
		
		WebElement frameone = driver.findElement(By.xpath("//iframe[@id='main']"));
		
		driver.switchTo().frame(frameone);
		
		String box1 = driver.findElement(By.xpath("//div[text()='Box 1']")).getAttribute("class");
		
		String box2;
        do
        {
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(frameone);
		driver.findElement(By.xpath("//a[contains(@onclick,'reloadChildFrame')]")).click();
	    Thread.sleep(1000);
		WebElement framechild = driver.findElement(By.xpath("//iframe[@id='child']"));
		driver.switchTo().frame(framechild);
	    box2=driver.findElement(By.xpath("//div[text()='Box 2']")).getAttribute("class");
	    System.out.println("box 1 background color is " +box1);
	    System.out.println("box 2 background color is " +box2);
	    Thread.sleep(1000);
		}
	    while (!box1.equals(box2));

       driver.switchTo().defaultContent();
       driver.switchTo().frame(frameone);
	   driver.findElement(By.xpath("//a[contains(@onclick,'gonext')]")).click();		
	   
	   String thrdwindow = driver.getWindowHandle();
	   System.out.println(thrdwindow);
	   
	   Actions ac=new Actions(driver);
	   
	   WebElement drag = driver.findElement(By.xpath("//div[@id='dragbox']"));
	   WebElement drop = driver.findElement(By.xpath("//div[@id='dropbox']"));
	   
	   ac.dragAndDrop(drag, drop).build().perform();
	   
	   driver.findElement(By.xpath("//a[contains(@onclick,'gonext')]")).click();
	   
	   String fourthwindow = driver.getWindowHandle();
	   //System.out.println(fourthwindow);
	   
	  driver.switchTo().window(fourthwindow);
	  driver.findElement(By.xpath("//a[contains(@onclick,'launchwindow')]")).click();
	  
	 
	  // It returns no. of windows opened by WebDriver and will return Set of Strings
	  Set<String> set =driver.getWindowHandles();
	  // Using Iterator to iterate with in windows
	  Iterator<String> itr= set.iterator();
	  while(itr.hasNext()){
	  String childWindow=itr.next();
	     // Compare whether the main windows is not equal to child window. If not equal, we will close.
	  if(!fourthwindow.equals(childWindow))
	  
	  {
	  driver.switchTo().window(childWindow);
	 
             
      System.out.println(driver.switchTo().window(childWindow).getTitle());
                  
               
                  
           	 WebElement text =  driver.findElement(By.id("name"));
          
        

           	 ac.moveToElement(text).build().perform();
           	 text.sendKeys("deepthitest");
           	   String s = text.getText();
           	   System.out.println(s);
           
           	   driver.findElement(By.xpath("//input[@id='submit']")).click();
        
         
          }
          
      }
      

   	  driver.switchTo().window(fourthwindow);
   	   driver.findElement(By.xpath("//a[contains(@onclick,'gonext')]")).click();
	 
      
	   
		String fifthwindow = driver.getWindowHandle();
		
		System.out.println(fifthwindow);
		
	   //click on Generate Token link
		
		driver.findElement(By.xpath("//a[contains(@onclick,'generateToken')]")).click();
		
		String token =	driver.findElement(By.xpath("//span[@id='token']")).getText();
		
		
		
		System.out.println(token);
		
		
		
		//create a cookie and stored token value in cookie 
		//Cookie ck = new Cookie("token",t);
		
		
		//System.out.println(ck);
		//driver.manage().addCookie(ck);
		
		//click on proceed link after storing cookie in browser 
		
		 // Set<Cookie> cookies=driver.manage().getCookies();
		  
		 // System.out.println(cookies);
		  
		  
		  String[] splited = token.split("\\s+");
		  Cookie name = new Cookie("Token", splited[1]);
		  driver.manage().addCookie(name);
		  
		/*for (Cookie S: cookies)
		{
			System.out.println(S);
			
		}*/
		
		
		driver.findElement(By.xpath("//a[contains(@onclick,'gonext')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Advanced Course']")).click();
				
		driver.findElement(By.xpath("//div[@class='menutop m2']")).click();
		
		
		
		driver.findElement(By.xpath("//span[contains(@onclick,'gonext')]")).click();
		
		String symbolname = driver.findElement(By.xpath("//div[@name='symboldisplay']")).getText();
		System.out.println(symbolname);
		
		
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");   
		Statement stmt= con.createStatement();  
		String query="select id from identity where symbol='"+symbolname+"';";
		ResultSet rs=stmt.executeQuery(query);  
		while(rs.next())  
		{
			 ResultSetMetaData rsmd = rs.getMetaData();
			 //getting column name
			 String colname = rsmd.getColumnName(1);
			 System. out.println(colname);
			 //getting id from 1st column
		     int id=rs.getInt(1);
		     System. out.println(id);
		     Class.forName("com.mysql.jdbc.Driver"); 
		     Connection con1=DriverManager.getConnection(  
		     "jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");  
		     Statement stmt1= con1.createStatement();  
		     String query1="select name,passkey from credentials where id='"+id+"' ;";
			 ResultSet rs1=stmt1.executeQuery(query1);  
			    while(rs1.next())
			{
			
				String name1=rs1.getString(1);	
				String passkey=rs1.getString(2);
	            System. out.println(name1);
				System. out.println(passkey);
				
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name1);
				driver.findElement(By.xpath("//input[@id='passkey']")).sendKeys(passkey);
				driver.findElement(By.xpath("//input[@id='submit']")).click();
		}
			    con1.close();
		}
		
		con.close();
		
		}
	
		
		
		}
		}
	


	
		
	
		

	
		
	



