     package org.basclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
//1	
public static WebDriver driver;

	
//1
	public static void getDriver() {
		
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();

}
	
	
//2
	public static void sendUrl(String url) {
   
	driver.get(url);
		
	}
	
//3
	public static void maximizeWindow() {

		driver.manage().window().maximize();
		
	}
	
//4  
	
	public static void elementSendKeys(WebElement element,String data) {

		element.sendKeys(data);		
		
	}
	
//	5
	
	public void elementSendKeysJs(WebElement element,String data) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('Value','"+data+"')",element);
		
		
	}
	
	
//	6
	public static void elementClick(WebElement element) {

		element.click();
		
		
		
	}

//7 
	public String getWindowsTitle() {
		
		String title = driver.getTitle();
		return title;

	}
	
// 8
	public String getCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}	
	
//9 Locators
	public WebElement findLocatorById(String attributeValue) {
		
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
		
	}
	
//	10
	
	public WebElement findLocatorByName(String attributeValue) {

		WebElement element = driver.findElement(By.name(attributeValue));
		
		return element;
	}
	
//	12
	
	public WebElement findLocatorByClassName(String attributeValue) {

		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
		
		
	}
	
//	13

	public WebElement findLocatorByXpath(String xpath) {

		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	
//14 Alert PopUp ;
	
	public void alertOk() {

		Alert al = driver.switchTo().alert();
		
		al.accept();
//		return al;
		
		}
	
//15
   public void  alertCancel() {
	  
		Alert al = driver.switchTo().alert();

		al.dismiss();
//		return al;
	   
	   }	
      
//	16
	
   public void alertSendKeys(String data) {

	 Alert al = driver.switchTo().alert();

	 al.sendKeys(data);
//	return al;
	
	 }
	
//17  Get Attribute 99%;
   
    public static String getAttributeValue(WebElement element) {

	  String value = element.getAttribute("value");
	return value;
}

//  18 GetAttribute 1%;
  
  public String getAttributeValue(WebElement element , String attributeName) {

	  String value = element.getAttribute(attributeName);
	return value;
	  
	 }
  
  
//  19
  
   public static void closeWindow() {

	   driver.close();
	   
}
   
//   20
   
   public static void quitWindow() {

	  driver.quit(); 
	   
}
   
//  21 DropDowns
  
   public void selectOptionByText(WebElement element,String text) {

	   Select select = new Select (element);
	   
	   select.selectByVisibleText(text);
}
   
// 22 
   public void deSelectOptionByText(WebElement element,String text) {

	   Select select = new Select (element);
      select.deselectByVisibleText(text);
	   
}
   
   public String getText(WebElement element) {
     String text = element.getText();
	return text;
	   	   
}
     
 //  23
   
   public void selectOptionByAttribute(WebElement element,String value) {

	   Select select = new Select (element);
      select.selectByValue(value);
	   
	   }
//24

   public void deSelectOptionByAttribute(WebElement element,String value) {
	   Select select = new Select (element);

	   select.deselectByValue(value);
	   
}  
   
//  25
  public void selectOptionByIndex(WebElement element,int index) {

	   Select select = new Select (element);

       select.selectByIndex(index);

   }
   
//   26
   
  public void deselectOptionByIndex(WebElement element,int index) {

	   Select select = new Select (element);

	  select.deselectByIndex(index);
	  
}
   
//27
   public void deSelectAll(WebElement element) {

	   Select select = new Select (element);

	   select.deselectAll();
	   
	   }
  
//  28
   
   public List<WebElement> getOptions(WebElement element) {

	   Select select = new Select (element);
       List<WebElement> options = select.getOptions();
	return options;

   
   }
   
//  29 
   
   public  List<WebElement> getAllSelectedOptions(WebElement element) {

	   Select select = new Select (element);
       List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	return allSelectedOptions;
       
       }
   
//  30
   
   public WebElement getFirstSelectedOptions(WebElement element) {

	   Select select = new Select (element);
	   WebElement firstSelectedOption = select.getFirstSelectedOption();
	return firstSelectedOption;
	   
}
   
// 31
   
   public boolean selectIsMultiple(WebElement element) {

	   Select select = new Select (element);
	   
	 boolean multiple = select.isMultiple();
	return multiple;
	 
	 
	   
}
   
// 32 Alert Get Text
   
   public void alertGetText() {

	   Alert al = driver.switchTo().alert();
	   
	   String text = al.getText();
//	return al;
	   
	   
	   
}
   
// 33 Java ScriptExecutor ;
   
   public Object getAttributeUsingJs(WebElement element) {
  
   JavascriptExecutor js = (JavascriptExecutor) driver;
	   
   Object executeScript = js.executeScript("arguments[0].getAttribute('value')",element);
	   String text = executeScript.toString();

//	   System.out.println(text);
	return text;
	   
}
   
// 34click using Js  ; 
   
   public void clickUsingJs(WebElement element) {

	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()",element);
	   
}

// 35  Scroll Down(true) using js ;
   
     public void scrollDown(WebElement element) {

  	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true)",element);
    	 
	}
//36  ScrollUp (false) using js;     
   
       public void scrollUp(WebElement element) {

	  JavascriptExecutor js = (JavascriptExecutor) driver;

   js.executeScript("arguments[0].scrollIntoView(false)",element);
   
       }
   
// 37 Actions 
       
       public Actions moveToElement(WebElement element) {
    	   
    	   Actions actions = new Actions (driver);
      
    	   actions.moveToElement(element).perform();
		return actions;
    	    }
//38 drag and drop
       
       public Actions dragAndDrop(WebElement source,WebElement destination) {

    	   Actions actions = new Actions (driver);
    	   actions.dragAndDrop(source,destination).perform();
		return actions;
    	   
	}
       
//  39     context click
        public Actions contextClick(WebElement element) {
        	 Actions actions = new Actions (driver);
        	actions.contextClick(element).perform();
			return actions;

	}

// 40 Double Click;
        
        public Actions doubleClick(WebElement element) {
       	 
        	Actions actions = new Actions (driver);

        	actions.doubleClick(element).perform();
			return actions;
		
        }
        
// 41 Action sendkeys
        
        public Actions actionsSendKeys(WebElement element,String data  ) {

        	Actions actions = new Actions (driver);
    
        	 actions.keyDown(Keys.SHIFT).sendKeys(element,data).keyUp(Keys.SHIFT).perform();
			return actions;
        
        
        }
        
// 42  windowHandle
        
       public String getWindowHandle() {
    	    
    	   String windowHandle = driver.getWindowHandle();
	
    	   return windowHandle;
    	   
    	   
    	  } 
        
        
//   43  windowHandles    
        
        public Set<String> getWindowHandles() {

        	Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
        	}
        
//44 Swith to window:
        
        public void switchToWindowId(String windowsId) {

        	driver.switchTo().window(windowsId);
        	
     }
        
// 45        
        public void switchToWindowUrl(String url) {

        	driver.switchTo().window(url);
        	
        	
		} 
        
// 46
        public void switchToWindowTitle(String title) {

        	driver.switchTo().window(title);
        	
		}
       
//47 to find Multiple WebElements;   
       
        public List<WebElement> findMultipleWebElements(String xpath) {

        	List<WebElement> findElements = driver.findElements(By.xpath(xpath));
			
        	return findElements;
        	
        	
		}
       
// 48 Screenshot ;
        
        public void screenShot(String path) throws IOException {

        	TakesScreenshot ts = (TakesScreenshot) driver;
        	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        	
        	File file = new File(path);
        	FileUtils.copyFile(screenshotAs, file);
        	
        }
       
//  49 Get The Value From Excel;
        
//  Get The value from cell:   
// input : Sheet,row,cell       
        
//output : Java[String];        
        
        public  String getData(String sheetName,int rowNum,int cellNum) throws IOException {

       String data = "";
        	
        File file= new File(System.getProperty("user.dir")+"\\Excel\\Adactin.xlsx");
        
        FileInputStream stream = new FileInputStream (file);
        	
        Workbook workbook = new XSSFWorkbook(stream);	
		
        Sheet sheet = workbook.getSheet(sheetName);
        
        Row row = sheet.getRow(rowNum);
        
         Cell cell = row.getCell(cellNum);
        
        CellType cellType = cell.getCellType();
        
        switch (cellType) {
		
        case STRING:
			
			data= cell.getStringCellValue();
			
			break;
        case NUMERIC:
		
        if (DateUtil.isCellDateFormatted(cell)) {
		   Date dateCellValue = cell.getDateCellValue();
        	SimpleDateFormat dateFormat = new SimpleDateFormat("dd//mm//yyyy");
		   
		   data = dateFormat.format(dateCellValue);
		   
		  	} else {

		  		
		 double numericCellValue = cell.getNumericCellValue();
		 
//		 BigDecimal b = BigDecimal.valueOf(numericCellValue);
		  		
//		  	data = b.toString();
 
//Instead Of using BigDecimal: Math.round(); 12.49,12.51-----13;	
		 
		 long round = Math.round(numericCellValue);
		 
		 if (round==numericCellValue) {
			
			 data = String.valueOf(round);
			 
			 } else {

			data = String.valueOf(numericCellValue);
		}
			}
    break;    
        
        
        
        default:
			break;
		}
		return data;
        
        }
       
//   50 Update the value in the cell  Scenario 1 :   
       
// input : SheetName,rowNum,cellNum,OldData,newData :  

// output : No
        
     public void updateData(String sheetName,int rowNum,int cellNum,String oldData,String newData) throws IOException {

    	 File file = new File (System.getProperty("user.dir")+"\\Excel\\Adactin.xlsx");
    	 
    	 FileInputStream stream = new FileInputStream(file);
    	  
    	 Workbook workbook = new XSSFWorkbook(stream);
    	 
        Sheet sheet= workbook.getSheet(sheetName);
    	
        Row row = sheet.getRow(rowNum);
	     
        Cell cell =   row.getCell(cellNum);
     
        CellType cellType = cell.getCellType();
        
        String value = cell.getStringCellValue();
        
        if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
       FileOutputStream fileOutputStream = new FileOutputStream(file);
       workbook.write(fileOutputStream); 
        
     }   
        
        
//   insert value in cell: cell is empty to create the cell an insert the value     
        
//   input: sheetName,rowNum,cellNum

//   output : No ;  Scenario 2;       
        
 public void writeData(String sheetName,int rowNum,int cellNum,String data) throws IOException {

 File file = new File(System.getProperty("user.dir")+"\\Excel\\Adactin.xlsx");

 FileInputStream stream = new FileInputStream(file);

 Workbook workbook = new XSSFWorkbook(stream);

 Sheet sheet =workbook.getSheet(sheetName);
  
 Row row = sheet.getRow(rowNum);
  
 Cell cell = row.createCell(cellNum);                  
  
 cell.setCellValue(data);
  
 FileOutputStream fileOutputStream = new FileOutputStream(file);
 
workbook.write(fileOutputStream);
  
 System.out.println("done");
  
 }
  
//Row and cell is empty : create row and create cell and insert the value ; 
// Scenario 3;
 
 public void createRowData(String sheetName,int rowNum,int cellNum,String data) throws IOException {
     
	 File file = new File (System.getProperty("user.dir")+"\\Excel\\Adactin.xlsx");
	 
	 FileInputStream stream = new FileInputStream(file);
	   
	 Workbook workbook = new XSSFWorkbook(stream);
	 
	Sheet sheet = workbook.getSheet(sheetName);
	
	Row row =sheet.createRow(rowNum);
	 
	Cell cell =row.createCell(cellNum);
	cell.setCellValue(data);

	FileOutputStream fos = new FileOutputStream(file);
	
	workbook.write(fos);
  
 }
 
//   Create Sheet,create row,create cell; 
// scenario 4;
 
 public void createSheet(String sheetName,int rowNum,int cellNum,String data) throws IOException {

	 File file = new File(System.getProperty("user.dir")+"\\Excel\\fileName.xlsx");
	 
	 Workbook workbook = new XSSFWorkbook();
	
	 Sheet sheet = workbook.createSheet(sheetName); 
     
	 Row row = sheet.createRow(rowNum);	 
	 
	 Cell cell = row.createCell(cellNum);
	 
	 cell.setCellValue(data);
 
 FileOutputStream fos = new FileOutputStream(file);
workbook.write(fos);
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     }      
       
       
