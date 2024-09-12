package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ForgetPasswordPage extends BaseClass {

	public ForgetPasswordPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	private WebElement emailId;

	@FindBy(xpath = "//button[text()='Send Link']")
	private WebElement sendlinkbtn;

	@FindBy(xpath = "//a[text()='Go Back to Login']")
	private WebElement goBackLoginbtn;

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
