/**
 * 
 */
package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author tpoulaya
 *
 */
public class ConfigReader {

	private Properties prop;
	
	/**
	 * This method is use to load the properties from config.properties file 
	 * @return it returns Properties prop object
	 */
	public Properties init_Prop() {
		prop = new Properties();
		try {
		FileInputStream fInS = new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(fInS);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
}
