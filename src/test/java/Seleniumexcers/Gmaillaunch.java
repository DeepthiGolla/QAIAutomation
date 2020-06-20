package Seleniumexcers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Gmaillaunch {
	
	@Test 
	public void seleniumTest()
	{
	//ChromeOptions options = new ChromeOptions();
	//options.setBinary("//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver");
	
	//WebDriver driver= new ChromeDriver(options) ;
	
	
	
	System.setProperty("webdriver.chrome.driver", "//Users//dgolla//Documents//QAI Automation //Automation//ChromeDriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-extensions");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://gmail.com");
	
	}
	 

}
