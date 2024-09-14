package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class RequistionPage extends BaseClass{
	
	public RequistionPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='2.1 Purchase Requisition']//following-sibling::a")
	private WebElement purchaserequistionViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='2.2 Processing of Purchase Requisition']//following-sibling::a")
	private WebElement processingofPurchaseRequisitionViewMoreBtn;

	public WebElement getPurchaserequistionViewMoreBtn() {
		return purchaserequistionViewMoreBtn;
	}

	public WebElement getProcessingofPurchaseRequisitionViewMoreBtn() {
		return processingofPurchaseRequisitionViewMoreBtn;
	}
	
	
	
	

}
