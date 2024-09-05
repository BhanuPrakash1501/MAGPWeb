package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email Address")
	WebElement emailId;

	@FindBy(id = "Password")
	WebElement pswd;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement forgetPassworslink;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//button[@class='btn btn-outline-secondary me-5 align-items-center']")
	WebElement googlebtn;

	@FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
	WebElement facebookbtn;

	@FindBy(xpath = "//a[text()='Register Now']")
	WebElement registernowLink;

	public void setEmailId(String email) {
		emailId.sendKeys(email);

	}

	public void setPswd(String pwd) {
		pswd.sendKeys(pwd);

	}

	public void clickForgetPassworslink() {
		forgetPassworslink.click();

	}

	public void clickSubmitbtn() {
		submitbtn.click();
	}

	public void clickGooglebtn() {
		googlebtn.click();
	}

	public void clickFacebookbtn() {
		facebookbtn.click();
	}

	public void clickRegisternowLink() {
		registernowLink.click();
	}

}
