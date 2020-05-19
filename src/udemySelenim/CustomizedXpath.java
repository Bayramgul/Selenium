package udemySelenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		/*	TagName-->first word in the html line,* any tagName with specified attribute,
		 * Attributes-->@starts with @ symbol and it is the word on the left side of = sign for ex:class, id 
		 * value-->the word on the right side of = sign
		 * for validation-->$("")-Css ; $x("")-xpath; write selecotors inside "" in console in inspect page and check if it is unique
		 */
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Maral");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("maral123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
