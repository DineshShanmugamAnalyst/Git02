package org.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class WaitProg {
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	
//    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.name("username")).sendKeys("Greens");

	driver.findElement(By.name("password")).sendKeys("12345");

}
}