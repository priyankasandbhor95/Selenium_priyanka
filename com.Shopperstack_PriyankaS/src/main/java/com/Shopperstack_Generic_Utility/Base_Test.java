package com.Shopperstack_Generic_Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Shopperstack_PriyankaS_POM.ss_proj_pom_home_3;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_login_2;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_welcome_1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	public WebDriver driver;
	public static WebDriver sDriver;
	public File_Utility file_Uti=new File_Utility();
	public ss_proj_pom_welcome_1 welcome;
	public ss_proj_pom_login_2 loginpage;
	public ss_proj_pom_home_3 homepage;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Java_utility jutility=new Java_utility();
	public Web_Driver_utility webdriver_utility=new Web_Driver_utility();
	public WebDriverWait wait;

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("@BeforeTest");
		spark=new ExtentSparkReporter(FrameworkConstants.extentReportPath+jutility.localDateTime()+".html");
		reports=new ExtentReports();
		reports.attachReporter(spark);

		
	}
	
	@BeforeClass
	public void beforeclass() throws IOException
	{
		String browser=file_Uti.readPropertyData("browserName");
		String url=file_Uti.readPropertyData("urlName");
	
	
//*********************cmd code next two line*********************//
		//String browser=System.getProperty("browserName");
		//String url=System.getProperty("urlName");
		
		System.out.println("@BeforeClass");
		if(browser.toLowerCase().contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.toLowerCase().contains("firefox")) {
			
			driver=new FirefoxDriver();
			
		}
		else if (browser.toLowerCase().contains("edge")) {
			driver=new EdgeDriver();
		}
		else  {
			System.out.println("enter valid browser names");
		}
		sDriver=driver;
		homepage=new ss_proj_pom_home_3(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException, InterruptedException
	{
		System.out.println("@BeforeMethod");
		welcome=new ss_proj_pom_welcome_1(driver);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getLoginButton()));
		Thread.sleep(3000);
		welcome.getLoginButton().click();
		Thread.sleep(3000);

		loginpage=new ss_proj_pom_login_2(driver);
		loginpage.getEmailText().sendKeys(file_Uti.readPropertyData("email"));
		loginpage.getPasswordText().sendKeys(file_Uti.readPropertyData("password"));
		loginpage.getLoginButton().click();
		
		
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(homepage.getAccountSettings() ));
		Thread.sleep(3000);
		homepage.getAccountSettings().click();
		homepage.getLogOutSettings().click();
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException 
	{
		System.out.println("@AfterClass");
		
		Thread.sleep(3000);
		driver.quit();

	}
	
	@AfterTest
	public void  aftertest()
	{
		System.out.println("@AfterTest");
		reports.flush();
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("@AfterSuite");

	}

}
