package Sandhya.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	private By email=By.id("input-email");
	private By password=By.id("input-password");
	private By login=By.xpath("//input[@type=\"submit\"]");
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement login() {
		return driver.findElement(login);
	}
	
	}
