package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class StaffLogin extends BaseClass {

	WebDriver driver;

	public StaffLogin(WebDriver driver) {

		this.driver = driver;
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

	public void setSignEmail(WebElement signEmail) {
		this.signEmail = signEmail;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public void setNextbtn(WebElement nextbtn) {
		this.nextbtn = nextbtn;
	}

	public WebElement getPdwbtn() {
		return pdwbtn;
	}

	public void setPdwbtn(WebElement pdwbtn) {
		this.pdwbtn = pdwbtn;
	}

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public void setSignInbtn(WebElement signInbtn) {
		this.signInbtn = signInbtn;
	}

	public WebElement getNobtn() {
		return nobtn;
	}

	public void setNobtn(WebElement nobtn) {
		this.nobtn = nobtn;
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

// TODO Auto-generated method stub

/*
 * public void setEmailId(String email) { signEmail.sendKeys(email);
 * 
 * }
 * 
 * public void setPswd(String pwd) { pdwbtn.sendKeys(pwd);
 * 
 * }
 * 
 * public void clickNextbtn() { nextbtn.click(); }
 * 
 * public void clickSignbtn() { signInbtn.click(); }
 * 
 * public void clickNobtn() { nobtn.click(); }
 */
