package com.Shopperstack_Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Web_Driver_utility {
	
	Java_utility jutility=new Java_utility();

	public void takeWebPageScreenShot() throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) Base_Test.sDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameworkConstants.screenshotPath+jutility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
	
	public void takeWebElementScreenShot(WebElement element) throws IOException
	{
		File temp=element.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameworkConstants.screenshotPath+jutility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
	
	
	
	
	public void selectByValue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByValue(Value);
	}

	public void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(WebElement element,String visibleTxt)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibleTxt);
	}
	
	public void deselectByValue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.deselectByValue(Value);
	}
	
	public void deselectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	
	public void deselectByVisibleText(WebElement element,String visibleTxt)
	{
		Select select=new Select(element);
		select.deselectByVisibleText(visibleTxt);
	}
	
	public void deselectall(WebElement element)
	{
		Select select=new Select(element);
		select.deselectAll();
	}
	
	
}
