package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;
import com.pages.LoginPage;
import com.pages.PreLoginPage;

public class TC002_VendorLoginPage extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void vendorLogin() throws IOException {

		pm.getPreLogin().vendorLogin();
		pm.getLogin().performLogin(getCellValue("Testdata", 0, 1), getCellValue("Testdata", 1, 1));

	}

}
