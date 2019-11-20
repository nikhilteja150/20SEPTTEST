package Cucumber.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class selintegtnstepdefn {
	WebDriver driver;
	@Given("^User has launched testme app in the browser$")
	public void user_has_launched_testme_app_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver=UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("^user must be logged in successfully$")
	public void user_must_be_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("Home", driver.getTitle());
		driver.close();
		
	}
}
