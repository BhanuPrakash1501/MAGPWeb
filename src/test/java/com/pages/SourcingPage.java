package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class SourcingPage extends BaseClass{

	public SourcingPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='3.1 Tender Management']//following-sibling::a")
	private WebElement tenderManagementViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='3.2 Tender Administration']//following-sibling::a")
	private WebElement tenderAdministrationViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='3.3 Tender Evaluation']//following-sibling::a")
	private WebElement tenderEvaluationViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='3.4 Abort of Tender']//following-sibling::a")
	private WebElement abortofTenderViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='3.5 Clarification / Negotiation prior to Award']//following-sibling::a")
	private WebElement ClarificationViewMoreBtn;

	public WebElement getTenderManagementViewMoreBtn() {
		return tenderManagementViewMoreBtn;
	}

	public WebElement getTenderAdministrationViewMoreBtn() {
		return tenderAdministrationViewMoreBtn;
	}

	public WebElement getTenderEvaluationViewMoreBtn() {
		return tenderEvaluationViewMoreBtn;
	}

	public WebElement getAbortofTenderViewMoreBtn() {
		return abortofTenderViewMoreBtn;
	}

	public WebElement getClarificationViewMoreBtn() {
		return ClarificationViewMoreBtn;
	}
	
	
}
