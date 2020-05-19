package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class TC3 extends CommonMethods{
	/*
	 * TC 3: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”
	 */

	public static void main(String[] args) {
		setUp();
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(username, "Admin");
		WebElement  password=driver.findElement(By.xpath("//div[@id='divPassword']/input"));
		sendText(password, "Hum@nhrm123");
		WebElement loginBTN=driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		WaitandClick(loginBTN);
		
	}

}
