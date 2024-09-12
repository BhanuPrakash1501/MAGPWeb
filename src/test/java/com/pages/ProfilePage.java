package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ProfilePage extends BaseClass {

	public ProfilePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[normalize-space()='Edit Profile']")
	private WebElement editProfilebtn;

	@FindBy(xpath = "//img[@class='img-close']")
	private WebElement crossbtn;

	@FindBy(xpath = "//input[@id='Mobile Number']")
	private WebElement mobileNo;

	@FindBy(xpath = "//input[@id='Apartment, Suite, Building...']")
	private WebElement aptstibldg;

	@FindBy(xpath = "//input[@id='Street City and Address']")
	private WebElement strCtyAdd;

	@FindBy(xpath = "//input[@id='Postcode']")
	private WebElement postCodeTxtBox;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement savebtn;

	@FindBy(xpath = "//span[normalize-space()='Introduction, Preface']")
	private WebElement introductionprefacelnk;

	@FindBy(xpath = "//span[normalize-space()='Calendar, Events']")
	private WebElement calendarEventsLink;

	@FindBy(xpath = "//img[@class='icon-lg me-3']")
	private WebElement backbtn;

	@FindBy(xpath = "//p[@class='error']")
	private WebElement logoutbtn;

	@FindBy(xpath = "//img[@class='img-close']")
	private WebElement crosspopupbtn;

	@FindBy(xpath = "//button[normalize-space()='No, Keep Login']")
	private WebElement nokeepLoginbtn;

	@FindBy(xpath = "//button[normalize-space()='Yes, Logout']")
	private WebElement yesLogoutbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEditProfilebtn() {
		return editProfilebtn;
	}

	public WebElement getCrossbtn() {
		return crossbtn;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getAptstibldg() {
		return aptstibldg;
	}

	public WebElement getStrCtyAdd() {
		return strCtyAdd;
	}

	public WebElement getPostCodeTxtBox() {
		return postCodeTxtBox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getIntroductionprefacelnk() {
		return introductionprefacelnk;
	}

	public WebElement getCalendarEventsLink() {
		return calendarEventsLink;
	}

	public WebElement getBackbtn() {
		return backbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getCrosspopupbtn() {
		return crosspopupbtn;
	}

	public WebElement getNokeepLoginbtn() {
		return nokeepLoginbtn;
	}

	public WebElement getYesLogoutbtn() {
		return yesLogoutbtn;
	}

}
