package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String UserName="Tester";
	public static String  password="test";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement userNam=driver.findElement(By.xpath("//input[contains(@id,'username')]"));//userName textBox
		userNam.clear();
		Thread.sleep(3000);
		userNam.sendKeys(UserName);
		
	WebElement pass=driver.findElement(By.cssSelector("input[name*='$password']"));//password textBox
	pass.clear();
	pass.sendKeys(password);
	
	WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Login']"));//login button
	loginBtn.click();
	
	boolean logoIsDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
	
	if(logoIsDisplayed) {
		System.out.println("Logo is Displayed, Test case passed");
	}else {
		System.out.println("Logo is NOT  Displayed, Test case failed");
	}
	
	WebElement loginInfo=driver.findElement(By.xpath("//div[@class='login_info']"));
	String text=loginInfo.getText();//to retrive the inner text
	if(text.contains(UserName)) {
		System.out.println("User Successfully logged in, Test Case passed");
	}else {
		System.out.println("User is NOT logged in, Test Case Faild");

	}
	
		
	}

}
