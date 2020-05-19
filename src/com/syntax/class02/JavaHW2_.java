package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaHW2_ {

	public static void main(String[] args) throws IOException, InterruptedException {
		String filePath = System.getProperty("user.dir") + "/ExcelFiles/Info.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");

		List<Map<String, String>> lmap = new ArrayList<>();
		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			driver.findElement(By.partialLinkText("REGISTER")).click();
			for (int c = 0; c < cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			
				switch (key) 
				{
				
				case "First Name ":
					driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get(key));
					break;
				case "LastName":
					driver.findElement(By.name("lastName")).sendKeys(map.get(key));
					break;
				case "Phone":
					driver.findElement(By.name("phone")).sendKeys(map.get(key));
					break;
				case "Email":
					driver.findElement(By.id("userName")).sendKeys(map.get(key));
					break;
				case "Address":
					driver.findElement(By.name("address1")).sendKeys(map.get(key));
					break;
				case "City":
					driver.findElement(By.name("city")).sendKeys(map.get(key));
					break;
				case "State":
					driver.findElement(By.name("state")).sendKeys(map.get(key));
					break;
				case "PostalCode":
					driver.findElement(By.name("postalCode")).sendKeys(map.get(key));
					break;
				case "Username":
					driver.findElement(By.name("email")).sendKeys(map.get(key));
					break;
				case "Password":
					driver.findElement(By.name("password")).sendKeys(map.get(key));
					break;
				case "ConfrimPassword":
					driver.findElement(By.name("confirmPassword")).sendKeys(map.get(key));
					break;
				}
			}
			driver.findElement(By.name("register")).click();// after first map, register each user
			lmap.add(map);
			

		}
		System.out.println(lmap);
	}

}
