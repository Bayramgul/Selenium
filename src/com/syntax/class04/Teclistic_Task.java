package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teclistic_Task {
public static String url="https://www.techlistic.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		
		if(title.equals("Techlistic")) {
			System.out.println("The Title is:"+ driver.getTitle()+".Test Passed.");
		}else {
			System.out.println("Title is not valid.Test failed");
		}
		
	
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("You are currently at Techlistic website.Test passed");
		}else {
			System.out.println("You are not on the right website.Test failed.");
		}
		if(driver.getPageSource().contains(title)){
			
		}
		driver.quit();
	}
	

}
