package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com/");
		WebElement l = d.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
		l.sendKeys("greens velmurugan");
		l.submit();
		
		
	}

}
