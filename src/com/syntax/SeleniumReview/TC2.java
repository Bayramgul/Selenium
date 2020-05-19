package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class TC2 extends BaseClass{
/*
 * TC 2: Verify element is enabled
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Click on enable button
Enter “Hello” and verify text is entered successfully
Close the browser 

 */
	public static void main(String[] args) {
		setUp();
		driver.findElement(By.partialLinkText("Dynamic Controls")).click();
		CommonMethods.WindowsHandle();
		List<WebElement> buttons=driver.findElements(By.cssSelector("button[type='button']"));
		CommonMethods.clickButton(buttons, "Enable");
		WebElement text=driver.findElement(By.cssSelector("input[type='text']"));
		CommonMethods.waitForClickability(text);
		CommonMethods.sendText(text, "Hello");
		//CommonMethods.clickButton(buttons, "Disable");
		
		//tearDown();
	}

}
