package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class TenderManagementPage extends BaseClass {
	
	public TenderManagementPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='5.1 Vendor Registration']//following-sibling::a")
	private WebElement vendorRegistrationViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='5.2 Potential Vendor Screening']//following-sibling::a")
	private WebElement potentialVendorScreeningViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='5.3 Vendor Performance Management']//following-sibling::a")
	private WebElement vendorPerformanceManagementViewMoreBtn;

	public WebElement getVendorRegistrationViewMoreBtn() {
		return vendorRegistrationViewMoreBtn;
	}

	public WebElement getPotentialVendorScreeningViewMoreBtn() {
		return potentialVendorScreeningViewMoreBtn;
	}

	public WebElement getVendorPerformanceManagementViewMoreBtn() {
		return vendorPerformanceManagementViewMoreBtn;
	}
	

}
