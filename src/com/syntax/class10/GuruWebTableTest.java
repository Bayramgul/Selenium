package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class GuruWebTableTest extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		List<WebElement> links=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		for(WebElement link:links) {
			String linkText=link.getText();
			waitForClickability(link);
			System.out.println(linkText);
			//driver.findElement(By.linkText(linkText)).click();
				link.click();	
			
		
			break;
		}

	}

}
