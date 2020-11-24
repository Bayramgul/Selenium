package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
//#url=http://uitestpractice.com/Students/Switchto     we used this link
public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		/*We can switch to a frame using 3 different methods
		 * 1.By index 
		 * 2.NameOrID
		 * 3.ByWebElement
		 * 
		 */
		//By Index
		driver.switchTo().frame(0);//pass the index number
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		driver.switchTo().defaultContent();//go back to the webpage/main window

		Thread.sleep(3000);
		//By NameorID
		driver.switchTo().frame("iframe_a");//pass the name or id as a String
		name.clear();
		name.sendKeys("Sarmed");
		driver.switchTo().defaultContent();//go back to the webpage/main window
		Thread.sleep(3000);
		//By WebElement 
		WebElement frame_1=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));// finding fram by xpath
		driver.switchTo().frame(frame_1);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();//go back to the webpage/main window
		Thread.sleep(3000);
		tearDown();
	}

}
