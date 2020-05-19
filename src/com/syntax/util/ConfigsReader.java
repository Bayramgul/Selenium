package com.syntax.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties prop;//we need make Properties 
	//what i need for reading a properties file?
	//1.I need to create a method to read a properties file
	//2.FileInputStream for building a path and i will pass the filePath as a parameter in my method for updating user later
	//there is high chance for file path not be found and throw FilenotFoundException and i need to handle it with try and catch 
	//3.I need object of Properties class and load it with prop.load
	//4.I need another method with return type String for retreiving the values from configs file 
	//so i need to use prop.getProperty(key) and pass the key as an argument to get the value
	public static void ConfigsReader(String filePath) {
		/**
		 * this method reads Configs files by building stream by filepath and loading with Properties class
		 */
		try {
			FileInputStream fis=new FileInputStream( filePath);//building an stream
			prop=new Properties();//creating an object of Properties class
			prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method will return the  String value of key in the configs file
	 * @param key
	 * @return
	 */
	public static String getProperties(String key) {
		return prop.getProperty(key);
		
	}
	
	
}
	

