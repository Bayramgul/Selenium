package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is:: "+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();//main page id in string format
		System.out.println("What is the Parent Window Handle? "+parentWindowHandle);//1
		driver.findElement(By.linkText("Follow On Instagram")).click();//2
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();//3
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();//4
		Thread.sleep(1000);
		Set<String> allWindowHandles=driver.getWindowHandles();//it returns Set but implements LinkedHashSet
		System.out.println("What is the Number of Windows opened? "+allWindowHandles.size());
		
		Iterator<String> it=allWindowHandles.iterator();
		while(it.hasNext()) {
			String handle=it.next();
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(1000);
			}
			
		}
		
		Thread.sleep(1000);
		
		
		
		
		
		driver.quit();
	}

}
