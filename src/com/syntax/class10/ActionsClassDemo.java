package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionsClassDemo extends BaseClass {
//amazon.com
	public static void main(String[] args) {
		//we have Actions class to automate mouse and keyboard operations:click,rightclick,double click, hover over, drag &drop
		setUp();
		WebElement  account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		// we create obj of Actions class and pass the Wendriver obj/driver as a paramter
		Actions action=new Actions(driver);
		//Hover over mouse over Menu
		action.moveToElement(account).perform();//u need to call moveToElement(account) method and perform it 
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));// 
		//validating if hover over is successfully performed
		if(element.getText().contains("Start")) {
			System.out.println("Menu is displayed");
		}else {
			System.out.println("Menu is not displayed");
		}
		
		//How to right click on a element
		action.contextClick(element).perform();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		//1)we hover over on search box2)click on it,3)type sth,4)we use sendKeys() method to perform scroll down
		//by using Keys enum,Keys.ARROW_DOWN, 5)again we use Keys.ENter--> hit enter on keyboard6)we end with perform();
		action.moveToElement(searchBox).click().sendKeys("movies").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		//how to double click on a element.
		//action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		sleep(3);
		action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();
		sleep(5);
		tearDown();
	}

}
