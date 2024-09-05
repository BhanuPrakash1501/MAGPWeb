package com.TestClasses;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.PreLoginPage;

public class TC001_PreLoginScreen extends BaseClass {

	@Test
	public void checkLoginScreen() throws InterruptedException {

		PreLoginPage plp = new PreLoginPage(driver);

		// Click on vendor Button
		// plp.clickVendorLoginbtn();

		// Click on Guest Button
		// plp.clickGuestLoginbtn();

		// Click on Staff Button
		plp.clickStaffLoginbtn();
		Thread.sleep(5000);
	}

}
