package com.telecom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;


public class DataDriver {
	public static Workbook wb;
	public static Sheet sheet;
	public static Cell cell;
	public static Row row;
	public static String path = "C:\\Users\\mahe\\Desktop\\Automation Project\\Telecom\\Telecom\\TestData\\TestData.xlsx";

	public static Object[][] getTestData(String sheetname) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = wb.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i + 1);
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				 Cell cell = row.getCell(j);
				 String value;
	                try {
	                    value = cell.getRichStringCellValue().toString();
	                } catch (Exception e) {
	                    value = ((XSSFCell) cell).getRawValue();
	                }
	                data[i][j] = value;
			}
		}
		return data;

	}
}
