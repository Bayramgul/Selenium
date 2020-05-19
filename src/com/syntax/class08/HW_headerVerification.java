package com.syntax.class08;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

/*
 * TC 1: Table headers and rows verification
Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name and credit card info
Verify updated customers name and credit card number is displayed in table
Close browser

 */
public class HW_headerVerification  extends BaseClass{

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
List<WebElement> tableData=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));
		String actualValue="Susan McLaren";
		for(WebElement data:tableData) {
			String cellText=data.getText();
			if(cellText.equals(actualValue)) {
				System.out.println(cellText +" is present in the table");
				break;
			}
		}
driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]")).click();//edit button
WebElement customerName=driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName"));
CommonMethods.sendText(customerName, "Susan Smith");
WebElement creditCI=driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6"));
CommonMethods.sendText(creditCI, "12344567890");
driver.findElement(By.cssSelector("a#ctl00_MainContent_fmwOrder_UpdateButton")).click();//update button
		
WebElement nameInfo=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));
	if(nameInfo.isDisplayed()) {
		System.out.println(nameInfo.getText()+ " is diplayed : "+nameInfo.isDisplayed());
	}
	WebElement cardInfo=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
	if(cardInfo.isDisplayed()) {
		System.out.println(cardInfo.getText()+ " is diplayed : "+nameInfo.isDisplayed());
	}
	//2nd way
//	List<WebElement> rowInfo=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]"));//6th row elements
//	for(WebElement element:rowInfo) {
//		String celltext=element.getText();
//		sleep(2);
//		if(celltext.equals("Susan Smith")) {
//			System.out.println(celltext+" is displayed in the table");
//		}if(celltext.equals("12344567890")) {
//			System.out.println(celltext+" is displayed in the table");
//		}
//	}
	tearDown();
	}

}
