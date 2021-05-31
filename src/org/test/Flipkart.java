package org.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.flipkart.com/?affid=ideaclano&affExtParam1=sunny&");
		dr.manage().window().maximize();
		try {
			WebElement alert = dr.findElement(By.xpath("//button[text()='✕']"));
			alert.click();
		}catch(Exception e)
		{
			
		}
		Thread.sleep(2000);

		WebElement search = dr.findElement(By.xpath("//input[@type='text']"));
		WebElement button = dr.findElement(By.xpath("//button[@type='submit']"));
		search.sendKeys("mobiles");
		button.click();
		
		Thread.sleep(3000);
		List<WebElement> mnames = dr.findElements(By.xpath("//div[contains(text(),'GB)')]"));
		int i=mnames.size();
		WebElement a;
		for(int j=0; j<i; j++) {
			a= mnames.get(j);
			System.out.println(a.getText());
		}
		WebElement mob = dr.findElement(By.xpath("//div[text()='REDMI 9i (Sea Blue, 64 GB)']"));
		mob.click();
		
		String win1 = dr.getWindowHandle();
		Set<String> win2 = dr.getWindowHandles();
		for(String s : win2) {
			if(!win1.equals(s)) {
				dr.switchTo().window(s);
				WebElement name = dr.findElement(By.xpath("//span[text()='REDMI 9i (Sea Blue, 64 GB)']"));
				String model = name.getText();
				System.out.println(model);
			}
		}
	}

}
