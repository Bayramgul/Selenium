package com.trial;

public class A_ChromeDriver implements A_WebDriver{

	@Override
	public void get(String url) {
		
		System.out.println("Chrome browser is launching"+url);
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Retreiving curent url ");
		
	}

	@Override
	public void getTitle() {
		
	}

	@Override
	public void close() {
		
	}

	

}
