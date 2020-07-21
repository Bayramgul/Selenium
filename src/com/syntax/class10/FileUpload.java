package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FileUpload extends BaseClass {
//https://the-internet.herokuapp.com/
	public static void main(String[] args) {
		setUp();
		// click on File Upload link
		driver.findElement(By.linkText("File Upload")).click();
		WebElement chooseFileBTN = driver.findElement(By.id("file-upload"));
		// we use sendkeys() method for uploading a file, pass the filepath inside
		// sendkeys as a parameter, and it must be a String
		chooseFileBTN.sendKeys("/Users/Bayramgul/eclipse-workspace/Selenium/ScreenShots/TakeScreenShots.png");
		driver.findElement(By.id("file-submit")).click();
		String textUploaded = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		System.out.println(textUploaded);
	}

}
