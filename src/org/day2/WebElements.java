package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Swiggy
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.swiggy.com/");
		
		WebElement l = driver.findElement(By.name("location"));
	    l.sendKeys("pallavaram");
		

	}

}
