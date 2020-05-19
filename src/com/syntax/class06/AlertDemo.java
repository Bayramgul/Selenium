package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {
	//Below code is from link http://uitestpractice.com/Students/Switchto
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	BaseClass.setUp();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		//Handling simple Alert:accept
		Alert simpleAlert=driver.switchTo().alert();//return Alert type element, alert() method helps to move to alerts webpage
		
		
		String alertText=simpleAlert.getText();
		System.out.println("This is simple alert text:: "+alertText);
		simpleAlert.accept();//any positive answer we use .accept(); method
		//Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		String confirmText=confirmAlert.getText();
		System.out.println("This is confirm Alert text:: "+confirmText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		//Handling Prompt alerts/confirmation alerts : we send keys 
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("This is confirm Alert text:: "+promptAlert.getText());
		promptAlert.sendKeys("Alex");
		promptAlert.accept();//once i accept it the text Alex will be displayed in text box
		Thread.sleep(5000);
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.contains("Alex")) {
			System.out.println("The text was successfully added");
		}else {
			System.out.println("Text was not added");
		}
		BaseClass.tearDown();
	}

}
