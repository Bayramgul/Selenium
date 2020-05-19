package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class Selenium_Review_HW extends BaseClass {
	/*
	 * Go to facebook.com
Verify “Create a new account” is Displayed
Fill out First name, lastname, email, new password
Select your birthday from given dropdowns
Select gender
Click sign up
	 */

	public static void main(String[] args) throws InterruptedException {
		setUp();
		WebElement forgotAccBTN=driver.findElement(By.partialLinkText("Forgot account?"));
		forgotAccBTN.click();
		Thread.sleep(1000);
		WebElement cancelBTN=driver.findElement(By.partialLinkText("Cancel"));
		cancelBTN.click();
	List<WebElement> allBtns=driver.findElements(By.cssSelector("a[role='button']"));
	String actualText="Create New Account";
	for(WebElement button:allBtns) {
		String bText=button.getText();
		//System.out.println( bText);
		if(bText.equals(actualText)) {
			System.out.println("Create New Account is displayed: "+ button.isDisplayed());
			button.click();
			break;
		}
	}
	String name=ConfigsReader.getProperty("name");
	String lastname=ConfigsReader.getProperty("lastname");
	String password=ConfigsReader.getProperty("password");
	String email=ConfigsReader.getProperty("email");
	WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
	firstName.clear();
	firstName.sendKeys(name);
	WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastName.clear();
	lastName.sendKeys(lastname);
	WebElement  Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));//input[name='reg_email__']
	Email.clear();
	Email.sendKeys(email);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys(email);
	WebElement Password=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));//reg_passwd__
	Password.clear();
	Password.sendKeys(password);
	
	WebElement monthDD=driver.findElement(By.id("month"));
	
	Select selectM=new Select(monthDD);
	selectM.selectByVisibleText("Nov");
	
	WebElement dayDD=driver.findElement(By.id("day"));
	Select selectD=new Select(dayDD);
	selectD.selectByIndex(1);
	Thread.sleep(1000);
	WebElement yearDD=driver.findElement(By.id("year"));
	Select selectY=new Select(yearDD);
	selectY.selectByValue("1992");
	Thread.sleep(2000);
	List<WebElement> genders=driver.findElements(By.cssSelector("input[name='sex']"));
	for(WebElement gender:genders) {
		String value=gender.getAttribute("value");
		
		if(value.equals("1")) {
			Thread.sleep(1000);
			gender.click();
		}
	}
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
//tearDown();
	}

}
