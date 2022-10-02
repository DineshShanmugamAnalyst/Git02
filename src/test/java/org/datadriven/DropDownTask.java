package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTask {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-workspace\\MavenProject\\Excel\\DropDown.xlsx");
		Workbook workbook=new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("DropDownOmr");
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		 WebElement country= driver.findElement(By.id("country-list"));
		 Select select = new Select(country);
		
		 List<WebElement> options = select.getOptions();
		 
		 for (int i = 0; i < options.size(); i++) {
			
			 String text = options.get(i).getText();
			 
			 Row row = sheet.createRow(i);
			 Cell cell = row.createCell(0);
			 cell.setCellValue(text);
			 FileOutputStream fileOutputStream = new FileOutputStream (file);
					 
			 workbook.write(fileOutputStream);
			 
			 
			 
			 
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
