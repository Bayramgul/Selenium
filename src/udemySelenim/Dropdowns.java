package udemySelenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Bayramgul/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html");
		driver.findElement(By.partialLinkText("All Examples")).click();
		driver.findElement(By.partialLinkText("Input Forms")).click();
		driver.findElement(By.partialLinkText("Select Dropdown List")).click();
		//using Select class you can manipulate the dropdowns in websites,whenever webelement has select tag and all dropdowns have option tag
		Select s=new Select(driver.findElement(By.id("select-demo")));
		
		s.selectByValue("Monday");
		//s.selectByIndex(5);
		s.selectByIndex(0);
		s.selectByVisibleText("Thursday");
	}

}
