package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.PreLoginPage;

public class TC001_PreLoginScreen extends BaseClass {
	
	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void checkLoginScreen() throws InterruptedException {

		PreLoginPage plp = new PreLoginPage(driver);
		plp.vendorLogin();

		
	}

}
