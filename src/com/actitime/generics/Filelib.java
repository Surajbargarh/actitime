package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public String getProperty(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	
	public String getExceldata(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/actitimedata.xlsx");
	     Workbook w=WorkbookFactory.create(fis);
	     String data=w.getSheet(sheetname).getRow(row).getCell(cell).getCellFormula();
	     return data;
	}

}
