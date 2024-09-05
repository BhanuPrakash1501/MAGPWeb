package com.TestClasses;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.LoginPage;
import com.pages.PreLoginPage;

public class TC002_VendorLoginPage extends BaseClass{
	
	@Test
	public void loginVendor() throws InterruptedException {
		
		PreLoginPage pl = new PreLoginPage(driver);
		pl.clickVendorLoginbtn();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmailId("loprautrewoubo-4208@yopmail.com");
		lp.setPswd("Test@123");
		//lp.clickSubmitbtn();
		
		//lp.clickForgetPassworslink();
		//lp.clickGooglebtn();
		Thread.sleep(2000);
		lp.clickRegisternowLink();
		Thread.sleep(5000);
		
		
		
	}

}
