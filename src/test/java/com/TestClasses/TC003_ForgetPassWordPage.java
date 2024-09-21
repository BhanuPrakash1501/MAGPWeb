package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;

public class TC003_ForgetPassWordPage extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void verifyInvalidEmail() throws IOException {

		pm.getPreLogin().vendorLogin();
		pm.getLogin().verifyForgetPasswordlink();
		pm.getForgetPasswordPage().verifyForgetPasswordHeadingtxt();
		pm.getForgetPasswordPage().verifyValidEMailAdressTxt(getCellValue("Testdata", 0, 3));
		pm.getForgetPasswordPage().verifySendLinkButton();
		pm.getForgetPasswordPage().verifyGobackToLoginBtn();
		pm.getLogin().verifyLoginHeaderTxt();
	}

	@AfterClass
	public void closeBrowser() {
		quitWindow();
	}

}
