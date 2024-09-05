package com.TestClasses;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.ForgetPasswordPage;
import com.pages.LoginPage;
import com.pages.PreLoginPage;

public class TC003_ForgetPassWordPage extends BaseClass{
	
	
	@Test
	public void setForgetPassword() throws InterruptedException {
		
		PreLoginPage plp = new PreLoginPage(driver);
		plp.clickVendorLoginbtn();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.clickForgetPassworslink();
		
		
		ForgetPasswordPage fpp = new ForgetPasswordPage(driver);
		fpp.enterEmail("loprautrewoubo-4208@yopmail.com");
		Thread.sleep(2000);
		fpp.clickSendLink();
		Thread.sleep(3000);
		
		
		
	}

}
