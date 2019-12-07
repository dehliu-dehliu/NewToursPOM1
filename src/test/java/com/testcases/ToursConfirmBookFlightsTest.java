package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.TourBookFlightsPage;
import com.pages.actions.TourFindFlightsPage;
import com.pages.actions.TourFlightConfirmationPage;
import com.pages.actions.TourReserveFlightsPage;
import com.pages.actions.TourSignonPage;
import com.pages.actions.TourWelcomePage;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ToursConfirmBookFlightsTest extends Page{
	  
	@Test(priority =5)
	public void confirmBookFlightsTest() throws Exception {
		System.out.println("------In ConfirmBookFlightsTest method");
		log.debug("------In ConfirmBookFlightsTest method");
		
		TourFlightConfirmationPage confirmflights = new TourFlightConfirmationPage();
		System.out.println("ConfirmBookFlights page is initiated");
		
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(confirmflights.confirmBookFlights(), confirmflights.nextExpected);
		//test.log(LogStatus.INFO, "ToursSignon Test ended");
		log.debug("confirmBookFlightsTest ended");
	}

}
