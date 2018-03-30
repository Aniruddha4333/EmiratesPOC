package org.emirates.steps;

import org.emirates.pages.HomePage;
import org.emirates.pages.LandingPage;
import org.emirates.pages.searchflight.MultiCity;
import org.emirates.pages.searchflight.OneWay;
import org.emirates.pages.searchflight.Return;
import org.emirates.pages.searchflight.SearchFlights;
import org.emirates.pages.checkinonline.CheckinOnline;
import org.emirates.pages.checkinonline.MyTrips;
import org.emirates.pages.checkinonline.RetriveBooking;
import org.emirates.pages.managebooking.ManageBooking;
import org.emirates.pages.managebooking.RetrieveBooking;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class Navigations extends ScenarioSteps {


	static boolean first = true;// true for the 1st time as to select the language on landing page

	HomePage homepage;
	SearchFlights searchFlight;
	CheckinOnline checkinOnline;

	public LandingPage landingPage() {
		return getPages().currentPageAt(LandingPage.class);
	}

	public HomePage gotoHome() {

		if (first) {
			// first = false;
			return selectCountryLanguage();
		}

		else
			getDriver().get(getPages().getDefaultBaseUrl());
		return getPages().currentPageAt(HomePage.class);
	}

	@Step
	public HomePage selectCountryLanguage() {
		 return landingPage().selectCountryLanguage();
	}

	@Step
	public SearchFlights bookFlight() {

		return gotoHome().clickOnBookFlight();
	}

	@Step
	public CheckinOnline onlineCheckin() {
		return gotoHome().clickOnCheckinOnline();

	}

	@Step
	public RetriveBooking gotoRetriveBooking() {
		return onlineCheckin().selectTabRetrive();
	}

	@Step
	public MyTrips gotoMyTrips() {
		return onlineCheckin().selectTabMyTrips();

	}

	@Step
	public Return goToReturn() {

		return bookFlight().selectTabReturn();
	}

	@Step
	public OneWay goToOneWay() {

		return bookFlight().selectTabOneWay();
	}

	@Step
	public MultiCity goToMultiCity() {

		return bookFlight().selectTabMultiCity();
	}

	@Step
	public ManageBooking ManageBookingOnline() {

		return gotoHome().clickManageBooking();
	}

	@Step
	public RetrieveBooking gotoRetrieveBooking() {

		return ManageBookingOnline().selectRetrieveTab();
	}

	@Step
	public  org.emirates.pages.managebooking.MyTrips gotoMyTripsMB() {

		return ManageBookingOnline().selectMyTripsTab();
	}
	
	public void deleteMeKirti() {
		
	}
}
