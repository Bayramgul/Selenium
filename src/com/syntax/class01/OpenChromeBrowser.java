package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//all are in java not selnium
		WebDriver driver=new ChromeDriver();//go ahead and open Chrome browser
		driver.get("https://www.facebook.com");//actual
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com";
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.facebook.com")) {
			System.out.println(driver.getTitle());
		}else {
			System.out.println("Wring url is returned");
		}
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
