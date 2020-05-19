package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass{
	/*
	 * TC 1: Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 5 rows and 4 columns
Print name of all column headers 
Print data of all rows
Quit Browser
	 */
	public static void main(String[] args) {
		setUp();
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List<WebElement> headerRows=driver.findElements(By.xpath("//table[@class='table']/thead/tr"));//header has 2 rows
		Iterator <WebElement> itHead=headerRows.iterator();
		System.out.println("-----------Header Text------------");
		while(itHead.hasNext()) {
			WebElement header=itHead.next();
			System.out.println(header.getText());
		}
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));//2 cycle of header columns
		System.out.println("-----------The table consists of "+ cols.size()+ " columns----------");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));//list of row elements
		int rowSize=rows.size();
		System.out.println("----------------Table consists of "+rowSize+" rows--------------"); 
		Iterator <WebElement> it=rows.iterator();
		while(it.hasNext()) {
			WebElement el=it.next();
			System.out.println(el.getText());
		}
		
		
		//tearDown();
		
		
		
	}

}
