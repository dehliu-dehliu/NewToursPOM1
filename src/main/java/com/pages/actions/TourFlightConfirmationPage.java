package com.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.TourFlightConfirmationPageLocators;

public class TourFlightConfirmationPage extends Page{

	public String nextExpected = "Your itinerary has been booked!";
        		//"Flight Confirmation: Mercury Tours";
		
	public TourFlightConfirmationPageLocators confirmflights;
	
	public TourFlightConfirmationPage() {
		this.confirmflights=new TourFlightConfirmationPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.confirmflights);
	}
	
	public String confirmBookFlights(){
		return confirmflights.confirmorder.getText();
	}


}