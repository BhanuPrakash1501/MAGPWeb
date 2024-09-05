package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PreLoginPage {
	
	WebDriver driver;
	
	public PreLoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(xpath="//button[normalize-space()='Staff Login']")
	WebElement staffLoginbtn;
	
	
	@FindBy(xpath="//a[text()='Vendor Login']")
	WebElement vendorLoginbtn;
	
	@FindBy(xpath="//button[text()='Guest Login']")
	WebElement guestbtn;
	
	public void clickStaffLoginbtn() {
		staffLoginbtn.click();
	}
	
	public void clickVendorLoginbtn() {
		vendorLoginbtn.click();
	}
	
	public void clickGuestLoginbtn() {
		guestbtn.click();
	}
	
	
	

}
