package org.emirates.pages.managebooking;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class RetrieveBooking extends ManageBooking {

	public RetrieveBooking(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "lastName")
	private WebElement LastNameField;

	@FindBy(id = "bookingRef")
	private WebElement BookingRefField;

	@FindBy(id = "myb_Login_submitBtn")
	private WebElement RetrieveBookBtn;

	@FindBy(css = ".d-cell:first-child")
	private WebElement VerifyMsg;

	/*
	  public EnterValue enterData(String strLastName, String strBookingRef) {
	  LastNameField.sendKeys(strLastName);
	  BookingRefField.sendKeys(strBookingRef); RetrieveBookBtn.click(); return
	  new EnterValue(getDriver()); }
	 */

	public EnterValue enterData() {
		String name = RandomStringUtils.randomAlphabetic(5);
		String number = RandomStringUtils.randomAlphanumeric(6);
		LastNameField.sendKeys(name);
		BookingRefField.sendKeys(number);
		RetrieveBookBtn.click();

		String actualMsg = VerifyMsg.getText();
		String errorMsg = "Sorry, we were unable to find your booking. Please check all the information you've entered and try again.";

		Assert.assertEquals(actualMsg, errorMsg);

		return new EnterValue(getDriver());

	}
}

// @Test
// public void RetrieveBooking() throws Exception {

// }

// Assert.assertTrue("Sorry, we were unable to find your booking. Please check
// all the information you've entered and try again.",
// errorMsg.contains(actualMsg));

/*
  if(actualMsg.contains(errorMsg)) {
  System.out.println("Error msg display is verified"); }else {
   System.out.println("Error msg display verification failed"); }
 */
