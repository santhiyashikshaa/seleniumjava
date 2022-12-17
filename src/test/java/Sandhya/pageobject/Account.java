package Sandhya.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account {
	WebDriver driver;
	public Account(WebDriver driver) {
		this.driver=driver;
	}
	private By account=By.linkText("Account");
	public WebElement account() {
		return driver.findElement(account);
	}
	
}
