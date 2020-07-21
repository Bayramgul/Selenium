package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class DragAndDrop extends BaseClass {
//Go to “http://www.uitestpractice.com/”
	public static void main(String[] args) {
		setUp();
		driver.switchTo().frame(0);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	
	//drag a file and drop it in the source. Longer way
	action.clickAndHold(drag).moveToElement(drop).release().perform();
	sleep(3);
	driver.navigate().refresh();
	sleep(3);
	//action.dragAndDrop(drag, drop).perform();
	sleep(5);
	tearDown();
		
	}

}
