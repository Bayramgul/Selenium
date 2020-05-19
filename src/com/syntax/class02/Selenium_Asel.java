package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Asel {
// /Users/Bayramgul/eclipse-workspace/JavaBasics/config/privateinfo.properties
	public static void main(String[] args) throws IOException, InterruptedException {
		//String filePath=System.getProperty("user.dir")+"/config/privateinfo.properties";
		//System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream("/Users/Bayramgul/eclipse-workspace/JavaBasics/config/privateinfo.properties");

		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");

		WebDriver driver=null;

		switch(browser.toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
			driver = new FirefoxDriver();
			break;
		}

		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);

		//driver.close();
	}

}
