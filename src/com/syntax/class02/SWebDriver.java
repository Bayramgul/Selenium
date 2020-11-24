package com.syntax.class02;

public interface SWebDriver {
	
	public void get(String url);
	public String getCurrentUrl();

	public void getTitle();
	public void close();


}
