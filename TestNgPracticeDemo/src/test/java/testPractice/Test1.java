package testPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver  driver;
	@BeforeClass
	@Parameters({"browser","appUrl"})
	void setup(String browser,String appUrl)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		
	}
	@Test
	void test02()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test
	void test03()
	{
		String title = driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up",title,"Title not matched");
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
