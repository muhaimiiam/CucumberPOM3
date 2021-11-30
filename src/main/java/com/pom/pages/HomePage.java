package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
	WebElement menuWoman;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	WebElement menuDress;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	WebElement menuTshirt;
	
	@FindBy(name="search_query")
	WebElement txtSearch;
	
	@FindBy(name="submit_search")
	WebElement btnSearch;
	
	By signOutBtn = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]");
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void signOut() {
		driver.findElement(signOutBtn).click();

	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();

	}
}
