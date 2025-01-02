package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobloc {
	
	WebDriver driver;
	public Jobloc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[normalize-space()='Jobs']")
	WebElement Jobclick;
	
	@FindBy(xpath="//div[normalize-space()='IT jobs']")
	WebElement Itjobclick;
	
	
	
	public void Jclick()
	{
		Actions jobhover=new Actions(driver);
		jobhover.moveToElement(Jobclick).moveToElement(Itjobclick).click().build().perform();
	
	}

}
