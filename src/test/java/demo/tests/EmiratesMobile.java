package demo.tests;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class EmiratesMobile {

	@Managed
	WebDriver driver;
	
	
	
	@Test
	public void launchEmiratesMSite() {
		driver.get("https://mobile.emirates.com/");
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
