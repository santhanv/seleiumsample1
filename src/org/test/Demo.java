package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Actions act = new Actions(d);
		WebElement login = d.findElement(By.xpath("//input[@type='email']"));
		act.keyDown(login, Keys.SHIFT).build().perform();
		act.sendKeys(login, "santhanve").build().perform();
		act.keyDown(login, Keys.SHIFT).build().perform();
		
		act.doubleClick(login).contextClick(login).build().perform();
		
		//WebElement next = d.findElement(By.xpath("(//button[@type='button'])[3]"));
		//act.click(next).build().perform();
	}

}