package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import com.neotech.utils.BaseClass;

public class Windows_Practice  extends com.syntax.util.BaseClass{
	
//	  1.launch link the https://demoqa.com/browser-windows
//	  2.get the title of the main page
//	  3.Click on the tabButton,windowButton and messageWindowButton
//	  4. Switch the control of the webdriver to the opened windows 
//	  5.Print the  window handle opened and close right after that
//	  6. Quit the browser
//	 

	public static void main(String[] args) throws InterruptedException {
		setUp();
		String mainPageTitle=driver.getTitle();
		System.out.println("Main page title is ::  "+mainPageTitle);
		
		String parentPageID=driver.getWindowHandle();// 1st
		System.out.println("What is the parent window handle:: "+parentPageID);
		
		WebElement newTab=driver.findElement(By.id("tabButton")); // 
		newTab.click();// 2nd page
		Thread.sleep(2000);
		WebElement newWindow=driver.findElement(By.id("windowButton"));
		newWindow.click(); ///3rd page
		Thread.sleep(2000);
		
		WebElement messageWindowButton=driver.findElement(By.id("messageWindowButton"));
		messageWindowButton.click(); //4th page
		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("What is the Number of Windows opened?--> "+allWindows.size());
		Iterator<String> it=allWindows.iterator();
		while(it.hasNext()) { //
			String handle=it.next();// 
			
			if(!handle.equals(parentPageID)) {
				driver.switchTo().window(handle);
				//System.out.println(driver.getTitle());
				System.out.println(handle);
				driver.close();
			}
		}
		
		driver.quit();
	}

}
