package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;

public class ForgetPasswordPage extends BaseClass {

	public ForgetPasswordPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	private WebElement emailId;

	@FindBy(xpath = "//button[text()='Send Link']")
	private WebElement sendlinkbtn;

	public WebElement getForgotPasswordTxt() {
		return forgotPasswordTxt;
	}

	@FindBy(xpath = "//a[text()='Go Back to Login']")
	private WebElement goBackLoginbtn;

	@FindBy(xpath = "//div[text()='Please enter a valid email address']")
	private WebElement validEmailAddressMailTxt;

	@FindBy(xpath = "//h2[text()='Forgot Password']")
	private WebElement forgotPasswordTxt;

	@FindBy(xpath = "//h6[text()='Well Done']")
	private WebElement wellDoneTxt;

	@FindBy(xpath = "//p[contains(.,'Password reset email successfully sent to your registered email.')]")
	private WebElement passwordresetMssgTxt;

	@FindBy(xpath = "//button[text()='Back To Login Page']")
	private WebElement backToLoginBtn;

	public WebElement getWellDoneTxt() {
		return wellDoneTxt;
	}

	public WebElement getPasswordresetMssgTxt() {
		return passwordresetMssgTxt;
	}

	public WebElement getBackToLoginBtn() {
		return backToLoginBtn;
	}

	public WebElement getValidEmailAddressMailTxt() {
		return validEmailAddressMailTxt;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getSendlinkbtn() {
		return sendlinkbtn;
	}

	public WebElement getGoBackLoginbtn() {
		return goBackLoginbtn;
	}

	public void verifyValidEMailAdressTxt(String un) {
		elementSendKeys(emailId, un);
		String validEmailAddressMailTxt = getValidEmailAddressMailTxt().getText();
		Assert.assertEquals(validEmailAddressMailTxt, "Please enter a valid email address");

	}

	public void verifySendLinkButton() {
		boolean status = getSendlinkbtn().isEnabled();
		Assert.assertFalse(status);
	}

	public void verifyForgetPasswordHeadingtxt() {
		String forgetHeadingtxt = getForgotPasswordTxt().getText();
		Assert.assertEquals(forgetHeadingtxt, "Forgot Password");
	}

	public void verifyGobackToLoginBtn() {
		elementClick(getGoBackLoginbtn());

	}

}
