package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {
	/*
	 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username Leave password field empty Verify error message with text
	 * “Password cannot be empty” is displayed.
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
		userName.clear();
		userName.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement errorMessage=driver.findElement(By.cssSelector("span#spanMessage"));
		String Text=errorMessage.getText();
		if(errorMessage.isDisplayed()) {
			System.out.println(Text+".Test passed.");
		}else {
			System.out.println("Negative test case failed!");
		}

	}

}
