package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFramework {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-workspace\\MavenProject\\Excel\\Sample.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		
//Row row = sheet.getRow(1);
	
		
//	Cell cell = row.getCell(1);
//		System.out.println(cell);
		
	
//	 all the cell values in row 2  
	
	
//	for (int i = 0; i <row.getPhysicalNumberOfCells(); i++) {
		
//		Cell cell = row.getCell(i);
		
//		System.out.println(cell);
		
		
		
//	}
	
	System.out.println("********************");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		
		
//		Get the Each Row;
		    
		Row row = sheet.getRow(i);
		     
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		
//	Get the Each Cell;	
		
		Cell cell = row.getCell(j);
		System.out.println(cell);
		
		
	}
	}
	
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	