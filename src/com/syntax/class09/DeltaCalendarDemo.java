package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
//https://www.delta.com/
public class DeltaCalendarDemo extends BaseClass{

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.cssSelector("span#calDepartLabelCont")).click();//calendar img
		//find departing month address
		String dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while(!dMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			sleep(2);
			//we relocate it so it will be updated after each next
			 dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		List<WebElement> departCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));//2 tables 1:from table and 2:to table
		for(WebElement day:departCells) {
			String dayText=day.getText();
			if(dayText.equals("15")) {
				day.click();
				break;
			}
		}
		//find returning month address by xpath and get its inner text
		String returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		while(!returnMonth.equals("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			sleep(2);
			//we relocate it so it will be updated after each next
			returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		}
		List<WebElement> returnCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-month-1']/tr/td"));
		for (WebElement returnCell : returnCells) {
			String returntext=returnCell.getText();
			if(returntext.equals("9")) {
				returnCell.click();
				break;
			}
		}
	}

}
