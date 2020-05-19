package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FatmaShimshek {

	public static void main(String[] args) throws InterruptedException, IOException {
		String filePath="/Users/Bayramgul/eclipse-workspace/JavaBasics/config/privateinfo.properties";
		//System.out.println(filePath);
				FileInputStream fis=new FileInputStream(filePath);
				Properties prop= new Properties();
				
				prop.load(fis);
				
				String browser =prop.getProperty("browser");
				WebDriver driver=null;
			
				switch(browser.toLowerCase()){
				
				//WebDriver driver=null;
				
				case "chrome":
					System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				driver=new ChromeDriver();
				break;
				case"firefox":
					System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
				driver= new FirefoxDriver();
				break;
				}
				driver.get(prop.getProperty("Url"));
				Thread.sleep(3000);
		       driver.close();
			
	}

}
