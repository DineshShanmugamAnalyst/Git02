package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File ("E:\\eclipse-workspace\\MavenProject\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("OmrTask1");
		
		Row row = sheet.getRow(1);
		
		
		Cell cell = row.createCell(11);
		
		cell.setCellValue("API");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		workbook.write(fileOutputStream);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
