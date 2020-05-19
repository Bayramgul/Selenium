package com.syntax.class08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class WaitDemo extends BaseClass{

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		setUp();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.cssSelector("div#checkbox")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);// we can use this wait obj for another wait condition later in this code
		WebElement  goneText=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		String text=goneText.getText();
		System.out.println(text);
		driver.close();
	}

}
