package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourReserveFlightsPageLocators {
	//Locate web element
		@FindBy(xpath="//input[@name='outFlight'][@value='Pangea Airlines$362$274$9:17']")
		public WebElement outflightselect;
		@FindBy(xpath="//input[@name='inFlight'][@value='Blue Skies Airlines$631$273$14:30']")
		public WebElement inflightselect;	
		@FindBy(name="reserveFlights")
		public WebElement reserveflightsbtn;
		@FindBy(xpath="//font[contains(text(),'Select your departure']")
		public WebElement selectdescription;

}
