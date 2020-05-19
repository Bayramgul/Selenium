package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Hw2_DeletEmployee extends BaseClass {
	/*
	 * TC 2: Delete Employee
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Add Employee
Verify Employee has been added
Go to Employee List
Delete added Employee
Quit the browser

	 */

	public static void main(String[] args) {
		setUp();
		WebElement username=driver.findElement(By.id("txtUsername"));
CommonMethods.sendText(username, ConfigsReader.getProperty("username"));
WebElement password=driver.findElement(By.id("txtPassword"));
CommonMethods.sendText(password, ConfigsReader.getProperty("password"));
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
driver.findElement(By.id("menu_pim_addEmployee")).click();
WebElement empfirstName = driver.findElement(By.id("firstName"));
CommonMethods.sendText(empfirstName, "Ayjanaa");
WebElement empLastName = driver.findElement(By.id("lastName"));
CommonMethods.sendText(empLastName, "Alaaaa");
WebElement loginDetails=driver.findElement(By.id("chkLogin"));
loginDetails.click();
//String empID=driver.findElement(By.id("EmployeeID")).getAttribute("value");//this is inner text of value attribute of EmpId, to check this employer in the list

WebElement EmpUserName=driver.findElement(By.cssSelector("input#user_name"));
CommonMethods.sendText(EmpUserName, "Ayaashaaaa");
WebElement empPassword=driver.findElement(By.cssSelector("input#user_password"));
CommonMethods.sendText(empPassword, "AweSOme1234@Studen#t");
WebElement confirmPass=driver.findElement(By.cssSelector("input#re_password"));
CommonMethods.sendText(confirmPass, "AweSOme1234@Studen#t");
WebElement saveBTN=driver.findElement(By.id("btnSave"));
CommonMethods.waitForClickability(saveBTN);
saveBTN.click();
String EmpDetails=driver.findElement(By.id("profile-pic")).getText();// this is the img after sving emp and inner text will give first last name
if(EmpDetails.equals("Ayjanaa Alaaaa ")) {
	System.out.println("Employee is added");
}
sleep(4);
//CommonMethods.waitUntilpresenceOfElement(By.linkText("Employee List"));
driver.findElement(By.linkText("Employee List")).click();
//driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList")).click();
List<WebElement> rowsData=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
String expectValue="Ayjanaa Alaaaa";
for (int i = 1; i < rowsData.size(); i++) {
	sleep(2);
	String rowText=rowsData.get(i-1).getText();

	if(rowText.contains(expectValue)) {
		System.out.println(expectValue+ "is added to Employee List");
		sleep(2);
driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).click();//click checkbox for deleting
		driver.findElement(By.id("btnDelete")).click();
		break;
	}	
	tearDown();
}
	}

}
