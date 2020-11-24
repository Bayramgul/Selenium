package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		String amazon="https://www.amazon.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(amazon);
		String expectedUrl="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualUrl=driver.getTitle();
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Ttile is as expected");
		}else {
			System.out.println("Ttile is NOT as  expected");

		}
//		
//		String url = driver.getCurrentUrl();// returns a string
//		System.out.println("Current Url is:" + url);
//		String title=driver.getTitle();//returns title in string
//		System.out.println("Title of the browser is "+title);
		driver.close();
		
	}

}
