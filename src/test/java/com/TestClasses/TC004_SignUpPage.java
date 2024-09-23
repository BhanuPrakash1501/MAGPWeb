package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BaseClass.BaseClass;
import com.ObjectManager.PageObjectManager;

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

	@Test(priority = 1)
	public void signUpFieldValidations() throws IOException {
//		pm.getPreLogin().vendorLogin();
//		pm.getLogin().clickRegisterNowlink();
		pm.getSignUpPage().performEmailValidations(getCellValue("SignUp", 1, 0));
		pm.getSignUpPage().performMobileNoValidation(getCellValue("SignUP", 1, 1));
		pm.getSignUpPage().performPassword8CharsValidation(getCellValue("SignUp", 1, 2));
		pm.getSignUpPage().performPasswordUpperCaseValidation(getCellValue("SignUp", 2, 2));
		pm.getSignUpPage().performPasswordOneNumberValidation();
		pm.getSignUpPage().performPasswordSpecialcharValidation();
		pm.getSignUpPage().performFirstNameValidation(getCellValue("SignUp", 1, 3));
		pm.getSignUpPage().performlastNameValidation(getCellValue("SignUp", 1, 4));
		pm.getSignUpPage().performAptSuiteBldgValidation(getCellValue("SignUp", 1, 5));
		pm.getSignUpPage().performStreetCityAddressValidation(getCellValue("SignUp", 1, 6));
		pm.getSignUpPage().performpostCodeValidation(getCellValue("SignUp", 1, 7));

	}

	@Test(priority = 2)
	public void enterValuesForSignUP() {
//		pm.getPreLogin().vendorLogin();
//		pm.getLogin().clickRegisterNowlink();
		pm.getSignUpPage().randmEmail();
		pm.getSignUpPage().randomMobileNumbers();
		pm.getSignUpPage().randomPassword();;
		pm.getSignUpPage().randomFirstName();
		pm.getSignUpPage().randomLastName();
		pm.getSignUpPage().randomAptSuiteBldgName();
		pm.getSignUpPage().randomStreetCityAddressName();
		pm.getSignUpPage().randomPostCode();

	}

	@AfterClass
	public void closeBrowser() {
		//quitWindow();
	}
}
