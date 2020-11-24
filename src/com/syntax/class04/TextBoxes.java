package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
	public static String url="https://demoqa.com/automation-practice-form";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		/*
		 * 1.go to the website https://demoqa.com/automation-practice-form
		 * 2. Write the firstname  and Lastname then 
		 * 3. clear them and type another person's name
		 * 4. submit  
		 */
		driver.get(url);
//		1.way 
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Adam");// firstname textbox
//		driver.findElement(By.cssSelector("#lastName")).sendKeys("Williams"); // lastname textbox 
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='firstName']")).clear(); 
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jonn");
//		driver.findElement(By.cssSelector("#lastName")).clear();
//		driver.findElement(By.cssSelector("#lastName")).sendKeys("Doe");
//		Thread.sleep(2000);
//		2.way ==> Storing WebELemnts will help code redudancy and reusabilty
		WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Adam");
		WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
		lastName.sendKeys("Willaims");
		firstName.clear();
		firstName.sendKeys("John");
		lastName.clear();
		lastName.sendKeys("Doe");
		System.out.println(driver.findElement(By.xpath("//div[text()='Practice Form']")).getText());
		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		driver.close();
	}
	}


