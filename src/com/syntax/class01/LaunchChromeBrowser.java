package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String url=driver.getCurrentUrl();System.out.println(url);	//4)get current url,validate if you landed correct
		
		System.out.println(driver.getTitle());
	}

}
