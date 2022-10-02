package org.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1Fb {
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

	
//	driver.quit();
}	
	
@Before
public void beforeMethod() {

long currentTimeMillis = System.currentTimeMillis();

System.out.println(currentTimeMillis);
	
	
}

@Test
public void login() {

	WebElement usrname = driver.findElement(By.id("email"));
	
	usrname.sendKeys("Greens");
	
	String attribute = usrname.getAttribute("value");
	
	Assert.assertEquals("verify username","Greens",attribute);
	
//	Assert.assertTrue(false);

	
	WebElement password = driver.findElement(By.id("pass"));
	
	password.sendKeys("1234567");
	
	String attribute2 = password.getAttribute("value");
	
	Assert.assertEquals("verify pass","1234567",attribute2);
	
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	
	String title = driver.getTitle();

//	System.out.println(title);
//boolean b = title.contains("sign up");
//Assert.assertTrue("verify title", b);

}
@After
public void afterMethod() {

	long currentTimeMillis = System.currentTimeMillis();
	
	System.out.println(currentTimeMillis);
	
}



















	
	

}
