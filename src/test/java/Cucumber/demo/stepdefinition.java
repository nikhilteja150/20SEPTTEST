package Cucumber.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	
String str;
@Given("^type hello world$")
public void inputMethod() throws Throwable {
	str="hello world";
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^execute the code$")
public void displayMethod() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(str);
    //throw new PendingException();
}

@Then("^hello world must be displayed in the console$")
public void postCondition() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("displayed");
	//throw new PendingException();
}


}
