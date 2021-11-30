package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.pom.util.TestBase;

public class LoginPage extends TestBase {
	
	By signInLink = By.xpath("//a[contains(text(),'Sign in')]");
	By imageLogo = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By txtEmail = By.xpath("//input[@id='email']");
	By txtPassword = By.name("passwd");
	By btnSubmit = By.name("SubmitLogin");
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() {
		driver.findElement(signInLink).click();

	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}
	
	public boolean validateLoginImage() {
		return driver.findElement(imageLogo).isDisplayed();

	}
	
	public HomePage login (String username, String password) {
		
		driver.findElement(txtEmail).sendKeys(username);
		driver.findElement(txtPassword).sendKeys(password);
		driver.findElement(btnSubmit).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0]", btnSubmit);
		
		return new HomePage();
	}

}
