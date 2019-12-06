package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Page;
import com.pages.locators.TourSignonPageLocators;
import com.utilities.Screenshot;
import com.utilities.Utilities;


public class TourSignonPage extends Page{
	public String nextExpected = "Find a Flight: Mercury Tours:";
	public TourSignonPageLocators signon;
	public TourSignonPage() {
		this.signon=new TourSignonPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signon);
	}
	
	//create a method
	public void doLogin(String myusername, String mypassword) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(signon.submitbtn));
		signon.username.sendKeys(myusername);
		signon.password.sendKeys(mypassword);
		//Utilities.captureScreenshot();
		Screenshot.takeScreenshot(driver, "TourSignon"); 
		signon.submitbtn.click();
	}	

}
