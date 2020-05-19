package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SimpleCalendarDemo extends BaseClass {
	/*
	 * Step 1- Click on calendar
	 * 
	 * Step 2- Get all td of table using findElements method
	 * 
	 * Step 3- using for loop get text of all td elements
	 * 
	 * Step 4- using if else condition we will check specific date
	 * 
	 * Step 5- If date is matched then click and break the loop.
	 */

	public static void main(String[] args) {
		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		CommonMethods.sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		CommonMethods.sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		CommonMethods.waitForClickability(loginBtn);
		loginBtn.click();
		
		driver.findElement(By.linkText("Leave")).click();
		sleep(3);
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		// click on the calendar image
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		// let's select the desired moth
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		// since it is a DD we use select class
		Select smonth = new Select(month);
		smonth.selectByVisibleText("Sep");
		// Let's choose a year
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select syear = new Select(year);
		syear.selectByVisibleText("2019");
		// one table address
		WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		// all cells,select day from the calendar 
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement day : days) {
			String dayVal = day.getText();
			if (dayVal.equals("16")) {
				day.click();
				break;
			}
		}
sleep(5);
tearDown();
	}

}
