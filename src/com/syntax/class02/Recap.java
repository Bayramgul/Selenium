package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		String fbUrl="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(fbUrl);
		String url = driver.getCurrentUrl();// returns a string
		System.out.println("Current Url is:" + url);
		String title=driver.getTitle();//returns title in string
		System.out.println("Title of the browser is "+title);
		driver.close();
	}

}
