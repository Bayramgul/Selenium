package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class LinkDDs extends BaseClass{
//http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html
	public static void main(String[] args) {
		setUp();
		List<WebElement> DDs=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		for(WebElement drop:DDs) {
			System.out.println(drop.getText());
			if(drop.getText().equals("Input Forms")) {
				drop.click();
			}
		}
	}

}
