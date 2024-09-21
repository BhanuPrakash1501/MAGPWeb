package com.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;
import com.pages.LoginPage;
import com.pages.PreLoginPage;
import com.pages.SignUpPage;

public class TC004_SignUpPage extends BaseClass {

	PageObjectManager pm = new PageObjectManager();

	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);

		enterAppInUrl(getCellValue("TestData", 3, 1));
	}

	@Test
	public void registerNowUIValidations() {
		pm.getPreLogin().vendorLogin();
		pm.getLogin().clickRegisterNowlink();
		pm.getSignUpPage().verifySignUpHeaderTxt();
		pm.getSignUpPage().verifyemailHeaderTxt();
		pm.getSignUpPage().verifymobileNoHeaderTxt();
		pm.getSignUpPage().verifypasswordHeaderTxt();
		pm.getSignUpPage().verifyfirstNameHeaderTxt();
		pm.getSignUpPage().verifylastNameHeaderTxt();
		pm.getSignUpPage().verifyaptSuiteBuildingHeaderTxt();
		pm.getSignUpPage().verifystreetCityAddressHeaderTxt();
		pm.getSignUpPage().verifypostCodeHeaderTxt();

	}

	@Test(priority = 2)
	public void signUpFieldValidations() throws IOException {

		pm.getSignUpPage().performEmailValidations(getCellValue("SignUp", 1, 0));
		pm.getSignUpPage().performMobileNoValidation(getCellValue("SignUP", 1, 1));
		pm.getSignUpPage().performPassword8CharsValidation(getCellValue("SignUp", 1, 2));
		pm.getSignUpPage().performPasswordUpperCaseValidation(getCellValue("SignUp", 2, 2));
		pm.getSignUpPage().performPasswordOneNumberValidation();
		pm.getSignUpPage().performPasswordSpecialcharValidation();
	}

	@AfterClass
	public void closeBrowser() {
//		quitWindow();
	}
}
