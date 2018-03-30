package org.emirates.pages;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.emirates.pages.searchflight.Return;
import org.emirates.pages.searchflight.SearchFlights;
import org.emirates.pages.checkinonline.CheckinOnline;
import org.emirates.pages.checkinonline.RetriveBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.emirates.pages.managebooking.ManageBooking;
// import org.emirates.pages.managebooking.MyTrips;
import org.emirates.pages.managebooking.RetrieveBooking;



public class HomePage extends PageObject {

	Return searchFlightsReturn;

	public HomePage(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(id = "hom_hom_bookFlt")
	private WebElement bookFlight;

	
	@FindBy(id="hom_hom_olci")
	private WebElement checkin;
	public CheckinOnline clickOnCheckinOnline(){
		element(checkin).waitUntilEnabled();
		checkin.click();
		return new RetriveBooking(getDriver());
	}


	

	



	public SearchFlights clickOnBookFlight() {

		element(bookFlight).isCurrentlyVisible();
		assertThat("home page", bookFlight.isDisplayed(), is(true));
		bookFlight.click();
		return new Return(getDriver());
	}


	@FindBy(id = "hom_hom_mngBk")
    private WebElement ManageBookingOnline;

	public ManageBooking clickManageBooking() {
		element(ManageBookingOnline).isCurrentlyVisible();
		assertThat("manage booking", ManageBookingOnline.isDisplayed(), is(true));
		ManageBookingOnline.click();
		return new RetrieveBooking(getDriver());
	}


}
