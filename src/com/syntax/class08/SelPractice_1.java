package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SelPractice_1 extends BaseClass {
//http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
	public static void main(String[] args) {
		//identifying number of rows and columns
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");//Tester
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
System.out.println("Number of rows is: "+ rows.size());
//1st way of retrieving the header elements:prints one by one
List<WebElement> cols=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//th"));//1)table/tablerow/table head-->HEADER ROW
	System.out.println("Number of columns is :"+cols.size());
	for(WebElement el:cols) {
		System.out.println(el.getText());
	}
	System.out.println("_______________Print the Header_____________________________________");
	//2nd way of retrieving the header elements	:prints like one line as a header, bcuz prints whole row at once 					
	List<WebElement> header=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody/tr[1]"));//header row
	for(WebElement element:header) {
		System.out.println(element.getText());
	}
	System.out.println("____________Print the names of rows using Iterator________________");//including header

	Iterator<WebElement> Itrow=rows.iterator();
	while(Itrow.hasNext())
	{System.out.print(Itrow.next().getText()+" ");
	System.out.println();
	System.out.println("___________________________________________________________________");
		}
	
	
	}

}
