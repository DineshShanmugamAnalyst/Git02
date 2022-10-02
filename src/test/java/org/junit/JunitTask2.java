package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTask2 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	
	@Before
	public void beforeMethod() {

	long timeMillis = System.currentTimeMillis();
	
	System.out.println(timeMillis);
	}
	
 
	@Test
	public void login() {

	 WebElement usrname = driver.findElement(By.id("email"));
	 
	 usrname.sendKeys("Greens");
	  
	  WebElement password= driver.findElement(By.id("pass"));
	  
	  password.sendKeys("12345");
	  
	  
	 WebElement btnlogin = driver.findElement(By.id("login"));
	 
	 btnlogin.click();
	 
	  }
	
	@After
	public void afterMethod() {

		long timeMillis = System.currentTimeMillis();
		
		System.out.println(timeMillis);
		
	}
	
	@AfterClass
	public static void afterClass() {
       
		driver.quit();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
