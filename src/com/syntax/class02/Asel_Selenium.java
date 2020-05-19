package com.syntax.class02;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asel_Selenium {
	//public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	
		String filePath="/Users/Bayramgul/eclipse-workspace/JavaBasics/config/privateinfo.properties";
		
		//System.out.println(filePath);
		FileInputStream inStream = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(inStream);
		String browser = prop.getProperty("browser");
		WebDriver driver=null;
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			 driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
			driver = new FirefoxDriver();
			break;
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}

}
