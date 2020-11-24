package com.neotech.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class Homework3_Recap extends com.syntax.util.BaseClass {
	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/alerts
		setUp();
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("The simple alert text is: " + confirmAlert.getText());
//		simpleAlert.accept();
		confirmAlert.dismiss();
		//Check that it says it is canceled
		Thread.sleep(2000);
//		tearDown();
	}
}