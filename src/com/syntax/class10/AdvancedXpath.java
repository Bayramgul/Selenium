package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class AdvancedXpath extends BaseClass {
//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
	public static void main(String[] args) {

		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		// click on the calendar image using advanced xpath
		WebElement calendarBTN = driver.findElement(By.xpath("//input[@id='calFromDate']/following-sibling::img"));
		calendarBTN.click();
	}

}
