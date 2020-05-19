package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class TC4 extends CommonMethods {
	/*
	 * TC 4: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
click login button using JS executer.

	 */

	public static void main(String[] args) {
		setUp();
		//preceding sibling xpath 
		WebElement username=driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
		sendText(username, "Admin");
		//preceding sibling xpath 
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(password, "Hum@nhrm123");
		//xpath from uncle relationship
		WebElement loginBtn=driver.findElement(By.xpath("//div[@id='divPassword']/following-sibling::div/input"));
		jsClick(loginBtn);
	
	}

}
