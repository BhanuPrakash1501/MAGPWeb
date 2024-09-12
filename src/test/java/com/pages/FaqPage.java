package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class FaqPage extends BaseClass {

	public FaqPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBar;

	public WebElement getSearchBar() {
		return searchBar;
	}

	

}
