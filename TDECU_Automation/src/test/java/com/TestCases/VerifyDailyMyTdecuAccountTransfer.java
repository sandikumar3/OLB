package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FrameworkComponents.ExtentManager;
import com.FrameworkComponents.GenericKeywords;
import com.FrameworkComponents.ObjectRepository;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class VerifyDailyMyTdecuAccountTransfer extends GenericKeywords {

	ExtentReports extent;
	ExtentTest test;
/*
 * 	Automation script for TDB-2020 and TDB-2021
 */
	@BeforeTest
	public void setUp(){
		extent=ExtentManager.GetExtent();
		executeDriverScript();
		test=extent.createTest(this.getClass().getSimpleName());
		test.log(Status.INFO, "Application url navigated" );
		getElement(ObjectRepository.username_txt).sendKeys("user50225500");
		getElement(ObjectRepository.password_txt).sendKeys("Kony@432");
		test.log(Status.INFO, "Username and Password entered" );
		getElement(ObjectRepository.login_btn).click();
		Assert.assertTrue(getElement(ObjectRepository.logout_lnk).isDisplayed());
		test.log(Status.INFO, "User logged in successfully" );
	}
	
	@Test
	public void verifyDailyTransfer()throws InterruptedException{
		
		getElement(ObjectRepository.transferPay).click();
		test.log(Status.INFO, "Transfer tab clicked" );
		getElement(ObjectRepository.transferMoney).click();
		test.log(Status.INFO, "Transfer money link clicked" );
		Thread.sleep(5000);
		verifyElementPresent(ObjectRepository.transferscreentitle);
		test.log(Status.INFO, "Transfer screen title is verified" );
		
		getElement(ObjectRepository.continuebtn_MyTDECU).click();
		test.log(Status.INFO, "Continue button for MY TDECU account clicked" );
		
		verifyElementPresent(ObjectRepository.fromacntdroparw);
		getElement(ObjectRepository.fromacntdroparw).click();
		getElement("//div[contains(text(),'57610')]").click();
		test.log(Status.INFO, "From Account selected" );
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		getElement(ObjectRepository.toacntdroparw).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@kcontainerid='segRecipientName' and contains(text(),'37954')]")).click();
		test.log(Status.INFO, "To Account selected" );
		
		getElement(ObjectRepository.amount_txt).clear();
		test.log(Status.INFO, "Amount" );
		getElement(ObjectRepository.amount_txt).sendKeys("1.13");
		test.log(Status.INFO, "Amount entered greater than minimum amount" );
		scrollToElement(ObjectRepository.frequencydrop);
		selectDropdownOpt(ObjectRepository.frequencydrop,"Daily");
		verifyDropdownSelection(ObjectRepository.frequencydrop,"Daily");
		test.log(Status.INFO, "Frequency selected as Daily and verified" );
		
		verifyDropdownSelection(ObjectRepository.howlongdrop,"On a Specific Date");
		verifyElementPresent(ObjectRepository.sendOnCal);
		verifyElementPresent(ObjectRepository.endOnCal);
		
		getElement(ObjectRepository.notes_txt).sendKeys("2612 Notes");
		test.log(Status.INFO, "Notes entered" );
		
		getElement(ObjectRepository.maketransfer_btn).click();
		test.log(Status.INFO, "Make Transfer button clicked" );
		
		verifyElementPresent(ObjectRepository.confirm_header);
		getElement(ObjectRepository.confirm_btn).click();
		test.log(Status.INFO, "Confirm button clicked" );
		
		verifyElementPresent(ObjectRepository.success_msg);
		test.log(Status.INFO, "Success Transfer screen verified");
		
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws Throwable{
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(Status.FAIL, "Test Failed"+result.getThrowable());		
		}else
		{
			test.log(Status.PASS, "Daily TDECU account transfer scenario working fine");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		driver.quit();
	}
}
