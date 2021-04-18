package com.telecom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties p;

	public ReadConfig() {
		String path = "C:\\Users\\mahe\\Desktop\\Automation Project\\Telecom\\Telecom\\Config\\config.properties";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			p = new Properties();
			try {
				p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

}
