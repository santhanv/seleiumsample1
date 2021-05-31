package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", ".//driver//IEDriverServer.exe");
		WebDriver d = new InternetExplorerDriver();
	}

}