package com.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Page;
import com.pages.locators.TourBookFlightsPageLocators;
import com.pages.locators.TourReserveFlightsPageLocators;
import com.utilities.Screenshot;

public class TourBookFlightsPage extends Page{

	public String nextExpected = "Flight Confirmation: Mercury Tours";
	
	public TourBookFlightsPageLocators bookflights;
	
	public TourBookFlightsPage() {
		this.bookflights=new TourBookFlightsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.bookflights);
	}
		
	//create a method
	public void orderFlightsSameBillAddress(String myfirstname, String mylastname,
			String mycreditcard, String mycreditnumber, int myexpirymonth, String myexpiryyear, 
			String mybillfirstname, String mybilllastname,
			String mybilladdress1, String mybilladdress2, String mybillcity, String mybillstate, String mybillzip) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(bookflights.reservesummary));
		
		bookflights.firstname1.sendKeys(myfirstname);
		bookflights.lastname1.sendKeys(mylastname);
//		meal1.sendKeys(my);
		Select creditcards = new Select(bookflights.creditcard);
		creditcards.selectByVisibleText(mycreditcard);
		bookflights.creditnumber.sendKeys(mycreditnumber);

		Select expirymonths = new Select(bookflights.expirymonth);
			expirymonths.selectByIndex(myexpirymonth);

		Select expiryyears = new Select(bookflights.expiryyear);
			expiryyears.selectByVisibleText(myexpiryyear);
		
			bookflights.billfirstname.sendKeys(mybillfirstname);
//		billmidname.sendKeys(mybillmidname);
			bookflights.billlastname.sendKeys(mybilllastname);
//		ticketlesscheck.click();
			bookflights.billaddress1.sendKeys(mybilladdress1);
			bookflights.billaddress2.sendKeys(mybilladdress2);
			bookflights.billcity.sendKeys(mybillcity);
			bookflights.billstate.sendKeys(mybillstate);
			bookflights.billzip.sendKeys(mybillzip);
			bookflights.sameasbillcheck.click();
		
		try {
			Screenshot.takeScreenshot(driver, "OrderInfo");
		} catch (IOException ioe) {
			System.out.println("Exception to take screenshot: ioe");
		}
	
		bookflights.buyflightsbtn.click();
		System.out.println("Purchase is submitted");
	  
	}

}
