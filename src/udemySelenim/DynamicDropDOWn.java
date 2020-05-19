package udemySelenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDOWn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Bayramgul/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
	}

}
