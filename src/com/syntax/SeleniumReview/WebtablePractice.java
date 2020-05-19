package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

//http://testingpool.com/data-types-in-java/
public class WebtablePractice extends BaseClass {

	public static void main(String[] args) {
		setUp();
		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr"));
		int numRows = rows.size();
		System.out.println("Number of rows is " + numRows);
		List<WebElement> cols = driver
				.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[1]/td"));
		int colNum = cols.size();
		System.out.println("Number of rows is " + colNum);
		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j < cols.size(); j++) {
				WebElement cellData = driver.findElement(
						By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				String cellDataText = cellData.getText();
				System.out.println(cellDataText);
				if (j == 2) {// if you only need 2nd column data
					System.out.println(cellDataText);
				}
			}
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
	}

}
