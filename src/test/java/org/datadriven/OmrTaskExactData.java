package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OmrTaskExactData {
	
public static void main(String[] args) throws IOException {

	
//	
	
File file = new File("E:\\eclipse-workspace\\MavenProject\\Excel\\New Microsoft Excel Worksheet.xlsx");

FileInputStream stream = new FileInputStream(file);

Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("OmrTask1");
		
//		Row row = sheet.getRow(i);
		
//		Cell cell = row.getCell(2);
		
//		System.out.println(cell);
//		for (int i = 0; i <row.getPhysicalNumberOfCells() ; i++) {
			
//			Cell cell = row.getCell(i);
			
//			System.out.println(cell);
			
	
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			
//			System.out.println(cell);
			
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING: 
				
				String name = cell.getStringCellValue();
				System.out.println(name);
				break;   

			case NUMERIC:	
				
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					
			SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy");
					String format = dateformat.format(dateCellValue);
				System.out.println(format);
					
					
					
			} else {
					
				double d = cell.getNumericCellValue();
				
			BigDecimal b=new BigDecimal(d);
//				BigDecimal b = BigDecimal.valueOf(d);
			String string = b.toString();
				System.out.println(string);
					
					
		}
			break;	
				
				
				
			default:
				break;
			}
			
			
}
		}
		
}

}
