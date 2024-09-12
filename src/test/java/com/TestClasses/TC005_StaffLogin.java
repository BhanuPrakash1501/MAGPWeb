package com.TestClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;
import com.pages.FavoutitesPage;
import com.pages.HomePage;
import com.pages.PreLoginPage;
import com.pages.StaffLogin;

public class TC005_StaffLogin extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void signIn() throws InterruptedException, IOException {

	}
}
