package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class PreLoginPage extends BaseClass {

	// WebDriver driver;

	public PreLoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[normalize-space()='Staff Login']")
	private WebElement staffLoginbtn;

	@FindBy(xpath = "//a[text()='Vendor Login']")
	private WebElement vendorLoginbtn;

	@FindBy(xpath = "//button[text()='Guest Login']")
	private WebElement guestbtn;

	public WebElement getStaffLoginbtn() {
		return staffLoginbtn;
	}

	public WebElement getVendorLoginbtn() {
		return vendorLoginbtn;
	}

	public WebElement getGuestbtn() {
		return guestbtn;
	}

	public void staffLogin() {
		elementClick(getStaffLoginbtn());
	}

	public void vendorLogin() {
		elementClick(getVendorLoginbtn());
	}

	public void guestLogin() {
		elementClick(getGuestbtn());
	}

}
