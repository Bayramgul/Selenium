package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Calendarhandle extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		WebElement datePickerLink = driver.findElement(By.xpath("//a[text()='Datepicker']"));
		WaitandClick(datePickerLink);
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		WaitandClick(datePicker);
		
		//System.out.println(month.getText());
		String departMonth = "August";
		//WebElement nextBTN = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		
		boolean found = false;
		while (!found) {
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			if (departMonth.equals(month.getText())) {
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
				for (WebElement day : days) {
					String dayText = day.getText();
					if (dayText.equals("10")) {
						day.click();
						found = true;
						break;
					} 
				}

			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
	}
}
