package com.syntax.SeleniumReview;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class TC3 extends BaseClass{
/*
 * TC 3: Windows Handling
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Javascript Alerts” link
Click on “Window Popup Modal” link
Click on the “ Follow On Instagram” button
Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
Click on the “Like us On Facebook ” button
Verify title of the page is “Go to Facebook Home” 
Quit the browser
NOTE: Selenium execution could be too fast, please use Thread.sleep or selenium wa
 */
	public static void main(String[] args)  {
		setUp();
		CommonMethods.selectLinkByTagName("a", "Alerts & Modals");
		CommonMethods.selectLinkByTagName("a", "Javascript Alerts");
		CommonMethods.waitForClickability(driver.findElement(By.partialLinkText("Window Popup Modal")));
		driver.findElement(By.linkText( "Window Popup Modal")).click();
		CommonMethods.waitUntilpresenceOfElement(By.linkText("Follow On Instagram"));
		driver.findElement(By.linkText("Follow On Instagram")).click();
		sleep(2);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String > it=windows.iterator();
		String parentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		String intaTitle=driver.getTitle();
		System.out.println(intaTitle);
		if(intaTitle.equals("Syntax Technologies (@syntaxtechs) • Instagram photos and videos" )) {
			System.out.println("Test Passed");
		}
		driver.close();
		driver.switchTo().window(parentId);
		WebElement facebookLgn=driver.findElement(By.linkText("Like us On Facebook"));
		CommonMethods.waitForClickability(facebookLgn);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Set<String> windowIDs=CommonMethods.WindowsHandle();
		Iterator<String> itID=windowIDs.iterator();
		String main=itID.next();
		String facebook=itID.next();
		driver.switchTo().window(facebook);
		String faceTitle=driver.getTitle();
		System.out.println(driver.getTitle());
		if(faceTitle.equals("Syntax Technologies - School - Chantilly, Virginia | Facebook - 13 Reviews - 144 Photos")) {
			System.out.println("Test Passed");
		}
		sleep(2);
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Home")).click();
		//CommonMethods.selectLinkByTagName("a", "Home");
		System.out.println(driver.getTitle());
	}

}
