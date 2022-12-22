package com.framework.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrulanceDataLibrary {
	public static Object[][] readExcelData(String excelfileName,String sheetName) {
		XSSFWorkbook wbook;
		Object[][] data = null ;
		try {
			wbook = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
			XSSFSheet sheet = wbook.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			data = new Object[rowCount][colCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					data[i-1][j] =  sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(data[i-1][j]);
				} 
			}
			wbook.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data;
	}
}