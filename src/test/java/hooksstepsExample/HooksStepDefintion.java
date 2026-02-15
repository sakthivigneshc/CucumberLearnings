package hooksstepsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefintion {
	
	WebDriver driver = new ChromeDriver() ;
	
	@Given("user navigates to login page")
	public void userNavigatesToLoginPage() {
		driver.get("https://google.com");
	}
	@When("user enters as standard_user and secret_sauce")
	public void userEntersAsStandardUserAndSecretSauce() {
		System.out.println("Nothing to enters.......");
		
	}
	@Then("we need to see home page")
	public void weNeedToSeeHomePage() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.google.com/");
	}

}
