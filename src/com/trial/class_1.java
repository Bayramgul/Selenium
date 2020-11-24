package com.trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_1 {

	public static void main(String[] args) throws InterruptedException {
//		1. connect web browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
//		2. go ahead and launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form"); 
		
		
//		 locating username
//		WebElement firstname=driver.findElement(By.id("firstName"));
//		firstname.sendKeys("John");
////		locating submit button
//		WebElement submit=driver.findElement(By.id("btn btn-primary"));
//		submit.click();
//		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.close();

	}

}
