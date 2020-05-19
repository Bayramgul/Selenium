package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HW extends BaseClass {
	/*
	 * TC 1: Calendar headers and rows verification Open chrome browser Go to
	 * “https://www.aa.com/homePage.do” Enter From and To Select departure as July
	 * 14 of 2020 Select arrival as November 8 of 2020 Close browser Depart Month
	 * Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div" Depart Month Days
	 * Xpath: //div[contains(@class,
	 * 'ui-corner-left')]/following-sibling::table/tbody/tr/td Next Button Xpath:
	 * //a[@title='Next'] Return Month Xpath: //span[@class='ui-datepicker-month']
	 * Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td You
	 * can put the logic the way you want.
	 */

	public static void main(String[] args) {
		setUp();
		// click on the calendar
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		// find departing month address
		sleep(2);
		boolean found = false;
		while (!found) {
			String depMonthText = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"))
					.getText();
			if (depMonthText.equals("July 2020")) {
				List<WebElement> days = driver.findElements(
						By.xpath("//div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
				for (WebElement day : days) {
					sleep(2);
					String dayText = day.getText();
					if (dayText.equals("14")) {
						day.click();
						found=true;
						break;
					}
				}
			} else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();

			}
		}

	}

}
