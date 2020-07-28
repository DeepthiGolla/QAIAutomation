package devStableex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageObjModel2
{
	
	
static WebDriver driver;
	
static WebDriverWait wait;
String s;


public By testpage = By.xpath("//a[text()='Test page']");

public By activity = By.cssSelector(".examples.presets");

public By take = By.name("take");

public By frame1 = By.id("easyXDM_activityService_target_provider");


public By name = By.xpath("//input[@name='name']");


public By station = By.xpath("//input[@name='station']");


public By date = By.xpath("//input[@name='date']");

public By year = By.xpath("//input[@name='year']");

public By make = By.xpath("//input[@name='make']");

public By model = By.xpath("//input[@name='model']");

public By mileage = By.xpath("//input[@name='mileage']");

public By vin = By.xpath("//input[@name='vin']");

public By engine = By.xpath("//input[@name='engine']");

public By engine2 = By.xpath("//input[@name='engine2']");

public By station2 = By.xpath("//input[@name='station2']");

public By textarea1 = By.xpath("//textarea[@name='problems']");

public By textarea2 = By.xpath("//textarea[@name='problems2']");

public By textarea3 = By.xpath("//textarea[@name='conclusions']");

public By addFile = By.xpath("//input[@id='file']");

public By submit = By.xpath("//input[@value='Submit']");

public By finalgradingbutton = By.xpath("//a[@class='assignment-button review-completed-final-grading-button']");



public PageObjModel2(WebDriver driver) throws FileNotFoundException {
	
	//this is constructor and got driver focus from test class 
    this.driver=driver;
	
    // Trying to give URL from file 
    
	String fileName = "//Users//dgolla//documents//QAI Automation //Automation//baseurl_1.txt";
	File file = new File(fileName);
	FileInputStream	 fileInput = new FileInputStream(file);
	Properties prop = new Properties();
	try {
		prop.load(fileInput);
	} catch (IOException e) {
		e.printStackTrace();
	}
	driver.get(prop.getProperty("DevstableURL"));
	driver.manage().window().maximize();
	
	 wait = new WebDriverWait(driver,30);

	// TODO Auto-generated constructor stub
}

public String launchtestpage()

{

	driver.findElement(testpage).click();
    return driver.getCurrentUrl();	
}

public boolean selectactivity()

{
	WebElement act = driver.findElement(activity);
	
	act.click();
	
	//selecting activity 
	
	Select dropdown = new Select (act);
	dropdown.selectByVisibleText("Job sheet item reference");
	boolean status = act.isSelected();
	
	return status;
}

public String launchtake()

{

	driver.findElement(take).click();
    return driver.getCurrentUrl();	
}

public void switchframe()

{   
	  WebElement frame = driver.findElement(frame1);
      
      wait.until(ExpectedConditions.visibilityOf(frame));
		
	  driver.switchTo().frame(frame);
		
    
	 
}

public String entername()

{ 
 
 driver.findElement(name).sendKeys("sanvi");
 s=driver.findElement(name).getAttribute("value");
 return s ;

}

public String enterstation()

{ 
 
 driver.findElement(station).sendKeys("Hyderabad");
 s=driver.findElement(station).getAttribute("value");
 return s ;

}

//how to handle date to return ?

public String enterdate()

{ 
 
 driver.findElement(date).sendKeys("08/26/2020");
 s=driver.findElement(date).getAttribute("value");
 return s ;

}

public String enteryear()

{ 
 
 driver.findElement(year).sendKeys("2020");
 s=driver.findElement(year).getAttribute("value");
 return s ;

}


public String entermake()

{ 
 
 driver.findElement(make).sendKeys("new make");
 s=driver.findElement(make).getAttribute("value");
 return s ;

}

public String entermodel()

{ 
 
 driver.findElement(model).sendKeys("model 2020");
 s=driver.findElement(model).getAttribute("value");
 return s ;

}

public String entermileage()

{ 
 
 driver.findElement(mileage).sendKeys("1234");
 s=driver.findElement(mileage).getAttribute("value");
 return s ;

}

public String entervin()

{ 
 
 driver.findElement(vin).sendKeys("vin22");
 s=driver.findElement(vin).getAttribute("value");
 return s ;

}

public String enterengine()

{ 
 
 driver.findElement(engine).sendKeys("engine 2020");
 s=driver.findElement(engine).getAttribute("value");
 return s ;

}

public String enterengine2()

{ 
 
 driver.findElement(engine2).sendKeys("engine 2020_2");
 s=driver.findElement(engine2).getAttribute("value");
 return s ;

}

public String enterstation2()

{ 
 
 driver.findElement(station2).sendKeys("station2_2020");
 s=driver.findElement(station2).getAttribute("value");
 return s ;

}

public String enterproblems()

{ 
 
 driver.findElement(textarea1).sendKeys("This is QA Test");
 s=driver.findElement(textarea1).getAttribute("value");
 return s ;

}

public String enterproblems2()

{ 
 
 driver.findElement(textarea2).sendKeys("This is testing program");
 s=driver.findElement(textarea2).getAttribute("value");
 return s ;

}

public String enterconclusions()

{ 
 
 driver.findElement(textarea3).sendKeys("This is conclusion");
 s=driver.findElement(textarea3).getAttribute("value");
 return s ;

}

public String addFile() throws InterruptedException

{
WebElement af = driver.findElement(addFile);

af.sendKeys("//Users//dgolla//Desktop//USAmap.png");

WebElement expectedmsg = driver.findElement(By.xpath("//p[text()='USAmap.png']"));

String s = expectedmsg.getText();

wait.until(ExpectedConditions.textToBePresentInElement(expectedmsg,s));

return s;

}

//how to handle submit ?
		
public boolean submitAct()
{
	try
	{
	WebElement ele = driver.findElement(submit);
    wait.until(ExpectedConditions.elementToBeClickable(ele));
    ele.click();
	return true;
	}
	
	catch (Exception e)
	{
		return false;
		
	}
 
}
public boolean completeFinal()

{
	driver.switchTo().defaultContent();
	
	WebElement fgb = driver.findElement(finalgradingbutton);
			
	wait.until(ExpectedConditions.visibilityOf(fgb));
	
	fgb.click();
	
	boolean status = fgb.isEnabled();
	
   
	return status;

}



}