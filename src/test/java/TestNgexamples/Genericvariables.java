package TestNgexamples;

import org.openqa.selenium.By;

public class Genericvariables {
	
	public By basic = By.xpath("//a[text()='Basic Course']");
	public By greenb= By.xpath("//div//div[@class='page']/table/tbody/tr/td/div[@class='greenbox']");
	//public By greenb= By.xpath("//div[@onclick='passthru']");
	public By boxone = By.xpath("//div[text()='Box 1']");
	public By reload= By.xpath("//a[contains(@onclick,'reloadChildFrame')]");
	
	
    public By iframemain =By.xpath("//iframe[@id='main']");
	//public By iframemain =By.tagName("iframe");
	
	
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
	
public By getBasic()

{
	
	return basic;
}

public By getGreenbox()
{
	
	return greenb;
	
}

public By getBoxone()

{
	return boxone;
	
}

public By getReload()

{
	
	return reload;
	
}

public By getMain()

{
	return iframemain;
	
}

public By getChild()

{
	return iframechild;
	
	
}

public By getboxtwo()

{
	return boxtwo;
}


public By getNext()
{
	
	return gonext;
}

public By getDrag()
{
	return dragbox;
	
}

public By getDrop()
{
	return dropbox;
	
}

public By proceedPage()
{
	
	return proceed;
}

public By launchWin()

{
	return launchwin;
}

public By getName()

{
	
	return name;
}

public By clkSubmit()

{
	return submit;
	
}

public By clkNext()

{
	return gonext;
}
	
public By genToken()

{
	return gentoken;
	
}

public By gettoken()
{
	return tokengot;

}

public By clkProceed()
{
	
	return proceeds;
}
public By clkadvcourse()
{
	
	return advcourse;
	
}

public By clkMenu2()
{
	
	return menu2;
	
}

public By clkNexts()
{
	return nexts;
}
public By getSymbol()
{
	
	return symboldis;
}

public By getNameloc()
{
	return nameloc;
	
}
public By getPasskey()
{
	return passkeyloc;
	
}
public By clksubmit1() {
	return submit1;
	
}

}
