package com.Shopperstack_Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
	public String readPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(FrameworkConstants.propertyFilePath);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
		
		
	}
	
	public String readExcelData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(FrameworkConstants.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		
		
		
		 String value=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		 return value;
	}

}
