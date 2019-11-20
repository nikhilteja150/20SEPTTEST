package Cucumber.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver;

	@Given("^user must be on the login page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters the valid credentials$")
	public void user_enter_the_valid_credentials() throws Throwable {
		Pages page = new Pages(driver);
		page.do_login("tutorial", "tutorial");
	}
	@Then("^user must be in homepage$")
	public void user_must_be_in_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
}
