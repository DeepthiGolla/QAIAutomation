package Seleniumexcers;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class DevstableLanndSub {
	
	
	static WebDriver driver;

	static WebDriverWait wait ;
	
	
	
	public static void cxpframe(int a, int b, String c) throws InterruptedException
	{
		
		//we are getting radio button label after calling a method 
		
		List<WebElement> label = driver.findElements(By.xpath("//span[@class='ci-choice-descr']"));
		
		
		for (int i=a;i<=b;i++)
		{
		
		if (label.get(i).getText().equalsIgnoreCase(c)	)
			{
				
				//System.out.println("answer option is  " +label.get(i).getText());
				

			//WebElement radio =	
			wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='radio']")).get(i)));
			
			/* Actions action =new Actions(driver);
			 action.moveToElement(radio).click().build().perform();
			 action.moveToElement(radio).click().build().perform();
			 
			 wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='radio']")).get(i))); */
			 Thread.sleep(1000);
				
			 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		     
		    boolean status= driver.findElements(By.xpath("//input[@type='radio']")).get(i).isSelected();
		     
		    
			 Assert.assertTrue(status);
			 System.out.println( "Radio button is selected:  " +label.get(i).getText() );
				
			 //Thread.sleep(2000);
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
		 
	   //Thread.sleep(1000);
		
	   cxpframe(0,3,"George Washington");
	   
	   //Thread.sleep(2000);
	   wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@type='submit']")).get(0)));
    driver.findElement(By.xpath("//input[@type='submit']")).click();

	   questions.get(1).click();
	  //Thread.sleep(2000);
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

	//cxpframe(0,2,"2");
	
	
	
	//WebElement secitem = driver.findElement(By.xpath("//span[text()='Question']")) ;
	//secitem.click();
   Thread.sleep(1000);
   
   //to click on question 
   //driver.findElement(By.xpath("//div[text()='root(3,8) is...']")).click();
   
   //to click radio button with value 2
	
   new WebDriverWait(driver, 3000).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='0']")));
   //driver.findElement(By.id("checkoutLink")).click();
   //wait.until(ExpectedConditions.elementExists(By.xpath("//input[@value='0']")));
   
   driver.findElement(By.xpath("//input[@value='0']")).click();
   driver.findElement(By.xpath("//input[@value='0']")).click();
   
   //to click on submit answer button 
   driver.findElement(By.xpath("//div[text()='Submit Answer']")).click();
   
   //to move back to default content from frame 
   driver.switchTo().defaultContent();
   
   //to click on complete final grading 
   
   driver.findElement(By.xpath("//a[@class='assignment-button review-completed-final-grading-button']")).click();
		
	}
}
