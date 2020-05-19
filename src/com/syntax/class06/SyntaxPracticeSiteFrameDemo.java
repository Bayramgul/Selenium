package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {
//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html  we used this link
	public static void main(String[] args) {
		WebDriver driver = BaseClass.setUp();
		driver.switchTo().frame("FrameOne");// by name
		boolean LogIsDisplayed = driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo is displayed inside frame one : " + LogIsDisplayed);
		driver.switchTo().defaultContent();
		
		
		//next frame
		driver.switchTo().frame("FrameTwo");//by name
		boolean  enrolBTNisEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enroll button inside frame two is Enabled: "+enrolBTNisEnabled);
		
	}

}
