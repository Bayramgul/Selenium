package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWYunus {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		String path = "/Users/Bayramgul/eclipse-workspace/JavaBasics/configs";
		FileInputStream fin = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fin);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.cssSelector("#u_0_b")).click();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.cssSelector("#u_0_b")).click();
		}
	}

}
