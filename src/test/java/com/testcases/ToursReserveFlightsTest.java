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


public class ToursReserveFlightsTest extends Page{
  
	@Test(priority =3)
	public void reserveFlightsTest() throws Exception {
		System.out.println("------In reserveFlightsTest method");
		log.debug("------In reserveFlightsTest method");
		
		TourReserveFlightsPage reserveflights =new TourReserveFlightsPage();
		System.out.println("reserveFlights page is initiated");
		
		reserveflights.reserveFlights();
		System.out.println("flights is reserved");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), reserveflights.nextExpected);
		//test.log(LogStatus.INFO, "ToursSignon Test ended");
		log.debug("reserveFlightsTest ended");

	}

}