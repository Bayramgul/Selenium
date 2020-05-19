package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	/*
* TC 1: Facebook sign up: Open chrome browser Go to “https://www.facebook.com/”
 * Enter first name Enter last name Enter mobile number Click on sign up button
 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Bayramgul");
		driver.findElement(By.name("lastname")).sendKeys("Atageldiyeva");
		driver.findElement(By.id("u_0_r")).sendKeys("123456789");
		driver.findElement(By.name("websubmit")).click();
		
	}

}
