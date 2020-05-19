package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionsClassDemo extends BaseClass {

	public static void main(String[] args) {
		//we have Actions class to automate mouse and keyboard operations:click,rightclick,double clidk, hover over, drag &drop
		setUp();
		WebElement  account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		// we create obj of Actions class and pass the Wendriver obj as a paramter
		Actions action=new Actions(driver);
		//Hover over mouse over Menu
		action.moveToElement(account).perform();//u need to call moveToElement(account) method and perform it 
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		if(element.getText().contains("Start")) {
			System.out.println("Menu is displayed");
		}else {
			System.out.println("Menu is not displayed");
		}
		
		//How to right click on a element
		action.contextClick(element).perform();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		action.moveToElement(searchBox).click().sendKeys("movies").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		sleep(5);
		tearDown();
	}

}
