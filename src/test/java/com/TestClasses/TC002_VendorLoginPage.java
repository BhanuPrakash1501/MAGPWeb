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
		getDriver(getCellValue("TestData", 2, 1));
		maximizeWindow();
		implicitWait(10);
	
		
		enterAppInUrl(getCellValue("TestData", 3, 1));
	}
	
	@Test
	public void vendorLogin() throws IOException {
		
		PreLoginPage pl = new PreLoginPage(driver);
		pl.vendorLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.performLogin(getCellValue("Testdata", 0,1), getCellValue("Testdata", 1,1));
		
		
		
		
	}
	
	
	

}
