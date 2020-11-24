package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import com.neotech.utils.BaseClass;

public class TestCase_1  extends com.syntax.util.BaseClass{
	/*
	 * TC 1: Frame verification
1. Open chrome browser]
2. Go to https://demoqa.com/frames
5. Verify headers of both frames
6. Quit browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();
//		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();  //Click on “Alerts, Frame & Windows” link
//		driver.findElement(By.xpath("//span[text()='Frames']")).click();
		driver.switchTo().frame(0);
		WebElement frame1heading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header of frame 1 is:: "+ frame1heading.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement frame2Heading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header of frame 2 is:: "+ frame2Heading.getText());
		
//	tearDown();
		
		
		
	}

}
