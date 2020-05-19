package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticeDropDowns extends BaseClass {

	public static void main(String[] args) {
		setUp();
		List<WebElement> allDDs=driver.findElements(By.tagName("a"));
		for(WebElement oneDD:allDDs) {
			String dd=oneDD.getText();
			System.out.println(dd);
			if(dd.equals("List Box")) {
				oneDD.click();
			}
		}
		List<WebElement> listOfDD=driver.findElements(By.tagName("li"));
		for(WebElement oneItem:listOfDD) {
			String listText=oneItem.getText();
			System.out.println(listText);
			if(listText.equals("Bootstrap List Box")) {
				oneItem.click();
				
			}if(listText.equals("Morbi leo risus")) {
				oneItem.click();
				break;
			}
		}
	}

}
