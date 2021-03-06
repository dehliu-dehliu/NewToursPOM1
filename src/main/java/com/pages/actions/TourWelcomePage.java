package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.TourWelcomePageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class TourWelcomePage extends Page {

	public TourWelcomePageLocators welcome;
	public String expected = "Welcome: Mercury Tours";
	
	public TourWelcomePage() {
		this.welcome=new TourWelcomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.welcome);
	}
	
	public void linkCount() {
		 
		System.out.println("-- In linkAccount method");
		  
		  int i =welcome.links.size();
		  System.out.println("Totle links on the NewTours Home page is "+i);
		  //test.log(LogStatus.INFO, "Totle links on the NewTours Home page is "+i); 
		  //log.debug("Totle links on the NewTours Home page is "+i);

		  for (int j=0; j<i; j++){

				//Print out all links
				System.out.println("Link"+(j+1)+" for: "+welcome.links.get(j).getText() 
						+ " ------ "+welcome.links.get(j).getAttribute("href"));
				//test.log(LogStatus.INFO, "Link "+(j+1)+": "+link); 
				//log.debug("Link "+(j+1)+": "+link);
				//Navigate to each of the links

//				driver.navigate().to(link);
		  }
	}
	
	public void goSignOn(){
		welcome.signonlink.click();
		System.out.println("SignOn button is clicked");
		//test.log(LogStatus.INFO, "SignOn button is clicked"); 
		//log.debug("SignOn button is clicked");
	}
}
