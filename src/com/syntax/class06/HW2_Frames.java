package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HW2_Frames extends BaseClass {
	/*
	 * TC 2: Syntax Frame verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Others” link
Click on “Iframe” link
Click on the “Home” link inside the first frame
Verify “Syntax logo” is displayed in second frame
Quit browser

	 */

	public static void main(String[] args) throws InterruptedException {
		setUp();
		List<WebElement> headerDDs=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		for(WebElement DD:headerDDs) {
			String textDD=DD.getText();
			//System.out.println(textDD);
			if(textDD.equals("Others")) {
				DD.click();
			}
		}
		List<WebElement> DDLinkList=driver.findElements(By.tagName("a"));
		for(WebElement link: DDLinkList) {
			String linkText=link.getText();
			//System.out.println(linkText);
			if(linkText.equals("Iframe")) {
				link.click();
				break;
			}
		}
		driver.switchTo().frame("FrameOne");
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		WebElement logo=driver.findElement(By.cssSelector("img.custom-logo"));
		Thread.sleep(1000);
		if(logo.isDisplayed()) {
			System.out.println("Syntax logo is dislpayed: "+logo.isDisplayed());
		}
		else {
			System.out.println("Logo is NOT displayed");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//tearDown();
	}

}
