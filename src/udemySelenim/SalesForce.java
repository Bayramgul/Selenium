package udemySelenim;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Bayramgul//eclipse-workspace//Selenium//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Gul");
		driver.findElement(By.name("pw")).sendKeys("Abc1234");
//class names should not have spaces, Selenium will not accept names with spaces->compound classes not accepted/permitted 
		//driver.findElementByClassName("button r4 wide primary").click();//error
//whenever there is duplicate attributes(id,name etc same for many elements) then Selenium will take the top left element's by default without throwing an error 
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	// to get chrome browser ready xpath--> rightclick,copy blue highlighted html code, choose copy xpath to generate xpath
	//xpath can be defined in number of ways
	//when xpath starts with html--> not reliable
	//there is not direct way to get CSS in chrome. you will find it in tool bar below
	
	}

}
