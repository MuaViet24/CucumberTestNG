package com.test.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNGDemo {
	
	@Given("^user is on home page$")
	public void user_is_on_home_page(){
		System.out.println("user is on home page");
		
	}
	
	@When("^user enters credentials$")
	public void user_enters_credentials(){
		System.out.println("user enters credentials");
	}
	
	@Then("^user login to application$")
	public void user_login_to_application(){
		System.out.println("user login to application");
	}

}
