package org.emirates.pages.checkinonline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public abstract class CheckinOnline extends PageObject {

	public CheckinOnline(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "booking_manual")
	private WebElement tabRetrive;

	@FindBy(id = "booking_myaccount")
	private WebElement tabMyTrips;

	public RetriveBooking selectTabRetrive() {
		System.out.println("in retrive booking");
		if ((tabRetrive.getAttribute("class").contains("not-active"))) {
			tabRetrive.click();
		}
		return new RetriveBooking(getDriver());
	}

	public MyTrips selectTabMyTrips() {
		System.out.println("in mytrips");
		if ((tabMyTrips.getAttribute("class").contains("not-active"))) {
			tabMyTrips.click();
		}

		return new MyTrips(getDriver());

	}

}
