package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead 
{
	
	public void readExcel(String path,String Sheetname) throws Exception 
	{
		FileInputStream file = new FileInputStream(new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(Sheetname);
		int rowvalue = sheet.getLastRowNum();
		
		for(int i=0;i<=rowvalue;i++) 
		{
			for(int j=0;j<=rowvalue;j++) 
			{
				
				System.out.println(sheet.getRow(i).getCell(j));
			}
		}
		

	}
	
	//public void read(String path,String sheetname) throws Exception  
	public Object[][] read(String path,String sheetname) throws Exception  
	{
		try 
		{
			
	    String[][] data = null;
	    FileInputStream file = new FileInputStream(new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rowvalue = sheet.getPhysicalNumberOfRows();
		int colvalue = sheet.getRow(0).getLastCellNum();
		System.out.println("row value"+rowvalue);
		System.out.println("col value"+colvalue);
		data= new String[rowvalue][colvalue];
		

		for(int i=0; i<rowvalue;i++) 
		{
			
			for(int j=0;j<colvalue;j++) 
			{
				Cell cell= sheet.getRow(i).getCell(j);
				data[i][j]= cell.getStringCellValue();
				System.out.print(data[i][j]+" ");
			}
			System.out.println("");
		} 
		return data;
		}
		catch(Exception e) {
	    	e.printStackTrace();
	    	System.out.println("");
	    }
		return null;
	}
}
