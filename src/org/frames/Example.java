package org.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Frames size...."+frames.size());
		
		
		WebElement f1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(f1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nirmal");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Don");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement f2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(f2);
		
		WebElement a = driver.findElement(By.id("animals"));
		Select s=new Select(a);
		s.selectByValue("avatar");
		
		
	
	}

}
