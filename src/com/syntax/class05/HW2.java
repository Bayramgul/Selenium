package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HW2 {
	/*TC 2: Select and Deselect values
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Select Dropdown List” links
Select value from “Select List Demo” section
Verify value has been selected
Select 4 options from “Multi Select List Demo”
Deselect 1 of the option from the dd
Quit browser

	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver=BaseClass.setUp();
		//List<WebElement> links=driver.findElements(By.cssSelector(" a[data-toggle='dropdown']"));
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.partialLinkText("Select Dropdown List")).click();
		WebElement demoDD=driver.findElement(By.id("select-demo"));
		demoDD.click();
		Select s=new Select(demoDD);
		s.selectByValue("Monday");
	List<WebElement> dayOptions=s.getOptions();
	for(WebElement day:dayOptions) {
		String text=day.getText();
		if(text.equals("Monday")) {
			if(day.isSelected()) {
				System.out.println(text+ " is selected! Test case passed");
			}
		}
	}
	WebElement multiSelect=driver.findElement(By.id("multi-select"));
	Select s1=new Select(multiSelect);
	for(int i=0;i<4;i++) {
		s1.selectByIndex(i);
	}
	s1.deselectByIndex(0);
	BaseClass.tearDown();
	
	
//	List<WebElement> stateOptions=s1.getOptions();
//	for(WebElement state: stateOptions) {
//		
	//}
		
	}

}
