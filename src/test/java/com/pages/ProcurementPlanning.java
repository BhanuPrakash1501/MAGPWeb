package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ProcurementPlanning extends BaseClass{
	
	public ProcurementPlanning(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='1.1 Business Case']//following-sibling::a")
	private WebElement businesCaseViewMoreBtn;
	
	@FindBy(xpath="//h2[text()='1.2 Annual Procurement Planning']//following-sibling::a")
	private WebElement annualProcurementPlanningBtn;
	
	@FindBy(xpath="//h2[text()='1.3 Strategy Paper']//following-sibling::a")
	private WebElement strategyPaperViewMoreBtn;

	public WebElement getBusinesCaseBtn() {
		return businesCaseViewMoreBtn;
	}

	public WebElement getBusinesCaseViewMoreBtn() {
		return businesCaseViewMoreBtn;
	}

	public WebElement getAnnualProcurementPlanningBtn() {
		return annualProcurementPlanningBtn;
	}

	public WebElement getStrategyPaperViewMoreBtn() {
		return strategyPaperViewMoreBtn;
	}

	
	

}
