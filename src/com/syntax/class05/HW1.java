package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HW1 {
	/*
	 * Amazon Department List Verification Open chrome browser Go to
	 * “http://amazon.com/” Verify how many department options available. Print each
	 * department Select Computers Quit browser
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.setUp();
		WebElement departmentDD = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(departmentDD);
		List<WebElement> options = s.getOptions();
		int count=0;
		for (WebElement option : options) {
			String text=option.getText();
			if (option.isEnabled()) {
				count++;
				System.out.println(text);
			}if(text.equals("Computers")) {
				option.click();
				System.out.println(text +" is selected ");
			}
		}
		System.out.println("Number of the availabe options is:  " + count);
		//System.out.println("Number of the availabe options is:  " + options.size());
		Thread.sleep(2000);
		//BaseClass.tearDown();
	}

}
