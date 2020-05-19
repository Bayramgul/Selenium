package com.syntax.class10;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
//http://testingpool.com/data-types-in-java/
public class TakeScreenShots extends BaseClass{

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
		//Using Selenium we can take screenShots Using ScreenShot interface.
		//1.we need to downcast  WebDriver obj to Screenshot and create a variable of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		//for ex whenever we copy or take the screenshots it is saved inside of clipboard until we paste or put that screenshot somewhere
//2.we have File interface for saving screenshots in selenium, so we use .getScreenshotAs(OutputType.FILE) method for creating that File variable
	File screen=ts.getScreenshotAs(OutputType.FILE);//this will return File type screenshot, this screenshot is hanging there
//3. Copy that file and identify which file and tell the destination file path inside parameters
	try{
		FileUtils.copyFile(screen, new File("ScreenShots/TakeScreenShots.png"));
	}catch(IOException e) {
		e.printStackTrace();
	}
		
		
		  
	
		
	}

}
