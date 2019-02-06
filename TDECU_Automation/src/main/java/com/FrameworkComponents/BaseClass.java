package com.FrameworkComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	public static ExcelReader excl;
	public static String sheetName;
	public static String myTestCaseName;
	public static String browser;
	public static String url;
	public static String username;
	public static String password;
	public static boolean continuetestcase;
	public static int startIter;
	
	public void executeDriverScript(){
		readExcelData();
		sheetName="General";
		int rowCountGeneralSheet = excl.getRowCount(sheetName);
		System.out.println(rowCountGeneralSheet);
		for(int row=1;row<=rowCountGeneralSheet;row++)
			{
				if(myTestCaseName.equals(excl.getCellData(sheetName, 0,row)))
				{
					 
					if(excl.getCellData(sheetName, 2,row).equals("Yes"))
					{
						continuetestcase=true;
						url=excl.getCellData(sheetName,1, row);
						browser=excl.getCellData(sheetName,3,row);
						username=excl.getCellData(sheetName,4,row);
						password=excl.getCellData(sheetName,5,row);
						if(browser.equalsIgnoreCase("Chrome")){
							System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\chromedriver.exe");
							driver=new ChromeDriver();
						}else if(browser.equalsIgnoreCase("IE")){
							System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\ÏEDriverServer.exe");
							driver=new InternetExplorerDriver();
						}else if(browser.equalsIgnoreCase("Firefox")){
							System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\geckodriver.exe");
							driver=new FirefoxDriver();
						}
						driver.get(url);
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					}
				}
			}	
					
		
	}
	
	public void readExcelData(){
		System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\TestData.xlsx");
		excl=new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\TestData.xlsx");
	}
	
}
