package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class IntroductionPage extends BaseClass {

	public IntroductionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Preface']/following-sibling::a")
	private WebElement prefaceViewMorebtn;

	@FindBy(xpath = "//h2[text()='Procurement Codes of ethics']/following-sibling::a")
	private WebElement procurementCodesofethicsviewMorebtn;

	@FindBy(xpath = "//h2[text()='General Provision']/following-sibling::a")
	private WebElement generalProvisionviewMorebtn;

	@FindBy(xpath = "//h2[text()='Terms and Definitions']/following-sibling::a")
	private WebElement termsandDefinitionsviewMorebtn;

	@FindBy(xpath = "//h2[text()='Processes Symbols']/following-sibling::a")
	private WebElement processesSymbolsviewMorebtn;

	@FindBy(xpath = "//h2[text()=\"MAHB's Procurement Value Chain\"]/following-sibling::a")
	private WebElement procurementValueChainviewMorebtn;

	public WebElement getPrefaceViewMorebtn() {
		return prefaceViewMorebtn;
	}

	public WebElement getProcurementCodesofethicsviewMorebtn() {
		return procurementCodesofethicsviewMorebtn;
	}

	public WebElement getGeneralProvisionviewMorebtn() {
		return generalProvisionviewMorebtn;
	}

	public WebElement getTermsandDefinitionsviewMorebtn() {
		return termsandDefinitionsviewMorebtn;
	}

	public WebElement getProcessesSymbolsviewMorebtn() {
		return processesSymbolsviewMorebtn;
	}

	public WebElement getProcurementValueChainviewMorebtn() {
		return procurementValueChainviewMorebtn;
	}

}
