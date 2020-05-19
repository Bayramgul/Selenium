package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4 {
	/*
	 * TC 4: Radio Buttons Practice Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
	 * “Radio Button Demo” section. Verify correct radio is clicked Click on any
	 * radio button in “Group Radio Buttons Demo” section. Verify correct checkbox
	 * is clicked Quit browser
	 * 
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]")).click();
		List<WebElement> radioBtns = driver.findElements(By.cssSelector("input[type='radio']"));
		String actualValue = "Female";
		String actualAgeVal = "15 - 50";
		for (WebElement button : radioBtns) {

			if (button.getAttribute("value").equals(actualValue)) {
				button.click();
				System.out.println("Female radio button is clicked.Test Passed.");
			}
			if (button.getAttribute("value").equals(actualAgeVal )) {
				button.click();
				System.out.println("Age group 15-50 is clicked.Test Passed.");
				break;
			}
			
		}
		//driver.quit();

	}
}
