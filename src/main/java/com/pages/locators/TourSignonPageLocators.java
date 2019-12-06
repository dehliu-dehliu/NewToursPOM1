package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourSignonPageLocators {
	
	//Locate web element
	@FindBy(name="userName")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement submitbtn;

}
