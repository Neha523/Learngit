package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginloc {
	
	WebDriver driver;
	public Loginloc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="input[placeholder*='Enter your active Email ID / Username']")
			WebElement user;
	
	@FindBy(css="input[placeholder*='Enter your password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	public void Username(String email)
	{
		user.clear();
		user.sendKeys(email);
	}
	
	public void Password(String pass)
	{
		pwd.clear();
		pwd.sendKeys(pass);
	}
	
	public void click()
	{
		Submit.click();
	}

	
}
