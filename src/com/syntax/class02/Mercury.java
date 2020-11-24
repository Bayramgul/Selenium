 package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
 */
public class Mercury {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Register here")).click();//almost same with partialLink text
//		driver.findElement(By.name("firstName")).sendKeys("bayramgul");
//		driver.findElement(By.name("lastName")).sendKeys("atageldiyeva");
//		driver.findElement(By.name("phone")).sendKeys("1223556");
//		driver.findElement(By.id("userName")).sendKeys("gul124@gmail.com");
//		driver.findElement(By.name("address1")).sendKeys("1234 Distrcict ave");
//		driver.findElement(By.name("city")).sendKeys("Fairfax ");
//		driver.findElement(By.name("state")).sendKeys("VA");
//		driver.findElement(By.name("email")).sendKeys("gul124@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("abcd123");
//		driver.findElement(By.name("confirmPassword")).sendKeys("abcd123");
//		driver.findElement(By.name("register")).click();;
	}

}
