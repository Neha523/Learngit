package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchjobloc {

	WebDriver driver;
	public Searchjobloc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter skills / designations / companies']")
    WebElement Search;
	
	public void Srch()
	{
		Search.sendKeys("Automation testing");
		Search.click();
	}

}
