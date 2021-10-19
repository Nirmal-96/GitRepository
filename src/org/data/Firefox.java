package org.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\driver\\chromedriver.exe");
		
        //Amazon
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		//Twitter
		WebDriver d=new ChromeDriver();
		
		d.get("https://twitter.com/");
		
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		d.quit();
		
		//Wikkipedia
		WebDriver c=new ChromeDriver();
		
		c.get("https://www.wikipedia.org/");
		System.out.println(c.getTitle());
		System.out.println(c.getCurrentUrl());
		
		c.quit();
		
	}

}
