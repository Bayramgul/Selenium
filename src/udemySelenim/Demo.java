package udemySelenim;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// create Driver object for ChromeDriver class, implements all methods of the WebDriver interface 
		//invoke .exe file: is browser driver file
		///Users/Bayramgul/Documents/Drivers/chromedriver.exe
		//below 2 steps are responsible for invoking the browser
		System.setProperty("webdriver.chrome.driver", "//Users//Bayramgul//eclipse-workspace//Selenium//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://syntaxtechs.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());// to validate if we landed on the correct url 
		Thread.sleep(2000);
		driver.get("http://yahoo.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//closes the current browser 
		driver.quit();////closes the all browsers opened by selenium script
		
	}

}
