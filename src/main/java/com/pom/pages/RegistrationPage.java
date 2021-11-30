package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pom.util.TestBase;

public class RegistrationPage extends TestBase {
	
	By txtEmail = By.id("email_create");
	By btnCreateAcc = By.id("SubmitCreate");
	
	By rbTitle = By.id("id_gender1");
	By txtCusFirstName = By.id("customer_firstname");
	By txtCusLasName = By.id("customer_lastname");
	By txtPwd = By.id("passwd");
	By dpDay = By.id("days");
	By dpMonth = By.id("months");
	By dpYear = By.id("years");
	
	By txtFirstName = By.id("firstname");
	By txtLastName = By.id("lastname");
	By txtCompany = By.id("company");
	By txtAddress1 = By.id("address1");
	By txtAddress2 = By.id("address2");
	By txtCity = By.id("city");
	By dpState = By.id("id_state");
	By txtPoscode = By.id("postcode");
	By txtOther = By.id("other");
	By txtPhone = By.id("phone");
	By txtMPhone = By.id("phone_mobile");
	By btnRegister = By.id("submitAccount");
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void submitEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
		driver.findElement(btnCreateAcc).click();
	}
	
	public void Registration(String cusFirstName, String cusLastName, String password, String Company,
			String address1, String address2, String city, String postCode, String other, String phone, String mPhone) {
		
		driver.findElement(rbTitle).click();
		driver.findElement(txtCusFirstName).sendKeys(cusFirstName);
		driver.findElement(txtCusLasName).sendKeys(cusLastName);
		driver.findElement(txtPwd).sendKeys(password);
//		
//		Select drpDay1 = new Select(driver.findElement(dpDay));
//		drpDay1.selectByValue("27");
//		
//		Select drpMonth1 = new Select(driver.findElement(dpMonth));
//		drpMonth1.selectByValue("September");
//		
//		Select drpYear1 = new Select(driver.findElement(dpYear));
//		drpYear1.selectByValue("2000");;
		
//		driver.findElement(txtFirstName).sendKeys(cusFirstName);
//		driver.findElement(txtLastName).sendKeys(cusLastName);
		driver.findElement(txtCompany).sendKeys(Company);
		driver.findElement(txtAddress1).sendKeys(address1);
		driver.findElement(txtAddress2).sendKeys(address2);
		driver.findElement(txtCity).sendKeys(city);
		
		Select drpState1 = new Select(driver.findElement(dpState));
		drpState1.selectByVisibleText("Nevada");
		drpState1.selectByIndex(28);
		
		driver.findElement(txtPoscode).sendKeys(postCode);
		driver.findElement(txtOther).sendKeys(other);
		driver.findElement(txtPhone).sendKeys(phone);
		driver.findElement(txtMPhone).sendKeys(mPhone);
		driver.findElement(btnRegister).click();

	}

}
