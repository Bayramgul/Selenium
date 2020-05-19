package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class TC1 extends CommonMethods{
	/*
	 * TC 1: Drag and Drop verification
Open chrome browser
Go to “http://www.uitestpractice.com/”
Click on “Droppable” link
Using mouse drag “Drag me to my target” to the “Drop Here”
Close the browser

	 */

	public static void main(String[] args) {
		setUp();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		//driver.navigate().refresh();
		sleep(5);
		//tearDown();
	}

}
