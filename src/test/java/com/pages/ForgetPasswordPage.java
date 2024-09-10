package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ForgetPasswordPage extends BaseClass {

	WebDriver driver;

	public ForgetPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	WebElement emailId;

	@FindBy(xpath = "//button[text()='Send Link']")
	WebElement sendlinkbtn;

	@FindBy(xpath = "//a[text()='Go Back to Login']")
	WebElement goBackLoginbtn;

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getSendlinkbtn() {
		return sendlinkbtn;
	}

	public WebElement getGoBackLoginbtn() {
		return goBackLoginbtn;
	}
	

}
