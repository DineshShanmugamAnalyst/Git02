package org.findbysfindall;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;

public class A extends BaseClass {
	
	public static void main(String[] args) {
		
		
		getDriver();
		sendUrl("https://www.facebook.com/login/");
		maximizeWindow();
		
	FbLogin f = new FbLogin();
//<<<<<<< HEAD
//System.out.println("DineshShanmugam");		
//=======
System.out.println("DineshS");
	
//>>>>>>> 30843741d228b5d8fd6f8edcd76b27c5cd86cefb
		WebElement username = f.getUsername();
		
		
		username.sendKeys("greens");
		username.clear();
		username.sendKeys("orange");
		username.clear();
		username.sendKeys("GreensTech");

	long withoutcachestart = System.currentTimeMillis();	
		 
		 
		for (int i = 0; i <500; i++) {
			
			String text = f.getUsername().getText();
			
			} 
		 
	long withoutcachelookend = System.currentTimeMillis();
	
	
	System.out.println("Without cache look"+(withoutcachelookend-withoutcachestart));
		 
 WebElement password = f.getPassword();
	
	password.sendKeys("1234567");
	 password.clear();
	 password.sendKeys("456");
	 password.clear();
	 password.sendKeys("123");
 
	long withcachestart = System.currentTimeMillis();
	
	for (int i = 0; i < 500; i++) {
		
	
	String text = f.getPassword().getText();
	
}
		 
	long withcacheEnd = System.currentTimeMillis();
	
	System.out.println("WithCache"+(withcacheEnd-withcachestart));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
