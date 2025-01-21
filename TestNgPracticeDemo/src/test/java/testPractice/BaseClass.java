package testPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	@BeforeClass
	public void loginToApp()
	{
		WebDriver driver = new ChromeDriver();
	}
}
