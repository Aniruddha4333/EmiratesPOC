package demo.tests;

import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleLoginTest {

	
	 @Before 
	 public void initialize() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\anirudha.patil\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    }
	
	@Managed(driver = "chrome")
	WebDriver driver;

	@Steps
	GoogleSteps googleSteps;

	@Test
	public void performLogin() {
		googleSteps.clickOnSignIn();
		googleSteps.performLogin("google@gmail.com", "pass");
	}

}