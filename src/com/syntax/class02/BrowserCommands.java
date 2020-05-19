package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();//we create the obj of Chromedriver class
		driver.get("https://www.facebook.com");//will not store the history
		driver.manage().window().maximize();//fullscreen();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.amazon.com/");//will store the history, will have froward and backward button
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		driver.close();
		driver.quit();
	}

}
