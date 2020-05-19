package com.syntax.class10;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class FileUpload extends BaseClass{

	public static void main(String[] args) {
		setUp();
		//click on File Upload link
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("file-upload"));
		//we use sendkeys() method for uploading a file, pass the filepath inside sendkeys parameter
		driver.findElement(By.id("file-upload")).sendKeys("/Users/Bayramgul/eclipse-workspace/Selenium/ScreenShots/TakeScreenShots.png");
		driver.findElement(By.id("file-submit")).click();
		String textUploaded=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		System.out.println(textUploaded);
	}

}
