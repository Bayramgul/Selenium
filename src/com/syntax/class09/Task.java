package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass {
	/*
	 * TC 1: Table headers and rows verification
Open chrome browser
Go to “https://www.aa.com/homePage.do”
Enter From and To
Select departure as May 14 of 2020
Select arrival as November 8 of 2020
Click on search
Close browser

	 */

	public static void main(String[] args) {
		setUp();
		//click on the calendar
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		//find departing month address
		sleep(2);
String depMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
			// System.out.println(depMonthText);-->May 2020

				while(!depMonthText.equals("May 2020")) {
					driver.findElement(By.xpath("//a[@title='Next']")).click();
					sleep(2);
					//we relocate it so it will be updated after each next
depMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
					
				}
		//cell of depart table
List<WebElement> dTableDays=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
for(WebElement day:dTableDays ) {
	String dayText=day.getText();
	if(dayText.equals("14")) {
		day.click();
		break;
	}
}
driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
String returnMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
while(!returnMonthText.equals("November 2020")) {
	driver.findElement(By.xpath("//a[@title='Next']")).click();
	sleep(2);
	//we relocate it so it will be updated after each next
	returnMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();	
}
//cell of return table
List<WebElement> RtableDays=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
for(WebElement day:RtableDays ) {
	String dayText=day.getText();
	if(dayText.equals("8")) {
		day.click();
		break;
	}
}
	}

}
