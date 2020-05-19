package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Contact");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//this works for findElememnt and findElements;we make obj to wait
		driver.findElement(By.linkText("This is a Ajax link")).click();
		String text=driver.findElement(By.className("ContactUs")).getText();
		System.out.println(text);
		
		
	}

}
