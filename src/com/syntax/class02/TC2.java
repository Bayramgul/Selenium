package com.syntax.class02;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) {
		/*
		 * TC 2: Syntax Page URL Verification: Open chrome browser Navigate to
		 * “https://www.zillow.com/” Navigate to “https://www.google.com/” Navigate back
		 * to Zillow Page Refresh current page Verify url contains “Zillow”
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.zillow.com/");//will store the browser history
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		String Url=driver.getCurrentUrl();
		if(Url.equals("www.zillow.com/")) {
			driver.navigate().refresh();
		}
		if(Url.contains("Zillow")) {
			System.out.println("Current page contains : Zillow");
		}else {
			System.out.println("Current page doesn't contain : Zillow");
		}if(Url.contains("zillow")) {
			System.out.println("Current page contains : zillow");
		}

	}

}
