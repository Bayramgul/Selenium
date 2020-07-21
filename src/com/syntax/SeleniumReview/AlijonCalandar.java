package com.syntax.SeleniumReview;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class AlijonCalandar extends CommonMethods {

	public static void main(String[] args) throws IOException {
		
		setUp();
		WebElement datePickerLink = driver.findElement(By.xpath("//a[text()='Datepicker']"));
		WaitandClick(datePickerLink);
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		WaitandClick(datePicker);
		//WebElement nextBTN = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		String departMonth = "August";
		while(true) {
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			if (!departMonth.equals(month.getText())) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else {
				break;
			}
		}
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		selectCalendarDate(days, "10");
		driver.switchTo().defaultContent();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("ScreenShots/calendar.png"));
	}

}
