package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;

public class TC002_VendorLoginPage extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeMethod
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);
		enterAppInUrl(getCellValue("TestData", 3, 1));
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

	@Test(priority = 1)
	public void verifyLoginPageWithValidCredentials() throws IOException {
		pm.getPreLogin().vendorLogin();
		pm.getLogin().performLogin(getCellValue("Testdata", 0, 1), getCellValue("Testdata", 1, 1));

	}

//	@Test(priority = 3)
	public void verifyHomePageUI() {
		pm.getHomePage().getPurchaseIDTxt();
		pm.getHomePage().getPurchaseIDPopDescTxt();
		pm.getHomePage().verifyWelcomeToMagpTxt();
		pm.getHomePage().verifyLatestAnnouncementTxt();
		pm.getHomePage().verifyLast7DaysTxt();
		pm.getHomePage().verifyViewAll();

	}

//	@Test(priority = 4)
	public void introductionModule() {
		pm.getHomePage().clickOnIntroductionModule();
		pm.getIntroductionPage().clickPreface();
		navigateBack();

	}

//	@Test(priority = 5)
	public void procurementCodesofethics() {
		pm.getHomePage().clickOnIntroductionModule();
		pm.getIntroductionPage().clickProcurementCodesofethics();
		navigateBack();
	}

//	@Test(priority = 6)
	public void generalProvisions() {
		pm.getHomePage().clickOnIntroductionModule();
		pm.getIntroductionPage().clickGeneralProvisions();
		navigateBack();
	}

//	@Test(priority = 7)
	public void verifyPurchaseIDUI() {
		pm.getHomePage().clickOnIntroductionModule();
		pm.getIntroductionPage().verifyWantToViewMoreTxt();
		pm.getIntroductionPage().verifyWantToViewMoreContentTxt();
		pm.getIntroductionPage().clickPurchaseID();
		pm.getIntroductionPage().verifyloginPurchaseIDTxt();
		pm.getIntroductionPage().verifyComingSoonTxt();
		pm.getIntroductionPage().verifyWeWillNotifyYouTxt();
		pm.getIntroductionPage().clickBackArrow();

	}

//	@Test(priority = 1)
	public void verifyLoginPageWithInvalidCredentials() throws IOException {
		pm.getLogin().verifyInvalidEmail(getCellValue("Testdata", 0, 3));

	}

//	@Test(priority = 3)
	public void vendorLogin() throws IOException, InterruptedException {
		pm.getHomePage().clickOnLinksAndVerify();

	}

	@AfterMethod
	public void closeBrowser() {
		quitWindow();
	}
}
