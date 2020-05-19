package udemySelenim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfeFoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/Bayramgul/eclipse-workspace/Selenium/drivers/geckodriver 2");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://syntaxtechs.com");// 1)will navigate to the written url
		driver.manage().window().maximize();// 2)will maximize the opening browser
		System.out.println(driver.getTitle());//3)will print the title of the url
		String url=driver.getCurrentUrl();System.out.println(url);	//4)get current url
		//System.out.println(driver.getPageSource());//5)gives the source of current page
		driver.close();//will close the current page
		driver.quit();

	}

}
