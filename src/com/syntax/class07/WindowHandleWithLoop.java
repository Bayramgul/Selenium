package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is:: "+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
		for(int i=1;i<3;i++) {//purpose of this loop is to click 3 times and open new window
			driver.findElement(By.id("button1")).click();
			Thread.sleep(1000);
		}
		
		Set<String >allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles) {//main purpose of this loop is to pass same actions for each window
			System.out.println("Id of the window is: "+handle);
			driver.switchTo().window(handle);
			driver.get("https://ww.google.com");
			Thread.sleep(2000);
			driver.close();
		}
	}

}
