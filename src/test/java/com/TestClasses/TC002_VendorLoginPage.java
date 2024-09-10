package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.LoginPage;
import com.pages.PreLoginPage;

public class TC002_VendorLoginPage extends BaseClass{
	
	@BeforeClass
	public void openBrowser() throws IOException {
		getDriver(getCellValue("TestData", 1, 0));
		maximizeWindow();
		implicitWait(10);
	
		
		enterAppInUrl(getCellValue("TestData", 1, 1));
	}
	
	@Test
	public void vendorLogin() throws IOException {
		
		PreLoginPage pl = new PreLoginPage(driver);
		pl.vendorLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.performLogin(getCellValue("Testdata", 2,3), getCellValue("Testdata", 2,4));
		
		
		
		
	}
	
	
	

}
