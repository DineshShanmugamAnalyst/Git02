package org.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
    driver.findElement(By.id("email")).sendKeys("Greens");
    
    driver.findElement(By.id("pass")).sendKeys("12345678");
	
	driver.findElement(By.id("loginbutton")).click();
	
	
	
	
}
	
	
	

}
