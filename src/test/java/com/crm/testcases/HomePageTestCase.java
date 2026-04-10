package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;

public class HomePageTestCase extends BaseClass {
  @Test(priority = 1)
  public void verifyUrl() {
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"), "Test fail: Url not matched!");
	  System.out.println("Test pass: Url matched!");
  }
  
  @Test(priority = 2)
  public void verifyTitle() {
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"), "Test fail: Title not matched!");
	  System.out.println("Test pass: Title matched!");
  }
  
  @Test(priority = 3)
  public void validateSignInLink() {
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"), "Test fail: new url not matching!(Login page not open)");
	  System.out.println("Test pass: new url matched!(Login page opened)");
  }
}
