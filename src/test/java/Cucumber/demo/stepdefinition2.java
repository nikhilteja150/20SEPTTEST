package Cucumber.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition2 {
int a,b,s,p;
@Given("^User must enter input value$")
public void user_must_enter_input_value() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("User enters the input");
	a=10;
	b=20;
	
}

@Then("^assign the values to variables a & b$")
public void assign_the_values_to_variables_a_b() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println(a+" "+b);
}

@When("^add two input$")
public void add_two_input() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	s=a+b;
}

@Then("^display the sum$")
public void display_the_sum() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Sum is "+s);
}

@When("^multiply the numbers$")
public void multiply_the_numbers() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	p=a*b;
}

@Then("^display the product$")
public void display_the_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Product is "+p);
}
}
