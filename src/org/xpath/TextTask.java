package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");
		
		WebElement address = d.findElement(By.xpath("//p[contains(@style,'text')][1]"));
		System.out.println(address.getText());
	}
	
	

}
