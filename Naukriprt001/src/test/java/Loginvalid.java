import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.Jobloc;
import Locators.Loginloc;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Loginvalid {
	
	//@DataProvider(name="logincsv")
	//public Object[][] Logincsvdata() throws IOException
	//{
		//List<String[]> alldata=DataReaders.getCSVData("src\\test\\resources\\Data\\Logindata.csv",1);
	//}

	/*@Test
	public void Tc_Validlgn()
	{
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("nI-gNb-lg-rg__login")).click();
		Loginloc logg=new Loginloc(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logg.Username("neha1164sharma@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logg.Password("Testme@123");
		logg.click();
		String expectedtitle="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
	    Assert.assertEquals(actualtitle, expectedtitle);
		
		
	}*/
	
	@Test
	
	public void Tc_Jobclck()
	{
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Jobloc jbclck=new Jobloc(driver);
		jbclck.Jclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
}
