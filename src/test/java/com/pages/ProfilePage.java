package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ProfilePage extends BaseClass {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[normalize-space()='Edit Profile']")
	WebElement editProfilebtn;
	
	@FindBy(xpath = "//img[@class='img-close']")
	WebElement crossbtn;
	
	@FindBy(xpath = "//input[@id='Mobile Number']")
	WebElement mobileNo;
	
	@FindBy(xpath = "//input[@id='Apartment, Suite, Building...']")
	WebElement aptstibldg;
	
	@FindBy(xpath = "//input[@id='Street City and Address']")
	WebElement strCtyAdd;
	
	@FindBy(xpath = "//input[@id='Postcode']")
	WebElement postCodeTxtBox;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebtn;
	
	@FindBy(xpath = "//span[normalize-space()='Introduction, Preface']")
	WebElement introductionprefacelnk;
	
	@FindBy(xpath = "//span[normalize-space()='Calendar, Events']")
	WebElement calendarEventsLink;
	
	@FindBy(xpath = "//img[@class='icon-lg me-3']")
	WebElement backbtn;
	
	@FindBy(xpath = "//p[@class='error']")
	WebElement logoutbtn;
	
	@FindBy(xpath = "//img[@class='img-close']")
	WebElement crosspopupbtn;
	
	@FindBy(xpath = "//button[normalize-space()='No, Keep Login']")
	WebElement nokeepLoginbtn;
	
	
	@FindBy(xpath = "//button[normalize-space()='Yes, Logout']")
	WebElement yesLogoutbtn;
	
	

}
