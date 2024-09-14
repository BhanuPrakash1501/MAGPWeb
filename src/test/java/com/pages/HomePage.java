package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement home;

	@FindBy(xpath = "//a[normalize-space()='Favourites']")
	private WebElement favourites;

	@FindBy(xpath = "//a[normalize-space()='Calendar']")
	private WebElement calendar;

	@FindBy(xpath = "//a[normalize-space()='FAQs']")
	private WebElement fAQs;

	@FindBy(xpath = "//input[@placeholder='Tender Name']")
	private WebElement searchbar;

	@FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p2.png\"]")
	private WebElement bellIcon;

	@FindBy(xpath = "//a[@id='nav-dropdown-ligh-example']")
	private WebElement eng;

	@FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p1.png\"]")
	private WebElement profile;

	@FindBy(xpath = "//a[contains(@href,'/user/introduction?id=get-introduction-list&name=Introduction')]")
	private WebElement introduction;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-procurement-planning-list&name=Procurement+Planning']")
	private WebElement procurementPlanning;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-requisition-list&name=Requisition']")
	private WebElement requisition;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-sourcing-list&name=Sourcing']")
	private WebElement sourcing;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-contract-administration-list&name=Contract+Administration']")
	private WebElement contractAdministration;

	@FindBy(xpath = "//a[@href='/user/introduction?id=get-vendor-management-list&name=Vendor+Management']")
	private WebElement vendorMgnt;

	@FindBy(xpath = "//a[normalize-space()='View All']")
	private WebElement viewAll;

	@FindBy(xpath = "//h2[normalize-space()='Introduction']")
	private WebElement introductionlnk;

	@FindBy(xpath = "//p[normalize-space()='Preface']")
	private WebElement prefacelnk;

	@FindBy(xpath = "//p[normalize-space()='Procurement Codes of Ethics']")
	private WebElement procurementCodesofEthicslnk;

	@FindBy(xpath = "//p[normalize-space()='General Provision']")
	private WebElement generalProvisionlnk;

	@FindBy(xpath = "//p[normalize-space()='Terms & Definitions']")
	private WebElement termsDefinitionslnk;

	@FindBy(xpath = "//p[normalize-space()='Process Symbols']")
	private WebElement processSymbolslnk;

	@FindBy(xpath = "//p[text()='MAHB’s  Procurement value chain']")
	private WebElement mAHBsProcurementvaluechainlnk;

	@FindBy(xpath = "//h2[normalize-space()='Contact Us']")
	private WebElement contactUsbtn;

	@FindBy(xpath = "//h2[normalize-space()='Procurement Planning']")
	private WebElement procurementplanninglnk;

	@FindBy(xpath = "//p[normalize-space()='Business Case']")
	private WebElement businessCaselnk;

	@FindBy(xpath = "//p[normalize-space()='Annual Procurement Planning']")
	private WebElement annualProcurementPlanninglnk;

	@FindBy(xpath = "//p[normalize-space()='Strategy Paper']")
	private WebElement strategyPaperlnk;

	@FindBy(xpath = "//h2[normalize-space()='Requisition']")
	private WebElement requisitionlnk;

	@FindBy(xpath = "//p[normalize-space()='Purchase Requisition']")
	private WebElement purchaseRequisitionlnk;

	@FindBy(xpath = "//p[contains(text(),'Process of')]")
	private WebElement processofPurchaseRequisitionlnk;

	@FindBy(xpath = "//h2[normalize-space()='Sourcing']")
	private WebElement Sourcinglnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Management']")
	private WebElement tenderManagementlnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Administration']")
	private WebElement tenderAdministrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Tender Evaluation']")
	private WebElement tenderEvaluationlnk;

	@FindBy(xpath = "//p[normalize-space()='Abort of Tender']")
	private WebElement AbortofTenderlnk;

	@FindBy(xpath = "//p[normalize-space()='Clarification/ Negotiation prior to Award']")
	private WebElement clarificationNegotiationpriortoAwardlnk;

	@FindBy(xpath = "//h2[normalize-space()='Contract Administration']")
	private WebElement contractAdministrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Management Implementation']")
	private WebElement contractManagementImplementationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Renewal']")
	private WebElement contractRenewallnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Termination']")
	private WebElement contractTerminationlnk;

	@FindBy(xpath = "//p[normalize-space()='Contract Closeout']")
	private WebElement contractCloseoutlnk;

	@FindBy(xpath = "//h2[normalize-space()='Vendor Management']")
	private WebElement vendorManagementlnk;

	@FindBy(xpath = "//p[normalize-space()='Vendor Registration']")
	private WebElement vendorRegistrationlnk;

	@FindBy(xpath = "//p[normalize-space()='Potential Vendor Screening']")
	private WebElement potentialVendorScreeninglnk;

	@FindBy(xpath = "//p[normalize-space()='Vendor Management']")
	private WebElement vendorMgntlnk;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//img[@class='img-close']")
	private WebElement crossbtn;
	
	@FindBy(xpath = "//h2[normalize-space()='MAHB Contact Directory']")
	private WebElement mahbContactDirectorylnk;
	
	@FindBy(xpath = "//h2[normalize-space()='Procurehere Login']")
	private WebElement procurehereLoginlnk;
	
	@FindBy(xpath = "//h2[normalize-space()='Vendor Management System']")
	private WebElement vendorManagementSystemlnk;
	

	public WebElement getHome() {
		return home;
	}

	public WebElement getFavourites() {
		return favourites;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getfAQs() {
		return fAQs;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getBellIcon() {
		return bellIcon;
	}

	public WebElement getEng() {
		return eng;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getIntroduction() {
		return introduction;
	}

	public WebElement getProcurementPlanning() {
		return procurementPlanning;
	}

	public WebElement getRequisition() {
		return requisition;
	}

	public WebElement getSourcing() {
		return sourcing;
	}

	public WebElement getContractAdministration() {
		return contractAdministration;
	}

	public WebElement getVendorMgnt() {
		return vendorMgnt;
	}

	public WebElement getViewAll() {
		return viewAll;
	}

	public WebElement getIntroductionlnk() {
		return introductionlnk;
	}

	public WebElement getPrefacelnk() {
		return prefacelnk;
	}

	public WebElement getProcurementCodesofEthicslnk() {
		return procurementCodesofEthicslnk;
	}

	public WebElement getGeneralProvisionlnk() {
		return generalProvisionlnk;
	}

	public WebElement getTermsDefinitionslnk() {
		return termsDefinitionslnk;
	}

	public WebElement getProcessSymbolslnk() {
		return processSymbolslnk;
	}

	public WebElement getmAHBsProcurementvaluechainlnk() {
		return mAHBsProcurementvaluechainlnk;
	}

	public WebElement getContactUsbtn() {
		return contactUsbtn;
	}

	public WebElement getProcurementplanninglnk() {
		return procurementplanninglnk;
	}

	public WebElement getBusinessCaselnk() {
		return businessCaselnk;
	}

	public WebElement getAnnualProcurementPlanninglnk() {
		return annualProcurementPlanninglnk;
	}

	public WebElement getStrategyPaperlnk() {
		return strategyPaperlnk;
	}

	public WebElement getRequisitionlnk() {
		return requisitionlnk;
	}

	public WebElement getPurchaseRequisitionlnk() {
		return purchaseRequisitionlnk;
	}

	public WebElement getProcessofPurchaseRequisitionlnk() {
		return processofPurchaseRequisitionlnk;
	}

	public WebElement getSourcinglnk() {
		return Sourcinglnk;
	}

	public WebElement getTenderManagementlnk() {
		return tenderManagementlnk;
	}

	public WebElement getTenderAdministrationlnk() {
		return tenderAdministrationlnk;
	}

	public WebElement getTenderEvaluationlnk() {
		return tenderEvaluationlnk;
	}

	public WebElement getAbortofTenderlnk() {
		return AbortofTenderlnk;
	}

	public WebElement getClarificationNegotiationpriortoAwardlnk() {
		return clarificationNegotiationpriortoAwardlnk;
	}

	public WebElement getContractAdministrationlnk() {
		return contractAdministrationlnk;
	}

	public WebElement getContractManagementImplementationlnk() {
		return contractManagementImplementationlnk;
	}

	public WebElement getContractRenewallnk() {
		return contractRenewallnk;
	}

	public WebElement getContractTerminationlnk() {
		return contractTerminationlnk;
	}

	public WebElement getContractCloseoutlnk() {
		return contractCloseoutlnk;
	}

	public WebElement getVendorManagementlnk() {
		return vendorManagementlnk;
	}

	public WebElement getVendorRegistrationlnk() {
		return vendorRegistrationlnk;
	}

	public WebElement getPotentialVendorScreeninglnk() {
		return potentialVendorScreeninglnk;
	}

	public WebElement getVendorMgntlnk() {
		return vendorMgntlnk;
	}

}
