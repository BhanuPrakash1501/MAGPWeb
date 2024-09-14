package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class PrefacePage extends BaseClass {

	public PrefacePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='icon me-2']//following-sibling::span")
	private WebElement tenderManagementViewMoreBtn;

}
