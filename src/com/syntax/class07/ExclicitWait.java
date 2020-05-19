package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExclicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='save'")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);//creating an object of WebDriverWait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome to Syntax Technologies']")));

		boolean isDispl=driver.findElement(By.xpath("//h4[contains(text(),'Welcome to Syntax Technologies')]")).isDisplayed();
		
		
		
		System.out.println("First Name is Displayed: "+isDispl);
	}

}
