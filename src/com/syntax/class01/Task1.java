package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();//return type method,return actual title of amazon
		String actualTitle=driver.getTitle();//reasssure we have amazon title
		String expecteTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		
		if(actualTitle.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more/")) {
			System.out.println(driver.getTitle());
			
			}else {
			System.out.println("Title doestn't match, failed");
		}
		
		
		
	}

}
;