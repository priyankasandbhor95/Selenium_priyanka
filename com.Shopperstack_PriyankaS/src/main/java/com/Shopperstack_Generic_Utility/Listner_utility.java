package com.Shopperstack_Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_utility implements ITestListener{
	Java_utility jutility=new Java_utility();
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) Base_Test.sDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameworkConstants.screenshotPath+jutility.localDateTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
