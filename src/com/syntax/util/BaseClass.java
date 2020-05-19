package com.syntax.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	// How to execute browser by retrieving values from configs?
	// 1.we need System.getProperty for location of the driver
	// 2.we need to create object of WebDriver for based on the choice of the driver

	public static void setUp() {

		switch ("browser") {
		case "chrome":
			System.getProperty("webdriver.chrome.driver", Constants.CHROME_FILE_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.getProperty("webdriver.chrome.driver", Constants.GECKO_FILE_PATH);
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}
		driver.get(ConfigsReader.getProperties("url"));
	}

}
