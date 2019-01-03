package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FrameworkComponents.ExtentManager;
import com.FrameworkComponents.GenericKeywords;
import com.FrameworkComponents.ObjectRepository;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class VerifyDisablingEDocuments extends GenericKeywords {
	
	ExtentReports extent;
	ExtentTest test;


	@BeforeTest
	public void setUp(){
		extent=ExtentManager.GetExtent();
		test=extent.createTest(this.getClass().getSimpleName());
		executeDriverScript();
		test.log(Status.INFO, "Application url navigated" );
		getElement(ObjectRepository.username_txt).sendKeys("user8141758");
		getElement(ObjectRepository.password_txt).sendKeys("Kony@123");
		test.log(Status.INFO, "Username and Password entered" );
		getElement(ObjectRepository.login_btn).click();
		Assert.assertTrue(getElement(ObjectRepository.logout_lnk).isDisplayed());
		test.log(Status.INFO, "User logged in successfully" );
	}
	
	
	@Test
	public void verifyDisablingEDocuments() throws InterruptedException{
		Thread.sleep(4000);
		getElement(ObjectRepository.settingsimg).click();
		test.log(Status.INFO, "Settings link clicked" );
		getElement(ObjectRepository.accntsettinglnk).click();
		test.log(Status.INFO, "Account Settings link clicked" );
		
		getElement(ObjectRepository.edoclnk).click();
		test.log(Status.INFO, "e-Documents link clicked" );
		Thread.sleep(4000);
		
		
		getElement(ObjectRepository.enableedocchk).click();
		test.log(Status.INFO, "disable e-documents check clicked" );
		Thread.sleep(4000);
		verifyElementPresent(ObjectRepository.disablepopupttl);
		test.log(Status.INFO, "Disable E-Documents popup gets opened" );
		
		getElement(ObjectRepository.yesbtn).click();
		test.log(Status.INFO, "Yes button clicked on disable e-documents popup" );
		
		
		verifyElementPresent(ObjectRepository.disableack);
		test.log(Status.INFO, "Disabling e-documents success message appearing" );
		test.log(Status.PASS, "Disabling e-Documents working fine" );
	
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		driver.quit();
	}
	
}
