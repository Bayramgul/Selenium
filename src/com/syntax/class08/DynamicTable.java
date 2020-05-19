package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DynamicTable extends BaseClass {
//http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");//Tester
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		//only identify the table 
		WebElement table=driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		String expectValue="Bob Feather";

		//Find all rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {//loop over list  based on the size, think like List index with 0
			String rowText=rows.get(i+1).getText();//get text of list and skip first index(first row), bcuz it is a header
			System.out.println(rowText);
System.out.println("______________________");
			if(rowText.contains(expectValue)) {// this if condition is for searching Bob Feather and click it
				//get the rows of first column in the table
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}


		}
		sleep(2);
		driver.close();
		
	}

}
