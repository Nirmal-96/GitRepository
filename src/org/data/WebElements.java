package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/ ");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Nirmal");
		
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("41235441");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		
		
			
	}

}
