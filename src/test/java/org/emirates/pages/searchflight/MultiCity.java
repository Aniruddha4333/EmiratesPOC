package org.emirates.pages.searchflight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MultiCity extends SearchFlights {
	public MultiCity(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[text()='Multi city']/parent::md-tab-item")
	private WebElement searchFlightMultiCity;

	@FindBy(xpath = "md-tab-item[contains(@class, 'md-active')]")
	private WebElement searchFlightMultiCityStatus;

}
