package org.emirates.pages.searchflight;

import java.util.Map;

import org.emirates.util.JavaUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class Return extends SearchFlights {
	public Return(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "departureReturnOne")
	private WebElement fromTextbox;

	@FindBy(id = "autocompleteId_fromCity")
	private WebElement fromSearchTextbox;

	@FindBy(name = "arrivalReturnOne")
	private WebElement toTextbox;

	@FindBy(id = "autocompleteId_toCity")
	private WebElement toSearchTextbox;

	@FindBy(css = ".cityList_fromCity .autocomplete-city-airport-details-city")
	private WebElement searchedFromCityName;

	@FindBy(css = ".cityList_toCity .autocomplete-city-airport-details-city")
	private WebElement searchedToCityName;

	@FindBy(name = "return-date-btn")
	private WebElement selectDatesButton;

	@FindBy(id = "procdBtn")
	private WebElement searchResultsButton;

	public BrandedSearch searchReturnFlight(String fromCity, String toCity, String fromDate, String toDate) {
		// Select From Flight
		element(fromTextbox).waitUntilEnabled().click();
		element(fromSearchTextbox).waitUntilEnabled().sendKeys(fromCity);
		element(searchedFromCityName).click();

		// Select To Flight
		element(toTextbox).waitUntilEnabled().click();
		element(toSearchTextbox).waitUntilEnabled().sendKeys(toCity);
		element(searchedToCityName).click();

		// Select InBound Date
		element(selectDatesButton).waitUntilEnabled().click();
		Map<String, String> fromDatesMap = JavaUtils.calenderPicker(fromDate);
		System.out.println("//*[@data-month='" + fromDatesMap.get("Month") + "' and @data-year='"
				+ fromDatesMap.get("Year") + "']/a[text()='" + fromDatesMap.get("Day") + "']");
		element(By.xpath("//*[@data-month='" + fromDatesMap.get("Month") + "' and @data-year='"
				+ fromDatesMap.get("Year") + "']/a[text()='" + fromDatesMap.get("Day") + "']")).waitUntilEnabled()
						.click();

		// Select OutBound Date
		Map<String, String> toDatesMap = JavaUtils.calenderPicker(toDate);
		System.out.println("//*[@data-month='" + toDatesMap.get("Month") + "' and @data-year='" + toDatesMap.get("Year")
				+ "']/a[text()='" + toDatesMap.get("Day") + "']");
		element(By.xpath("//*[@data-month='" + toDatesMap.get("Month") + "' and @data-year='" + toDatesMap.get("Year")
				+ "']/a[text()='" + toDatesMap.get("Day") + "']")).waitUntilEnabled().click();

		// Go to Branded Search Results Page
		element(searchResultsButton).waitUntilEnabled().click();
		return new BrandedSearch(getDriver());
	}
}
