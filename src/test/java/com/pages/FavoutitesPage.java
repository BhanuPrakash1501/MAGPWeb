package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class FavoutitesPage extends BaseClass {

	WebDriver driver;

	public FavoutitesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h6[normalize-space()='Manuals']")
	WebElement manualsTab;
	
	@FindBy(xpath = "//h6[normalize-space()='Tenders']")
	WebElement tendersTab;


}
