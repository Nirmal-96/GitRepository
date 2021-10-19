package org.xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
    d.get("https://www.flipkart.com/ ");
    Thread.sleep(2000);
    
    WebElement s = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
    s.sendKeys("nirmal");
    Thread.sleep(2000);
    System.out.println(s.getAttribute("value"));
    
    WebElement passWord = d.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
    passWord.sendKeys("123456");
		Thread.sleep(2000);
		System.out.println(passWord.getAttribute("value"));
		
		
		WebElement logIn = d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		logIn.click();
		Thread.sleep(2000);
}
}
