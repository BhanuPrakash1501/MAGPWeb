package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffLogin {

	WebDriver driver;

	public StaffLogin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="i0116")
	WebElement signEmail;
	
	
	@FindBy(id="idSIButton9")
	WebElement nextbtn;
	
	@FindBy(id="passwordInput")
	WebElement pdwbtn;
	
	@FindBy(id="submitButton")
	WebElement signInbtn;
	
	@FindBy(id="idBtn_Back")
	WebElement nobtn;
	
	
	public void setEmailId(String email) {
		signEmail.sendKeys(email);

	}

	public void setPswd(String pwd) {
		pdwbtn.sendKeys(pwd);

	}
	
	public void clickNextbtn() {
		nextbtn.click();
	}
	
	public void clickSignbtn() {
		signInbtn.click();
	}
	
	public void clickNobtn() {
		nobtn.click();
	}
	
	
}
