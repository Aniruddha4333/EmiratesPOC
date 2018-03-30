package org.emirates.pages.checkinonline;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.google.gson.JsonIOException;
//import com.google.gson.JsonParser;
//import com.google.gson.JsonSyntaxException;

import net.serenitybdd.core.annotations.findby.FindBy;

public class RetriveBooking extends CheckinOnline {

	public RetriveBooking(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "lastName")
	private WebElement last_name;

	@FindBy(id = "bookingRef")
	private WebElement booking_reference;

	@FindBy(id = "olci_Login_submitBtn")
	private WebElement btnRetriveBooking;

	@FindBy(css = ".d-cell.va-m")
	private WebElement errormsg;

	String actual_errormsg = "Sorry, we were unable to retrieve your booking. Please check all the information you have entered and try again.";

	public SelectPax clickRetriveBooking(String strLastName, String strBookingRef)  {
		
		last_name.sendKeys(strLastName);
		booking_reference.sendKeys(strBookingRef);
		btnRetriveBooking.click();
		String expected_errormsg = errormsg.getText();
		Assert.assertEquals(actual_errormsg, expected_errormsg);
		return new SelectPax(getDriver());
	}
	
	public SelectPax clickRetriveBooking2()
	{
		String lastName= RandomStringUtils.randomAlphabetic(4);
		String bookingReference= RandomStringUtils.randomAlphanumeric(6);
		last_name.sendKeys(lastName);
		booking_reference.sendKeys(bookingReference);
		btnRetriveBooking.click();
		return new SelectPax(getDriver());
	}
	
	public SelectPax clickRetriveBooking3() throws FileNotFoundException, IOException, ParseException 
	{
		String name="";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("D://susmitakulkarni//workspace//susmitakulkarni_assignments//EmiratesPOC//src//test//resources//checkinOnlineData.json"));
		
		JSONArray jsonObject = (JSONArray) obj;
		name= jsonObject.get(0).toString();
		System.out.println(name);
	
		last_name.sendKeys(name);
		booking_reference.sendKeys("abc123");
		btnRetriveBooking.click();
		return new SelectPax(getDriver());
	}
	
}
