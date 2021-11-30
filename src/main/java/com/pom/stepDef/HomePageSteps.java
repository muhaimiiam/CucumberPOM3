package com.pom.stepDef;

import com.pom.pages.HomePage;
import com.pom.pages.LoginPage;
import com.pom.util.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePageSteps extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Before
	public void browserSetup() {
		System.out.println("Hook Before: Opening browser ");
		TestBase.initialization();
	}
	
	@After
	public void tearDown() {
		System.out.println("Hook After: Closing driver");
		TestBase.closeDriver();
	}
	
	@Given("user is on Ecommerce website")
	public void user_is_on_ecommerce_website() {
		System.out.println("User is on webpage");
	}
	
	@When("user click on sign in button")
	public void user_click_on_sign_in_() {
		System.out.println("User click on Sign in button");
		loginPage.clickOnSignIn();

	}

	@Then("user is directed to login page")
	public void user_is_directed_to_login_page() {
		System.out.println("Login page is displayed");
		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals("Login - My Store", title);
	    
	}
	
	
//	Taking username and password from config file
	
//	@When("user enter username and password")
//	public void user_enter_username_and_password() {
//		System.out.println("User enter username and password");
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
	
//	Taking username and password from feature file
	
	@When("user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		System.out.println("User enter username and password");
		homePage = loginPage.login(username, password);
	}
	
//	Fill manually
	
//	@When("user enter username and password")
//	public void user_enter_username_and_password() {
//		System.out.println("User enter username and password");
//		homePage = loginPage.login("test@gmail.com", "test123");
//	}

	@Then("user is directed to homepage")
	public void user_is_directed_to_homepage() {
		System.out.println("Homepage is displayed");
	    String homeTitle = homePage.verifyHomePageTitle();
	    Assert.assertEquals("My account - My Store", homeTitle);
	    
	    boolean flag = homePage.verifyCorrectUserName();
	    Assert.assertTrue(flag);
	}
	
	@When("user click on sign out button")
	public void user_click_on_sign_out_button() {
		homePage.signOut();
	}
	
	@Then ("user is logout")
	public void user_is_logout() {
		System.out.println("User is logout");
	}

}
