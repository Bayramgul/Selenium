package com.trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
//		1.Connect chrome browser 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
//		2. Go ahead and open chrome browser
		WebDriver driver=new ChromeDriver();
////		open facebook
//		driver.get("https://www.facebook.com/");
////		Locating username 
//		WebElement username=driver.findElement(By.id("email"));
////		sending text 
//		username.sendKeys("syntax@gmail.com");
//		WebElement password=driver.findElement(By.name("pass"));
//		password.sendKeys("syntax123");
//		WebElement lginBtn=driver.findElement(By.name("login"));
//		lginBtn.click();
//		Thread.sleep(2000);
//		driver.close();
		
//		https://demoqa.com/automation-practice-form 
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement username=driver.findElement(By.id("firstName"));
		username.sendKeys("John");
		
		
	}

}
