package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	//X-path using text
	WebElement text = driver.findElement(By.xpath("//a[text()='Create a Page']"));

	//to get a text
	String txt = text.getText();
	System.out.println(txt);
	
	WebElement crt = driver.findElement(By.xpath("//div[text()=' for a celebrity, band or business.']"));

	System.out.println(crt.getText());
	
	//X-path using text contains
	WebElement fb = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	System.out.println(fb.getText());
	
	//x-path using attribute contains
	WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'em')]"));
	userName.sendKeys("nirmal");
	System.out.println(userName.getAttribute("value"));
	
	WebElement passWord = driver.findElement(By.xpath("//input[contains(@id,'pa')]"));
	passWord.sendKeys("124563");
	
	System.out.println(passWord.getAttribute("value"));
	
	System.out.println(fb.getAttribute("innerText"));
	
	
	
	
		
	}

}
