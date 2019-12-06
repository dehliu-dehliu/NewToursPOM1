package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.TourSignonPage;
import com.pages.actions.TourWelcomePage;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.Screenshot;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ToursSignonTest extends Page{

	  @BeforeTest
	  public void setUp(){
		  System.out.println("------In setUp method");
		  
		  Page.initConfiguration();
		  log.debug("------In setUp method");
		  System.out.println("init conf is done");
	  }
	  
	
	@Test(priority =1)
	public void signOnTest() throws Exception {
		System.out.println("------In signOnTest method");
		log.debug("------In signOnTest method");
		
		TourWelcomePage welcome=new TourWelcomePage();
		System.out.println("Welcome page is initiated");
		TourSignonPage signon=new TourSignonPage();
		System.out.println("Signon page is initiated");
		
	  	welcome.goSignOn();
		//test.log(LogStatus.INFO, "ToursSignon Test started");
		signon.doLogin("tutorial", "tutorial");
		System.out.println("login submitted");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), signon.nextExpected);
		//test.log(LogStatus.INFO, "ToursSignon Test ended");
		log.debug("ToursSignon Test ended");

	}


  @AfterTest
  public void tearDown() throws Exception{
	  System.out.println("------In tearDown method");
	  log.debug("------In tearDown method");
	  Screenshot.takeScreenshot(driver, "FinishUp"); 
	  Page.quitBrowser();
  }

}
