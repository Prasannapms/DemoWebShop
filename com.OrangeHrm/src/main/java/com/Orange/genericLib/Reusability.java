package com.Orange.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reusability {
	
	public String getDataFromProperty(String filePath,String key) throws IOException  {
		FileInputStream f = new FileInputStream(filePath);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
	}
	
	public String getDataFromExcelSheet(String path, String sheetName, int rowNo, int cellNo) throws IOException {
	FileInputStream f = new FileInputStream(path);
	Workbook book = WorkbookFactory.create(f);
	Sheet sheet = book.getSheet(sheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	return cell.getStringCellValue();

}
}
