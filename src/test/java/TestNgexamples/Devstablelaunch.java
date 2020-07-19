package TestNgexamples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Devstablelaunch 

{

	WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException

	   {
		
		System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver80");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
	    driver = new ChromeDriver();
		//driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://dev-stable-cxp.cengage.info/activityservice/");
		driver.manage().window().maximize();
	   }
	
	
}
