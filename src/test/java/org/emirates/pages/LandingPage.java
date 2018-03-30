package org.emirates.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

//@DefaultUrl("https://mobile1.emirates.com")
public class LandingPage extends PageObject {

	public LandingPage(WebDriver driver) {
		super(driver);
	}


	
	@FindBy(id="geoLocation")
	private WebElement countryLanguage;
	
	public HomePage selectCountryLanguage() {
		element(countryLanguage).waitUntilEnabled().clear();
		countryLanguage.sendKeys("Global-English");
		countryLanguage.submit();
		return new HomePage(getDriver());
	}

}
