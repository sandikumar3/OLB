package com.TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

public class VerifyMinimumAmountTransfer extends GenericKeywords {
	
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void setUp(){
		extent=ExtentManager.GetExtent();
		executeDriverScript();
		test=extent.createTest(this.getClass().getSimpleName());
		test.log(Status.INFO, "Application url navigated" );
		getElement(ObjectRepository.username_txt).sendKeys("user8141758");
		getElement(ObjectRepository.password_txt).sendKeys("Kony@123");
		test.log(Status.INFO, "Username and Password entered" );
		getElement(ObjectRepository.login_btn).click();
		Assert.assertTrue(getElement(ObjectRepository.logout_lnk).isDisplayed());
		test.log(Status.INFO, "User logged in successfully" );
	}
	
	@Test
	public void verifyMinimumTransfer() throws InterruptedException
	{
		
		getElement(ObjectRepository.transferPay).click();
		
		test.log(Status.INFO, "Transfer tab clicked" );
		
		getElement(ObjectRepository.transferMoney).click();
		Thread.sleep(5000);
		verifyElementPresent(ObjectRepository.transferscreentitle);
		test.log(Status.INFO, "Transfer screen title is verified" );
		
		getElement(ObjectRepository.continuebtn_MyTDECU).click();
		test.log(Status.INFO, "Continue button for MY TDECU account clicked" );
		
		verifyElementPresent(ObjectRepository.fromacntdroparw);
		getElement(ObjectRepository.fromacntdroparw).click();
		getElement("//div[contains(text(),'40073')]").click();
		test.log(Status.INFO, "From Account selected" );
		
		getElement(ObjectRepository.toacntdroparw).click();
		getElement("//div[contains(text(),'52821')]").click();
		test.log(Status.INFO, "To Account selected" );
		
		WebElement amounttxt=getElement(ObjectRepository.amount_txt);
		test.log(Status.INFO, "Amount" );
		amounttxt.clear();
		test.log(Status.INFO, "Amount field made empty" );
		
		amounttxt.sendKeys(Keys.TAB);
		WebElement confirmbtn=getElement(ObjectRepository.maketransfer_btn);
		Thread.sleep(5000);
		String elementdisabled=confirmbtn.getAttribute("kdisabled");
		Assert.assertEquals(elementdisabled, "true");
		test.log(Status.INFO, "Make Transfer button is disabled when amount not entered");
		
		amounttxt.sendKeys("1.9");
		test.log(Status.INFO, "Amount entered greater than minimum amount" );
		amounttxt.sendKeys(Keys.TAB);
		elementdisabled=confirmbtn.getAttribute("kdisabled");
		Assert.assertEquals(elementdisabled, "false");
		test.log(Status.INFO, "Make Transfer button is enabled when more than minimum amount entered");
		
		test.log(Status.PASS, "Minimum amount scenarios working fine");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		driver.quit();
		
	}
}
