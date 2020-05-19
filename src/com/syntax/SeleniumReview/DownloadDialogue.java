package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class DownloadDialogue extends BaseClass{

	public static void main(String[] args) {
		setUp();
		WebElement startDownloadBTn=driver.findElement(By.cssSelector("button#downloadButton"));
		startDownloadBTn.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
		WebElement compltetStatus=driver.findElement(By.xpath("//div[text()='Complete!']"));
		String compltetStatusText=compltetStatus.getText();
		System.out.println(compltetStatusText);
		WebElement CloseBTN=driver.findElement(By.xpath("//button[text()='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseBTN));
		CloseBTN.click();
	}

}
