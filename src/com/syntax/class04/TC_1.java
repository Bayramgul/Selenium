package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {
	/*
	 * TC 1: HRMS Application Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username and password Click on login button Then verify Syntax Logo is
	 * displayed.
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
		userName.clear();
		userName.sendKeys("Admin");
		WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
		password.clear();
		password.sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement logo=driver.findElement(By.xpath("//img[contains(@src,'syntax')]"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed, Test case passed");
		}else {
			System.out.println("Logo is NOT  Displayed, Test case failed");
		}
		//driver.quit();
	}

}
