package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HW1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
/*
 * TC 1: JavaScript alert text verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Alerts & Modals” links
Click on “Javascript Alerts” links
Click on button in “Java Script Alert Box” section
Verify alert box with text “I am an alert box!” is present
Click on button in “Java Script Confirm Box” section
Verify alert box with text “Press a button!” is present
Click on button in “Java Script Alert Box” section
Enter text in the alert box
Quit browser

 */
		setUp();
		List<WebElement> headerDDs=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		for(WebElement DD:headerDDs) {
			String textDD=DD.getText();
			//System.out.println(textDD);
			if(textDD.equals("Alerts & Modals")) {
				DD.click();
			}
		}
		WebElement JavaScript=driver.findElement(By.partialLinkText("Javascript Alerts"));
		JavaScript.click();
		Thread.sleep(1000);	
		WebElement alertBox=driver.findElement(By.cssSelector("button[class='btn btn-default']"));
		alertBox.click();
		Thread.sleep(1000);	
		Alert alert1=driver.switchTo().alert();
		String aText1=alert1.getText();
		if(aText1.equals("I am an alert box!")) {
			System.out.println("Text on the JavasCript alert box: "+aText1+".Test case passed!");
			alert1.accept();
		}
		Thread.sleep(1000);	
		//confirm alert
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert confirmBAlert=driver.switchTo().alert();
		String confrimText=confirmBAlert.getText();
		if(confrimText.equals("Press a button!")) {
			System.out.println("Text on confirm box: "+confrimText+".Test case passed!");
			confirmBAlert.accept();
		}
		Thread.sleep(2000);
		//prompt alert
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(2000);	
		promptAlert.sendKeys("Bayramgul");
		promptAlert.accept();
		Thread.sleep(3000);		
		
		//tearDown();
		
		
		
		
	}

}
