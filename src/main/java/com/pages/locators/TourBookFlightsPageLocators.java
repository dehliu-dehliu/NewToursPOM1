package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourBookFlightsPageLocators {
	//Locate web element
		@FindBy(xpath="//font[contains(text(),'Summary')]")
		public WebElement reservesummary;
		
		@FindBy(name="passFirst0")
		public WebElement firstname1;
		@FindBy(name="passLast0")
		public WebElement lastname1;
		@FindBy(name="pass.0.meal")
		public WebElement meal1;
		
		@FindBy(name="creditCard")
		public WebElement creditcard;
		@FindBy(name="creditnumber")
		public WebElement creditnumber;
		@FindBy(name="cc_exp_dt_mn")
		public WebElement expirymonth;
		@FindBy(name="cc_exp_dt_yr")
		public WebElement expiryyear;
		@FindBy(xpath ="//input[@name='cc_frst_name']")
		public WebElement billfirstname;
		@FindBy(xpath="//input[@name='cc_mid_name']")
		public WebElement billmidname;
		@FindBy(xpath="//input[@name='cc_last_name']")
		public WebElement billlastname;
		
		@FindBy(xpath ="//font[contains(text(),'Ticketless Travel')]")
		public WebElement ticketlesscheck;
		
		@FindBy(name="billAddress1")
		public WebElement billaddress1;
		@FindBy(name="billAddress2")
		public WebElement billaddress2;
		@FindBy(name="billCity")
		public WebElement billcity;
		@FindBy(name="billState")
		public WebElement billstate;
		@FindBy(name="billZip")
		public WebElement billzip;
		
		@FindBy(xpath ="//font[contains(text(),'Same as Billing Address')]")
		public WebElement sameasbillcheck;
		
		@FindBy(name="delAddress1")
		public WebElement deladdress1;
		@FindBy(name="delAddress2")
		public WebElement deladdress2;
		@FindBy(name="delCity")
		public WebElement delcity;
		@FindBy(name="delState")
		public WebElement delstate;
		@FindBy(name="delZip")
		public WebElement delzip;
		
		@FindBy(name="buyFlights")
		public WebElement buyflightsbtn;
		

}
