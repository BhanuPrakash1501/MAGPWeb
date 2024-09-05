package com.TestClasses;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.PreLoginPage;
import com.pages.StaffLogin;

public class TC005_StaffLogin extends BaseClass{

	@Test
	public void signIn() throws InterruptedException {
		
		
		
		PreLoginPage pl = new PreLoginPage(driver);
		pl.clickStaffLoginbtn();
		
		StaffLogin sl = new StaffLogin(driver);
		sl.setEmailId("uday@malaysiaairports.com.my");
		sl.clickNextbtn();
		sl.setPswd("Apss@042024");
		sl.clickSignbtn();
		sl.clickNobtn();
		Thread.sleep(4000);
		
	}
}
