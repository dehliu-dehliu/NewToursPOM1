package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.TourFindFlightsPage;
import com.pages.actions.TourSignonPage;
import com.pages.actions.TourWelcomePage;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ToursFindFlightsTest extends Page{
  
	@Test(priority =3)
	public void findFlightsTest() throws Exception {
		System.out.println("------In findFlightsTest method");
		log.debug("------In findFlightsTest method");

		TourFindFlightsPage findflights =new TourFindFlightsPage();
		System.out.println("findFlights page is initiated");
		
		findflights.selectfindAvailableFlights("roundtrip", "1", "Frankfurt", "11", "28",
				"London", "12", "16", "business", "Blue Skies Airlines");
		System.out.println("flights criteria is submitted");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), findflights.nextExpected);
		//test.log(LogStatus.INFO, "ToursSignon Test ended");
		log.debug("findFlightsTest ended");

	}

}
