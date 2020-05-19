package com.syntax.SeleniumReview;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class TC1 extends BaseClass{
	/*TC 1: Verify element is clickable
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It's back!” text is displayed   
Close the browser 

	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.findElement(By.partialLinkText("Dynamic Controls")).click();
		CommonMethods.WindowsHandle();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		List<WebElement> buttons=driver.findElements(By.cssSelector("button[type='button']"));
		CommonMethods.clickButton(buttons, "Remove");
		CommonMethods.WindowsHandle();
		WebElement addBTN=driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
		CommonMethods.waitForClickability(addBTN);
		addBTN.click();
		List<WebElement> Buttons=driver.findElements(By.cssSelector("button[type='button']"));
		CommonMethods.clickButton(Buttons, "Add");
		WebElement message=driver.findElement(By.id("message"));
		if(message.isDisplayed()) {
			String text=message.getText();
			System.out.println("The text message : "+text+ "is displayed.PASSED!!!");
		}
		tearDown();
	}
	

}

