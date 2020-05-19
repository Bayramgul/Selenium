package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FunctionTest_AddEmployee extends BaseClass {
	/*
	 * Automate following user stories: US 89647: User should be able to login using
	 * valid credentials US 89876: As an admin user should be able to add an
	 * employee
	 */

	public static void main(String[] args) {
		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys(ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys(ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		CommonMethods.waitForClickability(loginBtn);
		loginBtn.click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
		addEmployee.click();

		WebElement empfirstName = driver.findElement(By.id("firstName"));
		empfirstName.clear();
		empfirstName.sendKeys(ConfigsReader.getProperty("firstname"));
		WebElement empLastName = driver.findElement(By.id("lastName"));
		empLastName.clear();
		empLastName.sendKeys(ConfigsReader.getProperty("lastname"));
		
		WebElement loginDetails=driver.findElement(By.id("chkLogin"));
		loginDetails.click();
		
		WebElement EmpUserName=driver.findElement(By.cssSelector("input#user_name"));
		EmpUserName.clear();
		EmpUserName.sendKeys(ConfigsReader.getProperty("empUserName"));
		WebElement empPassword=driver.findElement(By.cssSelector("input#user_password"));
		empPassword.sendKeys(ConfigsReader.getProperty("empPassword"));
		WebElement confirmPass=driver.findElement(By.cssSelector("input#re_password"));
		confirmPass.clear();
		confirmPass.sendKeys(ConfigsReader.getProperty("empPassword"));
		
		WebElement saveBTN=driver.findElement(By.id("btnSave"));
		CommonMethods.waitForClickability(saveBTN);
		saveBTN.click();
		System.out.println("You have added a new Employee. Test Case passed.");

	}

}
