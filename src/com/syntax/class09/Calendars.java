package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class Calendars extends BaseClass{

	public static void main(String[] args) {
//https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		//click on the calendar image
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		//let's select the desired moth
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		//since it is a DD we use select class
		Select smonth=new Select(month);
		smonth.selectByVisibleText("Sep");
		//Let's choose a year
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select syear=new Select(year);
		syear.selectByVisibleText("2019");
		//one table address
		WebElement table=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		//all cells
		List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement day:days) {
			String dayVal=day.getText();
			if(dayVal.equals("16")) {
				day.click();
				break;
			}
		}
		
	}

}
