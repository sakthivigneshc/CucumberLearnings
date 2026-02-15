package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

     static WebDriver driver;

    @Given("User open the browser")
    public void userOpenTheBrowser1() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user navigates to login page")
    public void userNavigatesToLoginPage1() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters as standard_user and secret_sauce")
    public void userEntersAsStandardUserAndSecretSauce() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    
    @When("user enters as {string}  and {string}")
    public void userEntersAsAnd(String userName, String passWord) {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(passWord);
        driver.findElement(By.id("login-button")).click();
 	
    
    }

    @Then("we need to see home page")
    public void weNeedToSeeHomePage() {
        String actualUrl = driver.getCurrentUrl();
        try {

            Assert.assertEquals(actualUrl, "https://www.saucedemo.com/inventory.html",
                    "Login failed! Not navigated to inventory page.");
		} 

        finally {
            driver.quit();

		}
    }
    
    
    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions

    	WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
    	try {
    	Assert.assertEquals(errorMessage.getText(),"Epic sadface: Username and password do not match any user in this service");
    	}
        finally {
            driver.quit();

		}
    	
    }
    
    
}