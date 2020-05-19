package com.syntax.class05;

import java.util.List;
//url=http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	setUp();
	WebElement weekDD=driver.findElement(By.id("select-demo"));
		Select select=new Select(weekDD);//istedigimz DD hedefe aliyor, by passing the argument
		/*
		 * Selenium provides 3 way to select a value from a DD
		 * 
		 */
		List<WebElement> options=select.getOptions();//-->returns list of webElements 
		System.out.println("Number of options in dropdown is : "+options.size());
		for(int i=0; i<options.size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		//select.selectByValue("Friday");
		select.selectByIndex(1);
		select.selectByVisibleText("Friday");
		Thread.sleep(3000);
		tearDown();
	}

}
