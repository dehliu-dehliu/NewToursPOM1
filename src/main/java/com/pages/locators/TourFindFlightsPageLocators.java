package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourFindFlightsPageLocators {
	//Locate web element
		@FindBy(xpath="//input[@name='tripType'][@value='roundtrip']")
		public WebElement roundtrip;
		@FindBy(xpath="//input[@name='tripType'][@value='oneway']")
		public WebElement onewaytrip;
		
		@FindBy(name="passCount")
		public WebElement passengernum;
		@FindBy(name="fromPort")
		public WebElement fromport;	
		@FindBy(name="fromMonth")
		public WebElement frommonth;
		@FindBy(name="fromDay")
		public WebElement fromday;
		@FindBy(name="toPort")
		public WebElement toport;
		@FindBy(name="toMonth")
		public WebElement tomonth;
		@FindBy(name="toDay")
		public WebElement today;
		
		@FindBy(xpath="//input[@name='servClass'][@value='Coach']")
		public WebElement economyclass;
		@FindBy(xpath="//input[@name='servClass'][@value='Business']")
		public WebElement businessclass;
		@FindBy(xpath="//input[@name='servClass'][@value='First']")
		public WebElement firstclass;
		
		@FindBy(name="airline")
		public WebElement airline;
		@FindBy(xpath="//input[@name='findFlights']")
		public WebElement findflightsbtn;

}
