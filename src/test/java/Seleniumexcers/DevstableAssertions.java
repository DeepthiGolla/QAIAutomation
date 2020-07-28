package Seleniumexcers;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class DevstableAssertions {
	
	// this is same as DevstableLandSub program but i have added one more method and assertions
	
	static WebDriver driver;

	static WebDriverWait wait ;
	
	//you will see how to handle stale element exception, explicit wait , assertions 
	
	public static void cxpframe(int a, int b, String c) throws InterruptedException
	{
		
		//we are getting radio button label after calling a method 
		
		List<WebElement> label = driver.findElements(By.xpath("//span[@class='ci-choice-descr']"));
		
		
		for (int i=a;i<=b;i++)
		{
		
		if (label.get(i).getText().equalsIgnoreCase(c)	)
			{
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='radio']")).get(i)));
		
			 Thread.sleep(1000);
				
			 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     
		    boolean status= driver.findElements(By.xpath("//input[@type='radio']")).get(i).isSelected();
		     
		    
			 Assert.assertTrue(status);
			 System.out.println( "Radio button is selected:  " +label.get(i).getText() );
			
			 }
		}
	}
	
	
	public static void cxpsec(int a, int b, String c) throws InterruptedException
	{
		
		//we are getting radio button label after calling a method 
		
		List<WebElement> label = driver.findElements(By.xpath("//span[@class='ci-choice-descr']"));
		
		
		for (int i=a;i<=b;i++)
		{
		
		if (label.get(i).getText().equalsIgnoreCase(c)	)
			{
				
					
			wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='radio']")).get(i)));
		
			 Thread.sleep(1000);
				
			 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     
		    boolean status= driver.findElements(By.xpath("//input[@type='radio']")).get(i).isSelected();
		     
		    
			 Assert.assertTrue(status);
			 System.out.println( "Radio button is selected:  " +label.get(i).getText() );
				
			 
			 }
		}
	}

	public static void main(String[] args) throws InterruptedException, SQLException, ClassNotFoundException
	
	{
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//chromedriver83");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-extensions");
		 driver = new ChromeDriver();
		 
			
			//creating an object to Web driver wait class 
		 
	    wait = new WebDriverWait(driver,30);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://dev-stable-cxp.cengage.info/activityservice/");
		
		// click on drop down 
		
		driver.findElement(By.xpath("//a[text()='Test page']")).click();
		
		WebElement activity = driver.findElement(By.cssSelector(".examples.presets"));
		//selecting activity 
		Select dropdown = new Select (activity);
		dropdown.selectByIndex(24);
		//String s = dropdown.getFirstSelectedOption().getText();
		//click on Take Activity button 
		driver.findElement(By.name("take")).click();
		
		//finding frame to switch 
		WebElement frame = driver.findElement(By.id("easyXDM_activityService_target_provider"));
		
		driver.switchTo().frame(frame);
		
		// Identifying all 4 questions at 1st item 
		
		By Quest = By.cssSelector(".ci-question");
		 
		List<WebElement> questions =	driver.findElements(Quest);
	
		wait.until(ExpectedConditions.visibilityOfAllElements(questions));
		
		questions.get(0).click();
		 
		boolean fiitem = questions.get(0).isEnabled(); 
		
		 Assert.assertTrue(fiitem);
		
		System.out.println("1st item is clicked " );

	   cxpframe(0,3,"George Washington");
	  
	   wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='submit']")).get(0)));
      
	   driver.findElement(By.xpath("//input[@type='submit']")).click();

	   questions.get(1).click();
	  
      cxpframe(4,7,"Thomas Jefferson");
   
      wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='submit']")).get(1)));
      
	
	  driver.findElements(By.xpath("//input[@type='submit']")).get(1).click();
	

	 questions.get(2).click();
	
	 cxpframe(8,11,"Ganga");
	 
	 wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='submit']")).get(2)));

	 driver.findElements(By.xpath("//input[@type='submit']")).get(2).click();
	
	
	 questions.get(3).click();
	
     cxpframe(12,15,"Sireesha");
   
     wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='submit']")).get(3)));
   
     driver.findElements(By.xpath("//input[@type='submit']")).get(3).click();
   
   
    //Identifying 2nd item questions 
     By secitem = By.xpath("//span[text()='Question']");
	 
	 List<WebElement> Sitem =	driver.findElements(secitem);
	  
	 wait.until(ExpectedConditions.visibilityOfAllElements(Sitem));
	
	 Sitem.get(1).click();
	
	 Thread.sleep(1000);
 
   
    System.out.println("2nd item is clicked");

	cxpsec(0,2,"2");
   
   //to click on submit answer button 
   driver.findElement(By.xpath("//div[text()='Submit Answer']")).click();
   
   //to move back to default content from frame 
   driver.switchTo().defaultContent();
   
   //to click on complete final grading 
   
   driver.findElement(By.xpath("//a[@class='assignment-button review-completed-final-grading-button']")).click();
		
	}
}
