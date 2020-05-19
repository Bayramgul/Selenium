package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		/*
		 * Actual url=http://abcdatabase.com/basicauth
		 * UserName=test
		 * password=test
		 */
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://test:test@abcdatabase.com/basicauth");// you need to pass username and password to launch this webpage
		
		driver.quit();
	}

}
