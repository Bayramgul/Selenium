package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/");
//		WebElement searcBox=driver.findElement(By.cssSelector("input#gh-search-input"));
//		searcBox.sendKeys("ipad");
//		searcBox.click();
		//WebElement searchIcon= driver.findElements(By.cssSelector("img[alt='Search Icon']")).sub
		
	}

}
