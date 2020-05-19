package com.syntax.SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;
//http://www.seleniumframework.com/Practiceform/
public class HandlingAlerts extends BaseClass {

	public static void main(String[] args) {
		setUp();
		WebElement alertBTn=driver.findElement(By.cssSelector("button#alert"));
		alertBTn.click();
		Alert alert=driver.switchTo().alert();
		sleep(2);
		alert.accept();
		WebElement TimingAlert=driver.findElement(By.id("timingAlert"));
		TimingAlert.click();
		//create obj of WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,20);
		//set conditions for waiting
		wait.until(ExpectedConditions.alertIsPresent());
		//we can use another alert we created above 
		alert.accept();
	}

}
