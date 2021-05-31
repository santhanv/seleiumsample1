package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver d =new EdgeDriver();
		d.get("http://demo.guru99.com/test/guru99home/");
		d.manage().window().maximize();
		
		d.switchTo().frame("a077aa5e");
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement iframe = d.findElement(By.xpath("//img[contains(@src,'Jmete')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", iframe);
		Thread.sleep(2000);
		
		iframe.click();
		d.switchTo().defaultContent();
		
		
		String win1 = d.getWindowHandle();
		Set<String> win2 = d.getWindowHandles();
		for(String s : win2) {
			if(!win1.equals(s)) {
				d.switchTo().window(s);
				WebElement name1 = d.findElement(By.xpath("//h3[text()=' Project Summary']"));
				System.out.println(name1.getText());
				
			}
			Thread.sleep(2000);
			d.switchTo().window(win1);
			WebElement scroll = d.findElement(By.xpath("//a[text()='Demo Site']"));
			js.executeScript("arguments[0].scrollIntoView(true)", scroll);
			WebElement mainname = d.findElement(By.xpath("//font[text()='THIS IS A DEMO PAGE FOR TESTING']"));
			System.out.println(mainname.getText());
		}
	}

}
