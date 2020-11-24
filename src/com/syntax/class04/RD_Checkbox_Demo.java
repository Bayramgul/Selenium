package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RD_Checkbox_Demo {

	
		public static String url="https://demoqa.com/automation-practice-form";
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
//			 clicking Radio Buttons
			WebElement femaleRD = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
			femaleRD.click();
			Thread.sleep(1000);
			WebElement maleRD = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
			maleRD.click();
			Thread.sleep(1000);
			WebElement otherRD = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
			otherRD.click();
//			clicking checkboxes 
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
//			2.way
//			
//			List<WebElement> RDCheckboxes = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
//			System.out.println("Total number of radio buttons and chekcboxes:: "+ RDCheckboxes.size());
//			for (WebElement element:RDCheckboxes ) {
//				String text=element.getText();
//				System.out.println(text);
//				element.click();
//				if(text.contains("Male")||text.contains("Female")||text.contains("Other")) {
//					element.click();
//				}
//			}
			Thread.sleep(2000);
			driver.close();
		}

	}


