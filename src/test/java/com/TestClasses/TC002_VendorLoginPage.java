package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;

public class TC002_VendorLoginPage extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	 @Test(priority = 1)
	public void vendorLogin() throws IOException, InterruptedException {

		pm.getPreLogin().vendorLogin();
		pm.getLogin().performLogin(getCellValue("Testdata", 0, 1), getCellValue("Testdata", 1, 1));
		pm.getHomePage().clickOnLinksAndVerify();

	}

//	@Test
	public void verifyLoginPageUIValidations() {
		pm.getPreLogin().vendorLogin();
		pm.getLogin().verifyEmailTxt();
		pm.getLogin().verifyPasswordTxt();
		pm.getLogin().verifyForgetPasswordTxt();
		pm.getLogin().verifyGooglebtn();
		pm.getLogin().verifyFacebookbtn();
		pm.getLogin().verifyRegisterNowLnk();
		pm.getLogin().verifyWelcomeTxt();
		pm.getLogin().verifyWelcomeParagraphTxt();
		pm.getLogin().verifyDonthaveAnAccountTxt();

	}

//	@Test(priority = 1)
	public void verifyLoginPageWithValidCredentials() throws IOException {
		pm.getLogin().performLogin(getCellValue("Testdata", 0, 1), getCellValue("Testdata", 1, 1));
		pm.getHomePage().verifyWelcomeToMagpTxt();

	}

//	@Test
	public void verifyLoginPageWithInvalidCredentials() throws IOException {
		pm.getLogin().verifyInvalidEmail(getCellValue("Testdata", 0, 3));

	}

	@AfterClass
	public void closeBrowser() {
		quitWindow();
	}
}
