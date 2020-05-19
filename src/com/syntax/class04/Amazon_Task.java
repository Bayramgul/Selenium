package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Task {
	/*
	 * Get all links Get number of links that has text Print to console only the
	 * links that has text
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));// all links starts with a,findElements using tagName a
		//Thread.sleep(1000);
		allLinks.size();
		int count=0;
		for(WebElement link:allLinks) {
			//Thread.sleep(1000);
			String text=link.getText();
			if(!text.isEmpty()) {
				Thread.sleep(1000);
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Total number of link is: "+count);
		driver.quit();
	}

}
