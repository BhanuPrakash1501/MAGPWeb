package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement home;

	@FindBy(xpath = "//a[normalize-space()='Favourites']")
	WebElement favourites;

	@FindBy(xpath = "//a[normalize-space()='Calendar']")
	WebElement calendar;

	@FindBy(xpath = "//a[normalize-space()='FAQs']")
	WebElement fAQs;

	@FindBy(xpath = "//input[@placeholder='Tender Name']")
	WebElement searchbar;

	@FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p2.png\"]")
	WebElement bellIcon;

	@FindBy(xpath = "//a[@id='nav-dropdown-ligh-example']")
	WebElement eng;

	@FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p1.png\"]")
	WebElement profile;

	@FindBy(xpath = "//a[contains(@href,'/user/introduction?id=get-introduction-list&name=Introduction')]")
	WebElement introduction;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-procurement-planning-list&name=Procurement+Planning']")
	WebElement procurementPlanning;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-requisition-list&name=Requisition']")
	WebElement requisition;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-sourcing-list&name=Sourcing']")
	WebElement sourcing;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-contract-administration-list&name=Contract+Administration']")
	WebElement contractAdministration;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-vendor-management-list&name=Vendor+Management']")
	WebElement vendorMgnt;

	@FindBy(xpath = "//a[normalize-space()='View All']")
	WebElement viewAll;

	@FindBy(xpath = "//h2[normalize-space()='Introduction']")
	WebElement introductionlnk;

	@FindBy(xpath = "//p[normalize-space()='Preface']")
	WebElement prefacelnk;

	@FindBy(xpath = "//p[normalize-space()='Procurement Codes of Ethics']")
	WebElement procurementCodesofEthicslnk;

	@FindBy(xpath = "//p[normalize-space()='General Provision']")
	WebElement generalProvisionlnk;

	@FindBy(xpath = "//p[normalize-space()='Terms & Definitions']")
	WebElement termsDefinitionslnk;

	@FindBy(xpath = "//p[normalize-space()='Process Symbols']")
	WebElement processSymbolslnk;

	@FindBy(xpath = "//p[text()='MAHB’s  Procurement value chain']")
	WebElement mAHBsProcurementvaluechainlnk;

	@FindBy(xpath = "//h2[normalize-space()='Contact Us']")
	WebElement contactUsbtn;

	@FindBy(xpath = "//h2[normalize-space()='Procurement Planning']")
	WebElement procurementplanninglnk;

	@FindBy(xpath = "//p[normalize-space()='Business Case']")
	WebElement businessCaselnk;

	@FindBy(xpath = "//p[normalize-space()='Annual Procurement Planning']")
	WebElement annualProcurementPlanninglnk;

	@FindBy(xpath = "//p[normalize-space()='Strategy Paper']")
	WebElement strategyPaperlnk;

	@FindBy(xpath = "//h2[normalize-space()='Requisition']")
	WebElement requisitionlnk;

	@FindBy(xpath = "//p[normalize-space()='Purchase Requisition']")
	WebElement purchaseRequisitionlnk;

	@FindBy(xpath = "//p[contains(text(),'Process of')]")
	WebElement processofPurchaseRequisitionlnk;

	@FindBy(xpath = "//h2[normalize-space()='Sourcing']")
	WebElement Sourcinglnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Management']")
	WebElement tenderManagementlnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Administration']")
	WebElement tenderAdministrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Evaluation']")
	WebElement tenderEvaluationlnk;

	@FindBy(xpath = "//p[normalize-space()='Abort of Tender']")
	WebElement AbortofTenderlnk;

	@FindBy(xpath = "//p[normalize-space()='Clarification/ Negotiation prior to Award']")
	WebElement clarificationNegotiationpriortoAwardlnk;

	@FindBy(xpath = "//h2[normalize-space()='Contract Administration']")
	WebElement contractAdministrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Management Implementation']")
	WebElement contractManagementImplementationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Renewal']")
	WebElement contractRenewallnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Termination']")
	WebElement contractTerminationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Closeout']")
	WebElement contractCloseoutlnk;

	@FindBy(xpath = "//h2[normalize-space()='Vendor Management']")
	WebElement vendorManagementlnk;

	@FindBy(xpath = "//p[normalize-space()='Vendor Registration']")
	WebElement vendorRegistrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Potential Vendor Screening']")
	WebElement potentialVendorScreeninglnk;

	@FindBy(xpath = "//p[normalize-space()='Vendor Management']")
	WebElement vendorMgntlnk;

}
