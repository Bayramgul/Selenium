package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfEbay_TAGNAME {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));// all links starts with tagName a,findElements using tagName a
		//it always returns list of web-elements
		allLinks.size();
		System.out.println("Size of all Links on Ebay:: "+allLinks.size());//print list of WebElement
		int count=0;
		for(WebElement link:allLinks) {
			String text=link.getText();//getText() will return the inner text of web-element or visible text on UI
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Total number of link is: "+count);
		driver.quit();
	}
	
}
