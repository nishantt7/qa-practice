package com.keywordriven.qa.practice.uility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static XSSFWorkbook xssfworkbook;
	public static XSSFSheet xssfsheet;
	public static XSSFCell xssfcell;
	public static XSSFRow xssfrow;

    public static void setExcelFile(String Path,String SheetName) throws Exception 
    {
    FileInputStream ExcelFile = new FileInputStream(Path);
    xssfworkbook = new XSSFWorkbook(ExcelFile);
    xssfsheet = xssfworkbook.getSheet(SheetName);
    }
    public static String getcelldata(int RowNum, int ColNum)
    {
    	xssfcell=xssfsheet.getRow(RowNum).getCell(ColNum);
    	String method=xssfcell.getStringCellValue();
    	return method;
    }
}
