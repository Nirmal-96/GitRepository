package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//launching browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//dynamic wait
	
		
		driver.get("https://www.snapdeal.com/ ");//lauching URL
		
		driver.findElement(By.xpath("(//input[@type='text'])[2][1]")).sendKeys("shoes");
		
		driver.findElement(By.xpath("//button[contains(@class,'searchformButton ')]")).click(); //webelement
		
		
		
		
		
	}

}
