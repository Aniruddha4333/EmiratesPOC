package org.emirates.pages.checkinonline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class MyTrips extends CheckinOnline {

	public MyTrips(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "userName")
	private WebElement email_address;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "olci_Login_login_loginButton")
	private WebElement btnLogin;
	
}
