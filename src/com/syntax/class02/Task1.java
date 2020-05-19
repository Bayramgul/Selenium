package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	static WebDriver driver;
	public static void browser(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
		driver = new FirefoxDriver();
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream inStream = new FileInputStream("/Users/Bayramgul/eclipse-workspace/JavaBasics/privateinfo.properties");
		Properties prop = new Properties();
		prop.load(inStream);
		String browser = prop.getProperty("browser");
		browser("Chrome");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		

	}

}
