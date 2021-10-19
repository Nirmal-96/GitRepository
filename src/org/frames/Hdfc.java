package org.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	List<WebElement> f = driver.findElements(By.tagName("frame"));
	System.out.println("Frames sizze...."+f.size());
	
	
	driver.switchTo().frame(0);
	
	WebElement s = driver.findElement(By.xpath("//input[@type='text']"));
	s.sendKeys("nemo");
	s.submit();
	
	Actions a= new Actions(driver);
	a.contextClick().perform();
	
}
}
