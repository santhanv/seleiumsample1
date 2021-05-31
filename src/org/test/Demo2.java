package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		String t = d.getTitle();
		System.out.println(t);
		System.out.println(d.getCurrentUrl());
	
		WebElement f3 = d.findElement(By.xpath("//a[text()='Forgotten password?']"));
		boolean show = f3.isDisplayed();
		System.out.println(show);
		
		WebElement f1 = d.findElement(By.id("email"));
		f1.sendKeys("santhan@gmail.com");
		String at = f1.getAttribute("type");
		System.out.println(at);
		
		WebElement f2 = d.findElement(By.id("pass"));
		f2.sendKeys("Password");
		
		d.findElement(By.xpath("//input[@id='pass']"));
		WebElement f4 = d.findElement(By.xpath("//button[@type='submit']"));
		f4.click();
		
		Thread.sleep(3000);
		
		WebElement text = d.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		String txt = text.getText();
		if(txt.equals("Facebook helps you connect and share with the people in your life.")) {
			
			System.out.println("is equals");
		}
		
	}

}