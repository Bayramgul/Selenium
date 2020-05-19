package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//tagName[attributeName='attributeValue']   No @ sign and // used    tagName#id   tagName.className
		driver.findElement(By.cssSelector("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("bayramgul");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("atageldiyeva");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("1223556");
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("gul124@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("1234 Distrcict ave");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Fairfax ");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("VA");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("2274934");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("gul124@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("abcd123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("abcd123");
		driver.findElement(By.cssSelector("input[src='/images/forms/submit.gif']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
