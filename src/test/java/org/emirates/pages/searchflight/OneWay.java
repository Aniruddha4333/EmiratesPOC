package org.emirates.pages.searchflight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class OneWay extends SearchFlights {
	public OneWay(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[text()='One way']/parent::md-tab-item")
	private WebElement searchFlightOneWay;

	@FindBy(xpath = "md-tab-item[contains(@class, 'md-active')]")
	private WebElement searchFlightOneWayClass;

}
