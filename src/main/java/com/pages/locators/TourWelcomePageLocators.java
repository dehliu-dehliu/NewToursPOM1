package com.pages.locators;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourWelcomePageLocators {
	
	
	//Locate web element
	@FindBy(tagName = "a")
	public List<WebElement> links;
	
	@FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
	public WebElement signonlink;

}
