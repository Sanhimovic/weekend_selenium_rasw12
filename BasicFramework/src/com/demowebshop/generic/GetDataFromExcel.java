package com.demowebshop.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel implements Framework_Constants{

	public static Object[][] getDataFromExcel(String shet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(shet);
		int row_count = sheet.getPhysicalNumberOfRows();
		int cell_count = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object [][]data=new Object[row_count-1][cell_count]; 
		
		for(int i=0;i<row_count-1;i++)
		{
			for(int j=0;j<cell_count;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	public static String getSingleData(String shet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(shet);
		String value = sheet.getRow(row).getCell(cell).toString();
		return value;
	}
}
