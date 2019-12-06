package com.pages.actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Page;
import com.pages.locators.TourFindFlightsPageLocators;
import com.pages.locators.TourSignonPageLocators;

import com.utilities.Screenshot;

public class TourFindFlightsPage extends Page{

	public String nextExpected = "Select a Flight: Mercury Tours"; 
		
	public TourFindFlightsPageLocators findflights;
	public TourFindFlightsPage() {
		this.findflights=new TourFindFlightsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.findflights);
	}
	
	
	//create a method
	public void selectfindAvailableFlights(String tripType, String mycount, 
			String myfromport, String myfrommonth, String myfromday,
			String mytoport, String mytomonth, String mytoday, 
			String myserviceclass, String myairline) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(findflights.findflightsbtn));

		if (tripType.equals("roundtrip")) {
			findflights.roundtrip.click();
		} else {
			findflights.onewaytrip.click();
		} 	
	  
	  	Select passengerNum = new Select(findflights.passengernum);
	  	passengerNum.selectByValue(mycount);
	  
		Select fromPort = new Select(findflights.fromport);
		fromPort.selectByValue(myfromport);

		Select fromMonth = new Select(findflights.frommonth);
		fromMonth.selectByValue(myfrommonth);

		Select fromDay = new Select(findflights.fromday);
		fromDay.selectByValue(myfromday);

		Select toPort = new Select(findflights.toport);
		toPort.selectByValue(mytoport);

		Select toMonth = new Select(findflights.tomonth);
		toMonth.selectByValue(mytomonth);

		Select toDay = new Select(findflights.today);
		toDay.selectByValue(mytoday);
		
		Select airlines = new Select(findflights.airline);
		airlines.selectByVisibleText(myairline);
		
		if (myserviceclass.equals("first")) {
			findflights.firstclass.click();
		} else if (tripType.equals("business")) {
			findflights.businessclass.click();
		} else {
			findflights.economyclass.click();
		}
	  
		Screenshot.takeScreenshot(driver, "FinfFlights"); 
		findflights.findflightsbtn.click();
		System.out.println("The flight search criteria submitted");
		log.debug("The flight search criteria submitted");
	
	}	
}
