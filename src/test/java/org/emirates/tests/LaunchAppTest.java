package org.emirates.tests;

import org.emirates.pages.searchflight.BrandedSearch;
import org.emirates.pages.searchflight.MultiCity;
import org.emirates.pages.searchflight.OneWay;
import org.emirates.pages.searchflight.Return;
import org.emirates.pages.managebooking.MyTrips;
import org.emirates.pages.managebooking.RetrieveBooking;
import org.emirates.pages.managebooking.EnterValue;
import org.emirates.steps.Navigations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LaunchAppTest {




	@Managed
	WebDriver driver;

	@Steps
	Navigations navigation;

	@Test
	public void testRunTab() {
		BrandedSearch brandedSearch = navigation.goToReturn().searchReturnFlight("Mumbai", "Singapore", "2018-04-30",
				"2018-06-25");
	}

	/*@Test
	public void testOneWayTab() {
		OneWay oneWay = navigation.goToOneWay();
	}

	@Test
	public void testMulticityTab() {
		MultiCity multiCity = navigation.goToMultiCity();
	}*/

	public void sampleTest() {

		// SearchFlights search = navigation.bookFlight();
		// ManageBooking search = navigation.ManageBookingOnline();

		// EnterValue retrieve =
		// navigation.gotoRetrieveBooking().enterData("Cyrus", "123456");
		EnterValue retrieve = navigation.gotoRetrieveBooking().enterData();

		// navigation.flow2();
	}

	/*
	  @Test public void sampleTest2() {
	   // MyTrips trip = navigation.gotoMyTrips(); }
	 */

}
