package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth	
Quit browser
 */
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.setUp();// returns WebDriver
		WebElement months = driver.findElement(By.id("month"));
		Select s=new Select(months);
		List<WebElement> options=s.getOptions();
		if(options.size()-1==12) {
			System.out.println("There is 12 months options");
		}
		//System.out.println(options.size());
		s.selectByVisibleText("Nov");
		
		WebElement days = driver.findElement(By.id("day"));
		Select s1=new Select(days);
		List<WebElement> dayOptions=s1.getOptions();
		//System.out.println(dayOptions.size());
	
		if(dayOptions.size()-1==31) {
			System.out.println("There is 31 days options");
		}
		s1.selectByIndex(1);
		WebElement years = driver.findElement(By.id("year"));
		Select s2=new Select(years);
		List<WebElement> yearOptions=s2.getOptions();
		if(yearOptions.size()-2==115) {
			System.out.println("There is 115 options");
		}
		s2.selectByValue("1989");
		System.out.println(yearOptions.size());
		Thread.sleep(2000);
	}

}
