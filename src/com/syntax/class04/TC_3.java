package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_3 {
	/*
	 * TC 3: Syntax Demo input boxes count: Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Simple Form Demo” links Get all input boxes from the
	 * page Enter “Hello” to each text box Close browser
	 */

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
	driver.findElement(By.className("dropdown-toggle")).click();// a.dropdown-toggle for WebElements//"a[aria-expanded='true']"
	driver.findElement(By.partialLinkText("Simple Form Demo")).click();
	List<WebElement> textBoxList=driver.findElements(By.cssSelector("input[type='text']"));
	for(WebElement text:textBoxList) {
		text.sendKeys("Hello");
	}
	Thread.sleep(2000);
	//driver.close();
	//driver.quit();
	}

}
