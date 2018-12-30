package com.FrameworkComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	 String browser="Chrome";
	
	public void executeDriverScript(){
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Configuration Tools\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ÏE")){
			System.setProperty("webdriver.ie.driver","");
			driver=new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver","");
			driver=new FirefoxDriver();
		}
		driver.get("https://tdecusit.konycloud.com/apps/TDECUOLB/#_frmLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
}
