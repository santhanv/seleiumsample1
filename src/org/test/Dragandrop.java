package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement t1 = driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
		WebElement drag1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement t2 = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement t3 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		WebElement drag2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement t4 = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		
		
		a.dragAndDrop(bank, t1).dragAndDrop(drag1, t2).dragAndDrop(sales, t3).dragAndDrop(drag2, t4).build().perform();
		
		
	}

}
