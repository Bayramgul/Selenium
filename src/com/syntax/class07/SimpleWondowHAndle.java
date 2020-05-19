package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWondowHAndle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is:: "+signUpTitle);
		
		/*
		 * How to get window handle?
		 * In Selenium we have 2 method to get the hand of window.
		 * getWindowHandle()
		 * getWindowHandles()
		 */
		Set<String> AllWindowIds=driver.getWindowHandles();//Returns set of string ids of all windows currently opened by the current instance
		System.out.println("Number of windows opened are:: "+AllWindowIds.size());
		Iterator<String> it=AllWindowIds.iterator();
		String ParentID=it.next();
		String childID=it.next();
		System.out.println("ID of Main window:: "+ ParentID);
		System.out.println("ID of child window:: "+ childID);
		driver.switchTo().window(childID);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child Page Title is:: "+childWindowTitle);
		driver.close();//closes the current browser and off course id too
		
	}

}
