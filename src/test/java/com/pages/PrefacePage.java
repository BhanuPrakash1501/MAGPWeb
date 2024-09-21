package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class PrefacePage extends BaseClass {

	public PrefacePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='icon me-2']/following-sibling::span")
	private WebElement Markfavouritebtn;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement prefaceTxt;
	
	@FindBy(xpath="//h6[text()='Procurement Codes of ethics']")
	private WebElement procurementCodesofethicsTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement procurementCodesofethicsTxt;
	
	@FindBy(xpath="//h6[text()='General Provision']")
	private WebElement generalProvisionTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement generalProvisiontxt;
	
	@FindBy(xpath="//h6[text()='Terms and Definitions']")
	private WebElement termsandDefinitionsTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement termsandDefinitionstxt;
	
	@FindBy(xpath="//h6[text()='Processes Symbols']")
	private WebElement processesSymbolsTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement processesSymbolstxt;
	
	@FindBy(xpath="//h6[text()=\"MAHB's Procurement Value Chain\"]")
	private WebElement procurementValueChainTab;
	
	@FindBy(xpath="//h1[@class='text-white']/b")
	private WebElement procurementValueChaintxt;
	
}
