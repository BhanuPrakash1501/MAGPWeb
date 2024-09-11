package com.TestClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

import com.BaseClass.BaseClass;
import com.pages.PreLoginPage;
import com.pages.StaffLogin;

public class TC005_StaffLogin extends BaseClass {

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void signIn() throws InterruptedException, IOException {

		PreLoginPage pl = new PreLoginPage(driver);
		pl.staffLogin();

		StaffLogin sl = new StaffLogin(driver);
		//sl.getSignEmail(getCellValue("TestData", 1, 3));
		sl.performLogin(getCellValue("TestData", 1, 3));
		sl.performPassword(getCellValue("TestData", 1, 4));
		
		

	}
}
