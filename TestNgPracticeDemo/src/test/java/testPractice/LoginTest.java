package testPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testRegistration() {
        // Step 1: Navigate to the registration page
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");

        // Step 2: Locate the fields and input test data for registration
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Test User");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("testuser@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password123");
        passwordField.submit();
        
        // Step 4: Wait for the page to load (you can replace with WebDriverWait for better synchronization)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
