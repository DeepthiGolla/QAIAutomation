package devStableex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Jobsheetprog {
	
	static WebDriver driver;
	
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//chromedriver84");
		
		 driver = new ChromeDriver();
		 
			
			//creating an object to Web driver wait class 
		 
	     wait = new WebDriverWait(driver,30);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://dev-stable-cxp.cengage.info/activityservice/");
		
		// click on drop down 
		
		driver.findElement(By.xpath("//a[text()='Test page']")).click();
		
		WebElement activity = driver.findElement(By.cssSelector(".examples.presets"));
		
		//selecting activity 
		
		Select dropdown = new Select (activity);
		dropdown.selectByVisibleText("Job sheet item reference");
		
		WebElement TakeActivity = driver.findElement(By.name("take"));
		
	    wait.until(ExpectedConditions.visibilityOfAllElements(TakeActivity));
				
	    TakeActivity.click();
	    		
        WebElement frame = driver.findElement(By.id("easyXDM_activityService_target_provider"));
        
        wait.until(ExpectedConditions.visibilityOf(frame));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sadhvi");
		
		driver.findElement(By.xpath("//input[@name='station']")).sendKeys("Farmington Hills");
		
		
		driver.findElement(By.xpath("//input[@name='date']")).sendKeys("07/19/2020");
		

		driver.findElement(By.xpath("//input[@name='year']")).sendKeys("01st Jan 2020");

		driver.findElement(By.xpath("//input[@name='make']")).sendKeys("31st Jan 2020");
		
		driver.findElement(By.xpath("//input[@name='model']")).sendKeys("Test model");
		
		driver.findElement(By.xpath("//input[@name='mileage']")).sendKeys("Test mileage");

		driver.findElement(By.xpath("//input[@name='vin']")).sendKeys("Test vin");

		driver.findElement(By.xpath("//input[@name='engine']")).sendKeys("Test engine");

		driver.findElement(By.xpath("//input[@name='engine2']")).sendKeys("Test engine2");
		
		
		driver.findElement(By.xpath("//input[@name='station2']")).sendKeys("Test station2");

		WebElement Textarea1 = driver.findElement(By.xpath("//textarea[@name='problems']"));
		
		Textarea1.sendKeys("Test textarea1");

        WebElement Textarea2 = driver.findElement(By.xpath("//textarea[@name='problems2']"));
		
		Textarea2.sendKeys("Test textarea2");

        WebElement Textarea3 = driver.findElement(By.xpath("//textarea[@name='conclusions']"));
		
		Textarea3.sendKeys("Test textarea3");

		WebElement addFile = driver.findElement(By.xpath("//input[@id='file']"));
		
		addFile.sendKeys("//Users//dgolla//Desktop//USAmap.png");
		
		WebElement expectedmsg = driver.findElement(By.xpath("//p[text()='USAmap.png']"));
		
		String s = expectedmsg.getText();
		
		System.out.println(s);
		
		
		wait.until(ExpectedConditions.textToBePresentInElement(expectedmsg,s));
		
		Assert.assertNotNull(addFile);
		
		System.out.println("file is uploaded successfully");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement finalgradingbutton = driver.findElement(By.xpath("//a[@class='assignment-button review-completed-final-grading-button']"));
				
		wait.until(ExpectedConditions.visibilityOf(finalgradingbutton));
		
		finalgradingbutton.click();
		
		boolean status = finalgradingbutton.isEnabled();
		
        Assert.assertTrue(status);
		
		System.out.println("activity submitted successfully");
		 

	}

}
