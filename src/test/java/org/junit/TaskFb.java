package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFb {
 static WebDriver driver;
 
	@BeforeClass
	public static void beforeClass() {

	 WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/"); 
	driver.manage().window().maximize();
	
}		
	
	@AfterClass
	public static void afterClass() {

//		driver.quit();
	}
	
	@Before
	public void beforeMethod() {

		long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);
		
	}
	
	@Test
	public void login() {

	WebElement usrName = driver.findElement(By.id("email"));
	usrName.sendKeys("greenbs");
	
	WebElement psW = driver.findElement(By.id("pass"));
	psW.sendKeys("12345");
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
		
	}
	
	@After
	public void afterMethod() {

		long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);
		
		
	}
	
	
	
	
	
	
	
	
	

}
