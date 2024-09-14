package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ContractAdministrationPage extends BaseClass{
	
	public ContractAdministrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='4.1 Contract Management Implementation']//following-sibling::a")
	private WebElement contractManagementImplementationViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='4.2 Contract Renewal']//following-sibling::a")
	private WebElement contractRenewalViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='4.3 Contract Termination']//following-sibling::a")
	private WebElement contractTerminationViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='4.4 Contract Closeout']//following-sibling::a")
	private WebElement contractCloseoutViewMoreBtn;

	public WebElement getContractManagementImplementationViewMoreBtn() {
		return contractManagementImplementationViewMoreBtn;
	}

	public WebElement getContractRenewalViewMoreBtn() {
		return contractRenewalViewMoreBtn;
	}

	public WebElement getContractTerminationViewMoreBtn() {
		return contractTerminationViewMoreBtn;
	}

	public WebElement getContractCloseoutViewMoreBtn() {
		return contractCloseoutViewMoreBtn;
	}
	
	


}
