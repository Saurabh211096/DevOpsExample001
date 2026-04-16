package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.utility.Utility;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver drive) {
		this.driver = drive;
	}
	
	private By email = By.id("email-id");
	private By pass = By.name("password-name");
	private By btn = By.name("submit-name");
	
	public String doLogin(String em, String ps) {
		driver.findElement(email).sendKeys(em);
		driver.findElement(pass).sendKeys(ps);
		driver.findElement(btn).click();
		Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
}
