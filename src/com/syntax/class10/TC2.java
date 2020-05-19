package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.syntax.utils.CommonMethods;

public class TC2 extends CommonMethods{
	/*
	 * TC 2: Upload file and Take Screenshot
Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot

	 */

	public static void main(String[] args)  {
		setUp();
		WebElement fileChoose=driver.findElement(By.cssSelector("input#gwt-debug-cwFileUpload"));
		fileChoose.sendKeys("/Users/Bayramgul/Desktop");
		WebElement fileupload=driver.findElement(By.xpath("//button[text()='Upload File']"));
		fileupload.click();
		sleep(3);
		Alert alert=driver.switchTo().alert();
		getWaitObject().until(ExpectedConditions.alertIsPresent());
		String alerText=alert.getText();
		System.out.println("Alert text: "+alerText+"Test case Passed");
		alert.accept();
		sleep(2);
		TakesScreenshot("ScreenShots/HRMS/fileipload.png");
	
		
		
		
		
		tearDown();
	}

}
