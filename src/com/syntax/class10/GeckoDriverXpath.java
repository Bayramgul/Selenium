package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class GeckoDriverXpath extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(username, "Admin");
		// we can use xpath with gecko driver as well 
	}

}
