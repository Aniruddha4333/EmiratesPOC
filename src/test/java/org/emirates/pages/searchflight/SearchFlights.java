package org.emirates.pages.searchflight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public abstract class SearchFlights extends PageObject {

	public SearchFlights(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[text()='Return']/parent::md-tab-item")
	private WebElement tabReturn;

	@FindBy(xpath = ".//*[text()='One way']/parent::md-tab-item")
	private WebElement tabOneWay;

	@FindBy(xpath = ".//*[contains(text(), 'Multi')]/parent::md-tab-item")
	private WebElement tabMultiCity;

	public Return selectTabReturn() {
		if (!(element(tabReturn).waitUntilEnabled().getAttribute("class").contains("active"))) {
			tabReturn.click();
		}
		return new Return(getDriver());
	}

	public OneWay selectTabOneWay() {
		if (!(element(tabOneWay).waitUntilEnabled().getAttribute("class").contains("active"))) {
			tabOneWay.click();
		}
		return new OneWay(getDriver());
	}

	public MultiCity selectTabMultiCity() {
		if (!(element(tabMultiCity).waitUntilEnabled().getAttribute("class").contains("active"))) {
			tabMultiCity.click();
		}
		return new MultiCity(getDriver());
	}
}
