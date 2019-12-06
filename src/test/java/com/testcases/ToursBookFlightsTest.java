package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.TourBookFlightsPage;
import com.pages.actions.TourFindFlightsPage;
import com.pages.actions.TourReserveFlightsPage;
import com.pages.actions.TourSignonPage;
import com.pages.actions.TourWelcomePage;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ToursBookFlightsTest extends Page{
	  
	@Test(priority =4)
	public void  bookFlightsTest() throws Exception {
		System.out.println("------In bookFlightsTest method");
		log.debug("------In bookFlightsTest method");

		TourBookFlightsPage bookflights =new TourBookFlightsPage();
		System.out.println("bookFlights page is initiated");

		bookflights.orderFlightsSameBillAddress ("fname","lname","American Express","1234098723458765",10,"2000",
				  "bfname","blname","111 test road","unit101", "New York","Washington", "109872");
		System.out.println("flights is booked");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), bookflights.nextExpected);
		//test.log(LogStatus.INFO, "ToursSignon Test ended");
		log.debug("findFlightsTest ended");
	}

}
