package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class StaffLogin extends BaseClass {

	public StaffLogin() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "i0116")
	private WebElement signEmail;

	@FindBy(id = "idSIButton9")
	private WebElement nextbtn;

	@FindBy(id = "passwordInput")
	private WebElement pdwbtn;

	@FindBy(id = "submitButton")
	private WebElement signInbtn;

	@FindBy(id = "idBtn_Back")
	private WebElement nobtn;

	public WebElement getSignEmail() {
		return signEmail;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getPdwbtn() {
		return pdwbtn;
	}

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public WebElement getNobtn() {
		return nobtn;
	}

	public void performLogin(String username) {
		elementSendKeys(getSignEmail(), username);
		elementClick(getNextbtn());

	}

	public void performPassword(String password) {

		elementSendKeys(getPdwbtn(), password);
		elementClick(getSignInbtn());
		elementClick(getNobtn());

	}

}


