package com.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.TourReserveFlightsPageLocators;
import com.utilities.Screenshot;

public class TourReserveFlightsPage extends Page {

	public String nextExpected = "Book a Flight: Mercury Tours ---";
		
	public TourReserveFlightsPageLocators reserveflights;
	
	public TourReserveFlightsPage() {
		this.reserveflights=new TourReserveFlightsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.reserveflights);
	}
	
	//create a method
	public void reserveFlights() {
		reserveflights.outflightselect.click();
		reserveflights.inflightselect.click();
	
	try {
		  Screenshot.takeScreenshot(driver, "reserveFlights");
	  } catch (IOException ioe) {
		  System.out.println("Exception to take screenshot: ioe");
	  }
	
	reserveflights.reserveflightsbtn.click();
	System.out.println("Reserve is submitted");
	  
	}
}
