package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class BusinessCase extends BaseClass {

	public BusinessCase() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement businessCaseTxt;
	
	@FindBy(xpath="//p[text()='PROCESS NAME']")
	private WebElement overViewTxt;
	
	@FindBy(xpath="//img[@class='icon me-2']/following-sibling::span")
	private WebElement Markfavouritebtn;
	
	@FindBy(xpath="//h6[text()='Policies']")
	private WebElement policiesTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement PoliciesTxt;
	
	@FindBy(xpath="//h6[text()='Process Flow Chart']")
	private WebElement processFlowChartTab;
	
	

}
