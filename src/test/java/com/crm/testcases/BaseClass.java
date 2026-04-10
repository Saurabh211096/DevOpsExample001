package com.crm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class BaseClass {
	public WebDriver drive;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeTest
	public void setup() {
		drive = new EdgeDriver();
		drive.get("https://automationplayground.com/crm/");
		
		hp = new HomePage(drive);
		lp = new LoginPage(drive);
	}
}
