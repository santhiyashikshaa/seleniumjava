package Sandhya.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	WebDriver driver;
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Login log=new Login(driver);
		log.email().sendKeys("shikshaaselenium1@gmail.com");
		log.password().sendKeys("Selenium@123");
		log.login().click();
		Account acc=new Account(driver);
		Assert.assertTrue(acc.account().isDisplayed());
	}
	@AfterMethod
	public void end() {
		driver.quit();
	}
}
