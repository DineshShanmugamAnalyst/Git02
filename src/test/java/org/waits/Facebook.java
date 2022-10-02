package org.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Greens");
		driver.findElement(By.name("lastname")).sendKeys("Greens");

		
	
		
	}

}
