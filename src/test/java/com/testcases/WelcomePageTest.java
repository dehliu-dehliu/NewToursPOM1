package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.TourSignonPage;
import com.pages.actions.TourWelcomePage;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class WelcomePageTest extends Page{
	
	  @Test
	  public void welcomePageLinks() {
		  System.out.println("------welcome page link test starts");
		  //test.log(LogStatus.INFO, "------welcome page link test starts");
		  log.debug("------In welcomePageLinks method");
		  //Page.initConfiguration();
		  //System.out.println("init conf is done");
		  TourWelcomePage welcome=new TourWelcomePage();
		  System.out.println("Welcome page is initiated");
		  welcome.linkCount();
		  System.out.println("done link count");
		  Assert.assertEquals(driver.getTitle(), welcome.expected);
		  System.out.println("------welcome page link test ends");
		  //test.log(LogStatus.INFO, "------welcome page link test ends");
		  log.debug("------welcome page link test ends");

	  }

}
