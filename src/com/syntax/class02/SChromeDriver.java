package com.syntax.class02;

public class SChromeDriver implements SWebDriver {
//	SChromeDriver(){
//		System.err.println("Opening Chrome Browser...");
//	}

	@Override
	public void get(String url) {
System.out.println("Launching the url:: "+url);		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Retrieving current URL");
		
	}

	@Override
	public void close() {
System.out.println("Closing the current window");		
	}

	@Override
	public void getTitle() {
		
		
	}

}
