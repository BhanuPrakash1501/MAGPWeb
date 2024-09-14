package com.TestClasses;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;
import com.pages.PreLoginPage;

public class TC001_PreLoginScreen extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	// @Parameters("URL")
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);
		enterAppInUrl(getCellValue("TestData", 3, 1));
		// enterAppInUrl(getPropertFileValue("nonProdurl"));
		// enterAppInUrl(url);
	}

	@Test
	public void checkLoginScreen() throws InterruptedException {

		pm.getPreLogin().guestLogin();

	}

}
