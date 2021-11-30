package com.pom.stepDef;

import com.pom.pages.RegistrationPage;
import com.pom.util.TestBase;

import io.cucumber.java.en.Then;

public class RegistrationSteps extends TestBase {
	
	RegistrationPage regPage = new RegistrationPage();
	
	@Then("user enter email (.*)$")
	public void user_enter_email(String email) {
		regPage.submitEmail(email);
		System.out.println("User email is valid");
	}

	@Then("user is directed to the registration page")
	public void user_is_directed_to_the_registration_page() {
		System.out.println("User is on Registration page");
	    
	}

	@Then("user fill personal information (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*)$")
	public void user_fill_personal_information(String cusFM, String cusLN, String password, String company, String address1, String address2,
			String city, String postcode, String addinfo, String homePhone, String mobilePhone) {
		regPage.Registration(cusFM, cusLN, password, company, address1, address2, city, postcode, addinfo, homePhone, mobilePhone);
		System.out.println("User submit personal information");

	}

	@Then("user is successfully registered")
	public void user_is_successfully_registered() {
		System.out.println("Registration is successfully");
	    
	}



}
