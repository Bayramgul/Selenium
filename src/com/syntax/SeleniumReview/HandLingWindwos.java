package com.syntax.SeleniumReview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HandLingWindwos extends BaseClass{
//url=http://www.seleniumframework.com/Practiceform/
	public static void main(String[] args) {
		setUp();
	WebElement newBrowserTabBtn=driver.findElement(By.xpath("//button[@onclick='newBrwTab()']"));
	//getting parent window id
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
	newBrowserTabBtn.click();
	driver.close();
	//getting all the window handles
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	
	
	while(it.hasNext()) {
		String childWindow=it.next();
		if(!parentWindow.equals(childWindow)) {//if window is not equal to the main window then swicth, checking if there is any other window handle coming up
			driver.switchTo().window(childWindow);
		}
	}
	
	WebElement header=driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing')]"));
	String headerText=header.getText();
	System.out.println(headerText);
	
	}

}
