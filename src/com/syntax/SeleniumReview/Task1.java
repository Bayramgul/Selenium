package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
		 */
//navigate().to will not wait for loading full page
		setUp();
		WebElement DD=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(DD);
		List<WebElement> options=s.getOptions();//options come from
		for(WebElement option:options) {
			String text=option.getText();
			//System.out.println(text);
			if(text.equals("Books")){
				option.click();
			}
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		List <WebElement> BookCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
		for(WebElement checkbox:BookCheckBoxes) {
			String text=checkbox.getText();
			if(text.equals("Unofficial Cookbook")) {
				
			}
		}
		//WebElement search=driver.findElement(By.partialLinkText("Unofficial Cookbook"));
		
		//search.click();
		tearDown();
	}

}
