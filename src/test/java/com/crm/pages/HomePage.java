package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	// Step 1: Encapsulation = private data + public method
	private WebDriver driver;
	
	// Step 2: initialize above declared driver (using constructor)
	public HomePage(WebDriver drive) { // pass base class driver (drive)
		this.driver = drive;
	}
	
	// Step 3: data member (locator)
	private By linkk = By.linkText("Sign In");
	
	// Step 4: methods (functionality to test)
	public String getAppUrl() { //this method will return url
		return driver.getCurrentUrl(); 
	}
	public String getAppTitle() { //this willl return title of current page
		return driver.getTitle();
	}
	public String getStatusOfLink() { // this will click on link and return the url of that new page
		driver.findElement(linkk).click();
		return driver.getCurrentUrl();
	}
}
