package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	
	static WebDriver driver; 
	
@BeforeClass
	public static void beforeClass() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
    
	driver.manage().window().maximize();


}	

@AfterClass
public static void afterClass() {

//	driver.quit();
}	

@Before
public void beforeMethod() {
long times = System.currentTimeMillis();
System.out.println(times);
	
}

@Test

public void login() {

	WebElement usr = driver.findElement(By.id("username"));
	
	usr.sendKeys("Greens");
	
	WebElement pss = driver.findElement(By.id("password"));
	
	pss.sendKeys("123345");
	
	WebElement btnlogin = driver.findElement(By.id("login"));
	
	btnlogin.click();
	
	}

@After
public void afterMethod() {

	long times = System.currentTimeMillis();
	
	System.out.println(times);
	
}


}
