package com.TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.pages.LoginPage;
import com.pages.PreLoginPage;
import com.pages.SignUpPage;

public class TC004_SignUpPage extends BaseClass {

	@Test
	public void registerNow() throws InterruptedException {

		PreLoginPage plp = new PreLoginPage(driver);
		plp.clickVendorLoginbtn();

		LoginPage lp = new LoginPage(driver);
		lp.clickRegisternowLink();
		Thread.sleep(3000);

		SignUpPage sp = new SignUpPage(driver);
		sp.setEmailId("abc@gmail.com");
		sp.setMobileNo("9898989898");
		sp.setPswd("Test@1232");
		sp.setFirstName("bhanu");
		sp.setLastName("prakash");
		sp.setAptBldSuite("hfhf");
		sp.setStreetCityAddress("hfhg");
		sp.setPostCode("98989");
		
	

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
		js.executeScript("document.querySelector('.signup-box').scrollTop=5000");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		sp.clickloginhereLink();
		Thread.sleep(3000);

	}

}
