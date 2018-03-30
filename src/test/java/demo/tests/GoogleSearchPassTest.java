package demo.tests;

import demo.requirements.Google;
import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@Story(Google.Search.SearchByKeyword.class)
public class GoogleSearchPassTest {

	@Before 
	 public void initialize() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\anirudha.patil\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    }
	
	@Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    GoogleSteps googleSteps;

    @Test
    public void googleSearchPassTest() {
        googleSteps.performSearch("42");
        googleSteps.findSearchResult("Stupidedia");
        googleSteps.verifyUrl("http://www.stupidedia.org/stupi/42");

    }
}