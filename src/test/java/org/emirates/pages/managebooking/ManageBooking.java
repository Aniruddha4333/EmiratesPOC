package org.emirates.pages.managebooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public abstract class ManageBooking extends PageObject{
	public ManageBooking (WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "booking_manual")
	private WebElement retrieveTab;
	
	@FindBy(id = "booking_myaccount")
	private WebElement myTripsTab;
	
	
	public RetrieveBooking selectRetrieveTab() {
		if(!(retrieveTab.getAttribute("class").contains("active")));
		{
			
			retrieveTab.click();
		}
		return new RetrieveBooking(getDriver());
	}
	
	
	public MyTrips selectMyTripsTab() {
		if(!(myTripsTab.getAttribute("class").contains("active")));
		{
			myTripsTab.click();
		}
		return new MyTrips(getDriver());
	}
}
