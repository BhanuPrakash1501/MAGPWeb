package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class SignUpPage extends BaseClass {

	public SignUpPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	private WebElement enterEmailId;

	@FindBy(id = "Mobile Number")
	private WebElement MobileNo;

	@FindBy(id = "Password")
	private WebElement pwd;

	@FindBy(id = "First Name")
	private WebElement firstName;

	@FindBy(id = "Last Name")
	private WebElement lastName;

	@FindBy(id = "Apartment, Suite, Building...")
	private WebElement aptsuitebldg;

	@FindBy(id = "Street City and Address")
	private WebElement streetcityadd;

	@FindBy(id = "Postcode")
	private WebElement postcode;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitbtn;

	@FindBy(xpath = "//a[text()='Login Here']")
	private WebElement loginhereLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEnterEmailId() {
		return enterEmailId;
	}

	public void setEnterEmailId(WebElement enterEmailId) {
		this.enterEmailId = enterEmailId;
	}

	public void setMobileNo(WebElement mobileNo) {
		MobileNo = mobileNo;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public void setAptsuitebldg(WebElement aptsuitebldg) {
		this.aptsuitebldg = aptsuitebldg;
	}

	public void setStreetcityadd(WebElement streetcityadd) {
		this.streetcityadd = streetcityadd;
	}

	public void setPostcode(WebElement postcode) {
		this.postcode = postcode;
	}

	public void setSubmitbtn(WebElement submitbtn) {
		this.submitbtn = submitbtn;
	}

	public void setLoginhereLink(WebElement loginhereLink) {
		this.loginhereLink = loginhereLink;
	}

	public WebElement getMobileNo() {
		return MobileNo;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAptsuitebldg() {
		return aptsuitebldg;
	}

	public WebElement getStreetcityadd() {
		return streetcityadd;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getLoginhereLink() {
		return loginhereLink;
	}

}
