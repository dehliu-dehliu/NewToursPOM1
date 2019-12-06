package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourFlightConfirmationPageLocators {
	//Locate web element
		@FindBy(xpath="//font[contains(text(),'itinerary has been booked!')]")
		public WebElement confirmorder;

}
