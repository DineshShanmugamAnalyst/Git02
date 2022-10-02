package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario4 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-workspace\\MavenProject\\Excel\\Greens.xlsx");
		
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Datas");
		
		Row row = sheet.createRow(9);
		
		
		Cell cell = row.createCell(1);
		
		cell.setCellValue("API");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		workbook.write(fileOutputStream);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
