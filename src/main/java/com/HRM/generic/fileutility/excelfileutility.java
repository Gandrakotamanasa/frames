package com.HRM.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelfileutility {

	public String  getdatafromexcel(String sheetname,int row,int cellvalue) throws  IOException
	{
		
		FileInputStream fs1=new FileInputStream("./TestScriptdata/leavedata.xlsx");
	     Workbook wb=WorkbookFactory.create(fs1);
	   String data= wb.getSheet(sheetname).getRow(row).getCell(cellvalue).toString();
		return data;
	}
	
	public int getrowcount(String sheetname) throws Exception
	{
		
		 FileInputStream fs1=new FileInputStream("./TestScriptdata/leavedata.xlsx");
	     Workbook wb=WorkbookFactory.create(fs1);
	     int rowcount= wb.getSheet(sheetname).getLastRowNum();
	     return rowcount;	
	}
	
	public String setdataintoexcel(String sheetname,int row,int cellvalue,String data) throws Exception
	{
		 FileInputStream fs1=new FileInputStream("./TestScriptdata/leavedata.xlsx");
	     Workbook wb=WorkbookFactory.create(fs1);
	     wb.getSheet(sheetname).getRow(row).createCell(cellvalue);
	     
	     FileOutputStream fs=new FileOutputStream("./TestScriptdata/leavedata.xlsx");
	     wb.write(fs);
	     wb.close();
		return data;
	}
	
}
