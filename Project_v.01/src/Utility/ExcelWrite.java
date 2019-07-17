package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite 
{
	XSSFWorkbook wb = null;
   	XSSFSheet ws = null;
	    
public void writeExcel(String path, String sheet, String[] data) throws Exception
{

	    
    File file = new File(path);
	FileInputStream fs = new FileInputStream(file);
	wb = new XSSFWorkbook(fs);
    ws = wb.getSheet("Sheet1");
    int rowCount = ws.getLastRowNum();
    //int colCount =
    
    Row row = ws.createRow(rowCount+1);
    
    for(int j = 0 ; j < data.length ; j++)
    {  	
		Cell cell = row.createCell(j);
		cell.setCellValue(data[j]);
    }
    
	fs.close();
	FileOutputStream fo = new FileOutputStream(file);
	wb.write(fo);
    fo.close();
}

}
