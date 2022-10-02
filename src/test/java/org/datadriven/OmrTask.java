package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OmrTask {
	
public static void main(String[] args) throws IOException {
	
//	path of excel
	
File file = new File("E:\\eclipse-workspace\\MavenProject\\Excel\\New Microsoft Excel Worksheet.xlsx");	
// Get the objects /bytes from file;
	FileInputStream stream = new FileInputStream(file);
	
// create workbook : collection of sheets
	Workbook workbook = new XSSFWorkbook(stream);
	
//	Get the sheet
	Sheet sheet = workbook.getSheet("OmrTask1");
	
//get the row
	Row row = sheet.getRow(1);
	
//get the cell	
	Cell cell = row.getCell(2);
	
	System.out.println(cell);

	
}

}