package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaHW2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2. Using xl file that we created to new tour application
		 * (http://www.newtours.demoaut.com/) create a data driven test: Register to an
		 * account using 3-4 different sets of data (exclude passing values to the drop
		 * down and try to use different locators that you know if possible)
		 */
		String filePath = System.getProperty("user.dir") + "/ExcelFiles/Info.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.partialLinkText("REGISTER")).click();
		List<Map<String, String>> lmap = new ArrayList<>();
		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			lmap.add(map);

		}
		
		for (Map<String, String> maps : lmap) {
			Set<String> keys = maps.keySet();
			for (String key : keys) {
				switch (key) {
				case "Name":
					driver.findElement(By.name("firstName")).sendKeys(maps.get(key));
					break;
				case "LastName":
					driver.findElement(By.name("lastName")).sendKeys(maps.get(key));
					break;
				case "Phone":
					driver.findElement(By.name("phone")).sendKeys(maps.get(key));
					break;
				case "Email":
					driver.findElement(By.id("userName")).sendKeys(maps.get(key));
					break;
				case "Address":
					driver.findElement(By.name("address1")).sendKeys(maps.get(key));
					break;
				case "City":
					driver.findElement(By.name("city")).sendKeys(maps.get(key));
					break;
				case "State":
					driver.findElement(By.name("state")).sendKeys(maps.get(key));
					break;
				case "PostalCode":
					driver.findElement(By.name("postalCode")).sendKeys(maps.get(key));
					break;
				case "Username":
					driver.findElement(By.name("email")).sendKeys(maps.get(key));
					break;
				case "Password":
					driver.findElement(By.name("password")).sendKeys(maps.get(key));
					break;
				case "ConfrimPassword":
					driver.findElement(By.name("confirmPassword")).sendKeys(maps.get(key));
					break;
				}
			}
			driver.findElement(By.name("register")).click();// after first map, register each user
		}
	}

}
