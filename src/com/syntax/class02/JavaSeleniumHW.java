package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//use values from properties file to write selenium code
public class JavaSeleniumHW {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		FileInputStream inStream = new FileInputStream(
				"/Users/Bayramgul/eclipse-workspace/JavaBasics/privateinfo.properties");// 3 i need stream
		Properties prop = new Properties();// 2)i need to build input stream to retrive value from property file
		prop.load(inStream);// 4.build stream btw java project and privateInfo.properties file
		String browser = prop.getProperty("browser");// retrieving value from key
		//String url = prop.getProperty("url");
		//String username = prop.getProperty("username");
		//String password = prop.getProperty("password");

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));// 1)i need to pass url as an argument so i need Property class obj
			driver.findElement(By.xpath(("//input[@id='email']"))).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));// 1)i need to pass url as an argument so i need Property class obj
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));

		}

	}

}
