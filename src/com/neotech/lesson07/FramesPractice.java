package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import com.neotech.utils.BaseClass;

public class FramesPractice extends com.syntax.util.BaseClass {
//	#url=https://demoqa.com/nestedframes
	public static void main(String[] args) {
setUp();
driver.switchTo().frame("frame1");  //By Id

//System.out.println(driver.findElement(By.xpath("//iframe[@id='frame1']")).getText());
WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
driver.switchTo().frame(childFrame);
System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText()); // print the text on the child frame

driver.switchTo().defaultContent();


		
	}

}
;