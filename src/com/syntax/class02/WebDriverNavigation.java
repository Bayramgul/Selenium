package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");//does exactly same as driver.get(url);redirects from current webpage to expected wp
		driver.navigate().refresh();//same as F5 in browser, it refreshes the current webpage
		driver.navigate().forward();//same as cliking the forward button of any browser, takes to the next page in browser history
		driver.navigate().back();//same as cliking the back button of any browser, takes to the one page back in browser history
	}

}
