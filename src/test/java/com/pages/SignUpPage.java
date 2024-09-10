package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	WebElement enterEmailId;

	@FindBy(id = "Mobile Number")
	WebElement MobileNo;

	@FindBy(id = "Password")
	WebElement pwd;

	@FindBy(id = "First Name")
	WebElement firstName;

	@FindBy(id = "Last Name")
	WebElement lastName;

	@FindBy(id = "Apartment, Suite, Building...")
	WebElement aptsuitebldg;

	@FindBy(id = "Street City and Address")
	WebElement streetcityadd;

	@FindBy(id = "Postcode")
	WebElement postcode;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//a[text()='Login Here']")
	WebElement loginhereLink;

	public void setEmailId(String email) {
		enterEmailId.sendKeys(email);

	}

	public void setPswd(String passwd) {
		pwd.sendKeys(passwd);

	}

	public void setMobileNo(String mbNo) {
		MobileNo.sendKeys(mbNo);

	}

	public void setFirstName(String fName) {
		firstName.sendKeys(fName);

	}

	public void setLastName(String lName) {
		lastName.sendKeys(lName);

	}
	
	public void setAptBldSuite(String aptSuiteBldg) {
		aptsuitebldg.sendKeys(aptSuiteBldg);

	}
	
	public void setStreetCityAddress(String streetCtyAddrss) {
		streetcityadd.sendKeys(streetCtyAddrss);

	}
	
	public void setPostCode(String pstCode) {
		postcode.sendKeys(pstCode);

	}
	public void clickSubmitbtn() {
		submitbtn.click();
	}

	public void clickloginhereLink() {
		loginhereLink.click();
	}

}
