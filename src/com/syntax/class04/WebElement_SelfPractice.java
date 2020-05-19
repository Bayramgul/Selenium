package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_SelfPractice {
	public static String url = "https://www.techlistic.com/p/selenium-practice-form.html";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.clear();
		name.sendKeys("Bayramgul");
		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		lastName.clear();
		lastName.sendKeys("Atageldiyeva");
		WebElement genderB = driver.findElement(By.cssSelector("input#sex-1"));
		if (genderB.isDisplayed() && genderB.isEnabled() && !genderB.isSelected()) {
			genderB.click();
		} else {
			System.out.println("This button is either not displayed,not enabled or is selected");
		}
		List<WebElement> experienceList = driver.findElements(By.xpath("//input[@name='exp']"));
		int ListSize = experienceList.size();
		System.out.println("Number of experience radio buttons are: " + ListSize);
		String actualValue = "exp-6";
		// WebElement RadioBT=driver.findElement(By.cssSelector("input#exp-6"));

		for (WebElement experience : experienceList) {
			String value = experience.getAttribute("id");
			if (value.equals(actualValue)) {
				experience.click();
				break;
			}
		}
		WebElement testerRB=driver.findElement(By.cssSelector("input#profession-1"));
		if(testerRB.isEnabled()) {
			testerRB.click();
		}else {
			System.out.println("This button is disabled");
		}
		List<WebElement> toolList=driver.findElements(By.xpath("//input[@name='tool']"));
		String actualVal="tool-2";
		for(WebElement tool:toolList) {
			String expectedVal=tool.getAttribute("id");
			if(expectedVal.equals(actualVal)) {
				tool.click();break;
			}
		}
		driver.quit();
	}

}
