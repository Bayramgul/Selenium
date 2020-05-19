package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPrep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		//creating object of WebElement by findElement method of WebDriver, userName text box element in facebook page
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("email");//enters the text for username
		Thread.sleep(2000);
		element.clear();//clears the text entered
		System.out.println("Element is displayed: "+element.isDisplayed());
		System.out.println("Element is enabled: "+element.isEnabled());
		System.out.println("Element is selected: "+element.isSelected());
		//isSelected() is only for input elements such as CheckBoxes, Select Options and RadioButtons. 
		element=driver.findElement(By.id("pass"));//this is password textbox
		element.sendKeys("abc123");
		element=driver.findElement(By.xpath("//input[@value='Log In']"));//this is login button
		element.click();
		element=driver.findElement(By.cssSelector("input#email"));
		element=driver.findElement(By.xpath("//div[@role='alert']"));//this is alert text
		System.out.println("Alert text"+ element.getText());//this will return the alert text when entering invalid username & password
		element=driver.findElement(By.id("email"));//this is email text box
		String idValue=element.getAttribute("id");
		System.out.println("id Value: "+idValue);
	}

}
